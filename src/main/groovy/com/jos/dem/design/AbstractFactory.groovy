package com.jos.dem.design

class AbstractFactory {

  def create(clazz, properties){
    def instance = clazz.newInstance()

    properties.each { name, value ->
      instance."$name" = value
    }

    instance
  }

}
