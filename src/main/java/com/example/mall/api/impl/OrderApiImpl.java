package com.example.mall.api.impl;

import com.example.mall.api.OrderApi;
import com.example.mall.dto.OrderRequest;
import com.example.mall.model.Order;
import com.example.mall.service.OrderService;
import jakarta.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class OrderApiImpl implements OrderApi {

  @Resource private OrderService orderService;

  @Override
  public Order createOrder(OrderRequest request) {
    return orderService.createOrder(request);
  }

  @Override
  public List<Order> listOrders() {
    return orderService.listOrders();
  }
}

