package com.dsa.algorithms

class swap {
  def swap(a:Int,b:Int): Vector[Int]={
    var temp = null
    var A = a
    var B = b
    temp = A
    A = B
    B = temp
    return Vector(A,B)
  }
}
