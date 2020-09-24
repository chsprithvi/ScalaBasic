object Scalademo {
  def main(args: Array[String]): Unit = {
    var a: Int = 10
    val name = "mark"
    val age = 22
    print("\nvalue of a=" + a)
    a = 22
    print("\nvalue of a=" + a)
    println("\n" + name + " is " + age + "years.") //print
    println(s"\n $name is $age years.") //with String Interpolation
    println(f"\n $name%s is $age%d years.") //with type safe
    println(s"\nHello world")
    println(raw"\nhello world")
  }
}