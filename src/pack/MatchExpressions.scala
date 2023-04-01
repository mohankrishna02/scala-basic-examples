package pack

object MatchExpressions {
  def main(args: Array[String]) = {
    val age = 26
    age match {
      case 20 => println("Age is " + age)
      case 26 => println("Age is " + age)
      case 30 => println("Age is " + age)
      case 45 => println("Age is " + age)
      case 35 => println("Age is " + age)
    }

    //match with default
    val num = 44
    num match {
      case 20 => println("Number is " + num)
      case 35 => println("Number is " + num)
      case 25 => println("Number is " + num)
      case 40 => println("Number is " + num)
      case 45 => println("Number is " + num)
      case _  => println("Sorry, Number doesn't match!") //here _ is default
    }

    //another way
    val result = age match {
      case 20 => age
      case 26 => age
      case 30 => age
      case 45 => age
      case 35 => age
      case _  => "does not exist"
    }
    println("Age is " + result)

    //another way
    val i = 5
    i match {
      case 1 | 3 | 5 | 7 | 9  => println("odd")
      case 2 | 4 | 6 | 8 | 10 => println("even")
    }
  }
}