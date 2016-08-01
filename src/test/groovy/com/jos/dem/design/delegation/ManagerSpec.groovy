package com.jos.dem.design.delegation

import spock.lang.Specification

class ManagerSpec extends Specification {

  void "should work"(){
    given:"A manager"
      Manager manager = new Manager()
    when:"We want to work"
      String action = manager.work()
    then:"We expect to work"
      action == "working..."
  }

}
