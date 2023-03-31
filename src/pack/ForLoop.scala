package pack

object ForLoop {
  def main(args: Array[String]) = {
    //for loop using to method
    println("For Loop using to method :")
    for (i <- 1 to 10) {
      println("The value of i using to method " + i)
    }

    //for loop using untill method
    println("for loop using until method :")
    for (i <- 1 until 10) {
      println("Thae value of using until method " + i)
    }

    //for loop in lists
    println("for loop in lists")
    val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i <- lst) {
      println("The value of i in list " + i)
    }

    //filters using for loop
    println("filters using for loop :")
    for (i <- lst; if i < 5) {
      println("The value of i is " + i)
    }

    //mutliple conditions
    println("multiple conditions :")
    for (i <- 1 to 10; j <- 1 to 5) {
      println("The value of i and j is " + i + "," + j)
    }

    //another way
    val res = for { i <- lst if i < 5 } yield {
      i * i
    }
    println(res)
  }
}