package pack

object WhileandDoWhile {
  def main(args: Array[String]) = {
    //while loop
    println("While Loop :")
    var x = 0
    while (x < 10) {
      println("x = " + x)
      x += 1 // you can write x +=1 as x = x+1
    }

    //do while
    println("Do While Loop :")
    var y = 0
    do {
      println("y = " + y)
      y += 1
    } while (y < 10)

    //difference between while and do while is, in do while the print statement will execute at least once even if the condition doesn't match
    var z = 0
    do {
      println("Hello,How are you?")
      z += 1
    } while (z < 0)
  }
}