package com.example.mall.controller;

import com.example.mall.api.OrderApi;
import com.example.mall.dto.OrderRequest;
import com.example.mall.model.Order;
import java.util.List;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

  private static final Logger log = LoggerFactory.getLogger(OrderController.class);

  @Resource private OrderApi orderApi;

  @PostMapping
  public ResponseEntity<Order> create(@RequestBody OrderRequest request) {
    //http://localhost:8080/order.html
    log.info(
        "Create order request received. productId={}, quantity={}, amount={}",
        request.getProductId(),
        request.getQuantity(),
        request.getAmount());
    Order order = orderApi.createOrder(request);
    log.info(
        "Create order finished. orderId={}, paymentStatus={}, status={}",
        order.getId(),
        order.getPaymentStatus(),
        order.getStatus());
    return ResponseEntity.ok(order);
  }

  @GetMapping
  public ResponseEntity<List<Order>> list() {
    List<Order> orders = orderApi.listOrders();
    log.info("List orders. size={}", orders.size());
    return ResponseEntity.ok(orders);
  }
}
