package pack
import Array._
object Arrays {
  //declaring an array
  val arr1 = new Array[Int](5)
  //another way of declaring an array
  val arr2 = Array(60, 70, 80, 90, 100, 200, 300)
  def main(args: Array[String]) = {
    arr1(0) = 10
    arr1(1) = 20
    arr1(2) = 30
    arr1(3) = 40
    arr1(4) = 50
    arr1.foreach(println)
    arr2.foreach(println)
    //to find the length of array
    println(arr2.length)
    //concat of two arrays
    val concatrr = concat(arr1, arr2)
    concatrr.foreach(println)
    //reverse the array
    val revarr = arr2.reverse
    revarr.foreach(println)
  }
}