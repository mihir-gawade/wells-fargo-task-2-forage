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
public class Portfolio {

  @Id
  @GeneratedValue()
  private long portfolioId;

  @Column(nullable = false)
  private int creationDate;

  @ManyToOne
  @JoinColumn(name = "clientId")
  private Client clientId;

  @OneToMany(mappedBy = "portfolioId")
  private List<Security> security;

  protected Portfolio() {

  }

  public Portfolio(int creationDate) {
    this.creationDate = creationDate;
  }

  public Long getPortfolioId() {
    return portfolioId;
  }

  public int getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(int creationDate) {
    this.creationDate = creationDate;
  }

}
