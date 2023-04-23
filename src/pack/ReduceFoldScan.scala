package pack

object ReduceFoldScan {
  val lst1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val lst2 = List("X", "Y", "Z")
  def main(args: Array[String]) = {
    //reduce left method starts from left
    println(lst1.reduceLeft(_ + _))
    println(lst2.reduceLeft(_ + _))
    println(lst1.reduceLeft(_ - _))
    //another way
    println(lst1.reduceLeft((x, y) => x + y))
    println(lst1.reduceLeft((x, y) => x - y))
    //reduce right method same as reduce left but starts from right side
    println(lst1.reduceRight(_ + _))
    println(lst1.reduceRight(_ - _))
    //another way
    println(lst1.reduceRight((x, y) => x + y))
    println(lst1.reduceRight((x, y) => x - y))

    //fold will have fold left and fold right
    //fold is same as reduce method but fold has starting value
    println(lst1.foldLeft(0)(_ + _))
    println(lst1.foldLeft(20)(_ + _))
    println(lst1.foldLeft(20)(_ - _))
    println(lst2.foldLeft("u")(_ + _))

    println(lst1.foldRight(0)(_ + _))
    println(lst1.foldRight(20)(_ + _))
    println(lst1.foldRight(20)(_ - _))
    println(lst2.foldRight("u")(_ + _))

    //scan is also same like reduce and fold but scan will print intermediate results
    println(lst1.scanLeft(0)(_ + _))
    println(lst1.scanLeft(20)(_ + _))
    println(lst1.scanLeft(20)(_ - _))
    println(lst2.scanLeft("u")(_ + _))

    println(lst1.scanRight(0)(_ + _))
    println(lst1.scanRight(20)(_ + _))
    println(lst1.scanRight(20)(_ - _))
    println(lst2.scanRight("u")(_ + _))
  }
}