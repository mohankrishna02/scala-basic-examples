package pack

object Maps {
  //maps are key value pairs values
  //declaring maps
  val map1: Map[Int, String] = Map(1 -> "Visakhapatnam", 2 -> "Tirupathi", 3 -> "Banglore", 4 -> "Munnar", 5 -> "Ooty")
  //another way of declaring
  val map2 = Map(6 -> "Coorg")
  def main(args: Array[String]) = {
    println(map1)
    println(map2)
    //concat two maps
    println(map1 ++ map2)
    //print the keys of map
    println(map1.keys)
    //print the values of map
    println(map1.values)
    //print the value of particular key
    println(map1(2))
    //iterate through map and print the values in map
    map1.keys.foreach { key =>
      println("Key: " + key)
      println("Value: " + map1(key))
    }
    //another way
    map1.foreach(println)
  }
}