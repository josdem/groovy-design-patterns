package com.jos.dem.design.delegation

class Manager {
  @Delegate Worker worker = new Worker()
  @Delegate Expert expert = new Expert()
}
