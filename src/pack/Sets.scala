package pack

object Sets {
  //sets are immutable and values in sets are unique & sets are not orderd, values in sets are not orderd which means there is no index concept in sets
  //declaring the sets
  val myset1 = Set(1, 2, 3, 4, 5, 6, 7, 8, 9)
  //another way
  val myset2: Set[String] = Set("Tom", "Jerry", "Doremon")
  def main(args: Array[String]) = {
    println(myset1)
    println(myset2)
    //add elements to the sets
    println(myset1 + 20 + 30 + 40)
    //sets are unique
    val unset = Set(1, 1, 2, 2, 3, 3, 4, 4, 5, 5)
    println(unset)
    //concat two sets
    println(myset1 ++ myset2)
    //intersect of two sets
    println(myset1.intersect(unset))
    //another way
    println(myset1 & unset)
    //iterate and print the values in set
    myset1.foreach(println)
    //another way
    for (x <- myset1) {
      println(x)
    }
  }
}