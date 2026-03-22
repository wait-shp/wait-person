package com.example.mall.model;

import java.time.LocalDateTime;

public class Order {

  /** 订单ID（内存版自增生成） */
  private Long id;

  /** 商品ID */
  private String productId;

  /** 购买数量 */
  private Integer quantity;

  /** 订单金额（示例：单位元） */
  private Double amount;

  /** 订单状态（示例：CREATED） */
  private String status;

  /** 支付状态（mock：SUCCESS） */
  private String paymentStatus;

  /** 创建时间 */
  private LocalDateTime createdAt;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }
}
