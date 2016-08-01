package com.jos.dem.design.factory

import spock.lang.Specification

class AbstractFactorySpec extends Specification {

  AbstractFactory abstractFactory = new AbstractFactory()

  void "should create a book instance"(){
    when:"We need an book instance"
      Book book = abstractFactory.create(Book, [title: 'Who moved my cheese?', pages:250])
    then:"We expect results"
    assert book.title == 'Who moved my cheese?'
    assert book.pages == 250
  }

  void "should create a CD instance"(){
    when:"We need an book instance"
      CompactDisc cd = abstractFactory.create(CompactDisc, [title: 'Tri-state', volume: 1])
    then:"We expect results"
    assert cd.title == 'Tri-state'
    assert cd.volume == 1
  }

}
