package com.example.mall.dto;

import java.math.BigDecimal;

public class OrderRequest {

    /**
     * 商品 ID
     */
    private String productId;

    /**
     * 购买数量
     */
    private Integer quantity;

    /**
     * 订单金额
     */
    private BigDecimal amount;

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

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
}
