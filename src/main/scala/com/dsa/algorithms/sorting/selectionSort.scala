package com.dsa.algorithms.sorting
import scala.io.StdIn
import com.dsa.algorithms.swapObjects

object selectionSort {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readInt()
    //give space separated integers here
    val arr = Array.fill(n) {
      StdIn.readInt()
    }
    def selectionSort(arr:Array[Int],num:Int): Unit={
      for (i <- 0 until num-1) {
        var min_idex = i
        for (j <- (i+1) until num) {
          if (arr(j) < arr(min_idex))
            min_idex = j
        }
        val swapped_pair = new swapObjects
        val result_pair = swapped_pair.swap(arr(min_idex),arr(i))
        arr(min_idex) = result_pair(0)
        arr(i) = result_pair(1)
      }
    }
    selectionSort(arr,n)
    println(arr.toVector)
  }
}
