package pack

object Lists {
  //Lists are immutable which means you cannot change the values in list
  //declaring lists
  val intlst: List[Int] = List(2, 4, 6, 8, 10, 12, 14)
  // another way declairng lists
  val strlst = List("Hello", "Good Morning", "How are you", "Bye")
  def main(args: Array[String]) = {
    println(intlst)
    println(strlst)
    //adding new elements to the list
    println(0 :: intlst)
    println(0 :: 5 :: 3 :: intlst)
    //to concat two lists
    println(List(100, 200) ::: intlst)
    println(intlst ::: strlst)
    //to add elements at the end of list
    println(intlst :+ 500 :+ 1000)
    //to print the first value of list
    println(intlst.head)
    println(strlst.head)
    //to print the last value of list it will print all the values after the first value
    println(intlst.tail)
    println(strlst.tail)
    //to check whether list is empty or not
    println(intlst.isEmpty)
    //custom size list with custom values
    println(List.fill(6)(3))
    //maximum number in the list
    println(intlst.max)
    //iterate the and print the values in list
    intlst.foreach(println)
    //another way to iterate and print the values in list
    for (x <- intlst) {
      println(x)
    }
    //sum of the values in list
    var sum = 0
    intlst.foreach(sum += _)
    println(sum)
  }
}