package pack

object MapFlatmapFilter {
  val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val map = Map(1 -> "Visakhapatnam", 2 -> "Tirupathi", 3 -> "Banglore", 4 -> "Munnar")
  def main(args: Array[String]) = {
    //map is used to iterate the collections(List,Array,Maps,Tuples)
    println(lst.map(x => x * 2))
    println(map.map(x => "hi " + x))
    println(map.mapValues(x => "hi " + x))
    //flatten the list
    println(List(List(1, 2, 3), List(4, 5, 6)))
    println(List(List(1, 2, 3), List(4, 5, 6)).flatten)
    println(lst.map(x => List(x, x + 1)))
    println(lst.flatMap(x => List(x, x + 1)))
    //filter
    println(lst.filter(x => x > 3))
  }
}