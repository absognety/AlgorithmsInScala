package com.dsa.algorithms.sorting
import scala.io._

object insertionSort {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readInt()
    //give space separated integers here
    val arr = Array.fill(n) {
      StdIn.readInt()
    }
    for (v <- 0 until n) {
      var temp = arr(v)
      var u = v
      while (u > 0 && temp < arr(u-1)) {
        arr(u) = arr(u-1)
        u -= 1
      }
      arr(u) = temp
    }
    println(arr.toVector)
  }
}
