package pack
class test(var name: String, var age: Int)

//class with private varibales
class test1(private var name: String, age: Int) {
  def testname { println(name) }
}

//auxaliray constructors
class aux(var name: String, var age: Int) {
  def this() {
    this("Jerry", 28)
  }

  def this(name: String) {
    this(name, 30)
  }
}
object Classes {
  def main(args: Array[String]) = {
    var test = new test("Jhon", 25)
    println(test.name)
    println(test.age)

    var newtest = new test1("Max", 27)
    newtest.testname

    val aux1 = new aux()
    val aux2 = new aux("Charlie")
    println(aux1.name)
    println(aux1.age)

    println(aux2.name)
    println(aux2.age)
  }
}