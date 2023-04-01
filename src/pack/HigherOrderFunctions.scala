package pack

object HigherOrderFunctions {

  //passing function as a argument and function returning functions called higer order functions
  def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y)

  def math3(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z)

  def main(args: Array[String]) = {
    val add = math(70, 50, (x, y) => x + y)
    val subtract = math(70, 50, (x, y) => x - y)
    val multi = math(70, 50, (x, y) => x * y)
    val maxi = math(70, 50, (x, y) => x max y)
    val mini = math(70, 50, (x, y) => x min y)
    println(add)
    println(subtract)
    println(multi)
    println(maxi)
    println(mini)

    val add3 = math3(70, 50, 80, (x, y) => x + y)
    val subtract3 = math3(70, 50, 80, (x, y) => x - y)
    val multi3 = math3(70, 50, 80, (x, y) => x * y)

    println(add3)
    println(subtract3)
    println(multi3)

    //you can aslo write using wild card notation
    val wiadd = math3(70, 50, 80, _ + _)
    val wisubtract = math3(70, 50, 80, _ - _)
    val wimulti = math3(70, 50, 80, _ * _)

    println(wiadd)
    println(wisubtract)
    println(wimulti)
  }
}