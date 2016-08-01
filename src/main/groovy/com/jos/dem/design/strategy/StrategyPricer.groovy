package com.jos.dem.design.strategy

class StrategyPricer {

  BigDecimal computeTotal(prices){
    BigDecimal total = 0
    for (price in prices){
      total += price
    }
    total
  }

}
