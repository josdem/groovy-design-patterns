package com.jos.dem.design.factory

class AbstractFactory {

  def create(clazz, properties){
    def instance = clazz.newInstance()

    properties.each { name, value ->
      instance."$name" = value
    }

    instance
  }

}
