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

  //default values as a agruments in function
  def default(x: Int = 40, y: Int = 50): Int = {
    x + y
  }

  def default1(x: Int = 40, y: Int): Int = {
    x + y
  }

  //no return functions
  def print(x: Int, y: Int): Unit = { // unit means function will not return anything same like void in java
    println(x + y)
  }

  //Anonymous functions
  var anon = (x: Int, y: Int) => x + y

  def main(args: Array[String]) = {
    println("Add function result " + add(10, 20))
    println("Subtract function result " + subtract(10, 20))
    println("Multiply function result " + multiply(10, 20))
    println("Divide function result " + divide(10, 20))
    println("Square function result " + square(10))
    println("Cube function result " + Math.cube(9))
    println("Default values function result " + default())
    println("Default values function result " + default1(40, 10))
    print(50, 50)
    println("Anonymous Function result " + anon(60, 60))
  }
}