package pack

object ScalaFunctions {

  //in scala functions start with def keyword
  //syntax - def functionname(argument : datatype): return datatype = {}
  def add(x: Int, y: Int): Int = {
    return x + y
  }

  //another way
  def subtract(x: Int, y: Int): Int = {
    x - y //you can skip return statement because scala assumes last statement in function as return statement
  }

  //another way
  def multiply(x: Int, y: Int): Int = x * y

  //another way
  def divide(x: Int, y: Int) = x / y

  def square(x: Int) = x * x

  //functions in objects
  object Math {
    def cube(x: Int): Int = {
      x * x * x
    }
  }
  def main(args: Array[String]) = {
    println("Add function result " + add(10, 20))
    println("Subtract function result " + subtract(10, 20))
    println("Multiply function result " + multiply(10, 20))
    println("Divide function result " + divide(10, 20))
    println("Square function result " + square(10))
    println("Cube function result " + Math.cube(9))
  }
}