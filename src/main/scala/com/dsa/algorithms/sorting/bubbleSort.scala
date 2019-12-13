package com.dsa.algorithms.sorting
import com.dsa.algorithms.swapObjects
import scala.io._

object bubbleSort {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readInt()
    val arr = Array.fill(n) {
      StdIn.readInt()
    }
    def bubblesort(arr:Array[Int],num:Int): Unit={
      for (i <- 0 until num-1) {
        for (j <- 0 until num-i-1) {
          if (arr(j) > arr(j+1)) {
            val swapped_pair = new swapObjects
            val result_pair = swapped_pair.swap(arr(j),arr(j+1))
            arr(j) = result_pair(0)
            arr(j+1) = result_pair(1)
          }
        }
      }
    }
    bubblesort(arr,n)
    println(arr.toVector)
  }
}
