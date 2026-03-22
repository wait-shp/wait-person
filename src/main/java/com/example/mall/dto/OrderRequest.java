package com.example.mall.dto;

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
    private Double amount;

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
}
