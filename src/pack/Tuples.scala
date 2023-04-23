package pack

object Tuples {
  //tupples is collection of different data types
  val tup1 = (1, "cricket", "football", 4)
  //another way here in tuple3 3 is no of values in tuple
  val tup2 = new Tuple3("cricket", "shuttle", (3, "hockey"))
  def main(args: Array[String]) = {
    println(tup1)
    //accessing values in tuples
    println(tup1._1)
    println(tup1._2)
    println(tup1._3)
    println(tup1._4)
    println(tup2._3)
    //print the values inside the sub tuple
    println(tup2._3._2)
    //iterate through tuple (if you want to iterate a tuple you have to use productiterator)
    tup1.productIterator.foreach(println)
    //another way
    for (x <- tup1.productIterator) {
      println(x)
    }
  }
}