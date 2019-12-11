package com.dsa.algorithms

class swapObjects {
    def swap(a:Int,b:Int): Array[Int]={
      var temp = 0
      var pair = Array(a,b)
      temp = pair(0)
      pair(0) = pair(1)
      pair(1) = temp
      pair
    }
    //test swap functionality
    //val myswap = new swap(3,4)
    //println(myswap.swap())
}
