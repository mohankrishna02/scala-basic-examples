package pack

object StringInterpolation {
  def main(args:Array[String])= {
    val name = "Elon"
    val age = 50
    println(name + " is " + age + " years old ")
    //another way S string interpolation by using S before the string we can directly write variables insdie the string
    println(s"$name is $age years old")
    //another way f string interpolation type safe interpolation,specifically giving which type we are printing 
    println(f"$name%s is $age%d years old")
    //new line
    println(s"Elon is \n50 years old")
  }
}