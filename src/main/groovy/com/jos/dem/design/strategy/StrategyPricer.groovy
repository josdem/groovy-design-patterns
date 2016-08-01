package com.jos.dem.design.strategy

class StrategyPricer {

  BigDecimal computeTotal(prices, closure){
    BigDecimal total = 0
    for (price in prices){
      if(closure(price)){
        total += price
      }
    }
    total
  }

}
