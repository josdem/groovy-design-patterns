package com.jos.dem.design

import spock.lang.Specification

class AbstractFactorySpec extends Specification{

  AbstractFactory abstractFactory = new AbstractFactory()

  void "should create a book instance"(){
    when:"We need an book instance"
      Book book = abstractFactory.create(Book, [title: 'Who moved my cheese?', pages:250])
    then:"We expect results"
    assert book.title == 'Who moved my cheese?'
    assert book.pages == 250
  }

}
