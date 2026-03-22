package com.example.mall.service;

import com.example.mall.dto.OrderRequest;
import com.example.mall.model.Order;
import java.util.List;

public interface OrderService {
  Order createOrder(OrderRequest request);

  List<Order> listOrders();
}
