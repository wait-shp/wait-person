package com.example.mall.service.impl;

import com.example.mall.dto.OrderRequest;
import com.example.mall.model.Order;
import com.example.mall.service.OrderService;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

  private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

  private final AtomicLong idGenerator = new AtomicLong(1);
  private final List<Order> orders = Collections.synchronizedList(new ArrayList<>());

  @Override
  public Order createOrder(OrderRequest request) {
    log.debug(
        "Creating order (in-memory). productId={}, quantity={}, amount={}",
        request.getProductId(),
        request.getQuantity(),
        request.getAmount());

    Order order = new Order();
    order.setId(idGenerator.getAndIncrement());
    order.setProductId(request.getProductId());
    order.setQuantity(request.getQuantity());
    order.setAmount(request.getAmount());
    order.setStatus("CREATED");
    // mock 支付结果：直接成功
    order.setPaymentStatus("SUCCESS");
    order.setCreatedAt(LocalDateTime.now());

    orders.add(order);
    log.info(
        "Order created (in-memory). orderId={}, paymentStatus={}, createdAt={}",
        order.getId(),
        order.getPaymentStatus(),
        order.getCreatedAt());
    return order;
  }

  @Override
  public List<Order> listOrders() {
    List<Order> copy = new ArrayList<>(orders);
    log.debug("Listing orders (in-memory). size={}", copy.size());
    return copy;
  }
}

