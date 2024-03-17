package com.wellsfargo.counselor.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Security {

  @Id
  @GeneratedValue()
  private long securityId;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String category;

  @Column(nullable = false)
  private int purchasePrice;

  @Column(nullable = false)
  private int purchaseDate;

  @Column(nullable = false)
  private int quantity;

  @ManyToOne
  @JoinColumn(name = "portfolioId")

  private Portfolio portfolioId;

  public Security() {
  }

  public Security(String name, String category, int purchasePrice, int purchaseDate, int quantity) {
    this.name = name;
    this.category = category;
    this.purchasePrice = purchasePrice;
    this.purchaseDate = purchaseDate;
    this.quantity = quantity;
  }

  public long getSecurityId() {
    return securityId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(int purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public int getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(int purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

}
