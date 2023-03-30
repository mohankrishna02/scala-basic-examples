package pack

object IfElse {
  def main(args: Array[String]) = {
    val x = 100
    val y = 200
    if (x == 100) {
      println("Correct, the value is : " + x)
    } else {
      println("Wrong, actual value is : " + x)
    }
    //another way
    var res = ""
    if (x == 100) {
      res = "Correct, the value is 100"
    } else {
      res = "Correct, the value is 100"
    }
    println(res)

    //another way
    val res2 = if (x == 100) "Correct, the value is : " + x else "Correct, the value is : " + x
    println(res2)

    //multiple conditions and(&&) operator it has satisfy both the conditions
    if (x == 100 && y == 300) {
      println("Correct, the value of x and y is : " + x + "," + y)
    } else {
      println("Wrong, the value of x and y is : " + x + "," + y)
    }

    val res3 = if (x == 100 && y == 200) "Correct, the value of x and y is : " + x + "," + y else "Correct, the value of x and y is : " + x + "," + y
    println(res3)

    // or(||) operator it has to satisfy any one of the conditions
    val res4 = if (x == 100 || y == 300) "Correct, the value of x and y is : " + x + "," + y else "Correct, the value of x and y is : " + x + "," + y
    println(res4)

  }
}