package com.jos.dem.design.strategy

import spock.lang.Specification

class StrategyPricerSpec extends Specification {

  StrategyPricer pricer = new StrategyPricer()

  void "should compute prices"(){
    given:"A list of prices"
      def prices = [10, 20, 30, 40, 50]
    when:"We compute total prices"
      BigDecimal total = pricer.computeTotal(prices, {true})
    then:"We expect total"
     150 == total
  }

  void "should compute prices under 35"(){
    given:"A list of prices"
      def prices = [10, 20, 30, 40, 50]
    when:"We compute total prices"
      BigDecimal total = pricer.computeTotal(prices, {it < 35})
    then:"We expect total"
     60 == total
  }

}
