package com.example.mall.api;

import com.example.mall.dto.OrderRequest;
import com.example.mall.model.Order;
import java.util.List;

public interface OrderApi {
  Order createOrder(OrderRequest request);

  List<Order> listOrders();
}

