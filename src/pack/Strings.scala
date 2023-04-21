package pack

object Strings {
  val str1 = "Good Morning!"
  val str2 = "How are you?"
  val num1 = 100
  val num2 = 55.5
  def main(args: Array[String]) = {
    //to find the length of the string
    println(str1.length())
    //to concat the two strings
    println(str1.concat(str2))
    //another way to concat the two strings
    println(str1 + str2)
    //string formatting
    println("(%d ==== %f ==== %s)".format(num1, num2, str1))
    //string formatting in another way
    printf("(%d === %f === %s)", num1, num2, str1)
    println()
    //to check whether string is empty or not
    println(str1.isEmpty())
    //to check whether the given word is presented in the string
    println(str1.contains("Good"))
    //to replace the words in string
    println(str1.replace("Morning", "Evening"))
    //split the string using delimeter here i am using space
    val splitstr = str1.split(" ")
    splitstr.foreach(println)
    //to lower case the string
    println(str1.toLowerCase())
    //to upper case the string
    println(str1.toUpperCase())
    //to reverse the string
    println(str1.reverse)
  }
}