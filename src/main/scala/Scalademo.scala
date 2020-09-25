object Scalademo {
  def main(args: Array[String]): Unit = {
    val age =2
    for(count <- 1 to 5){
      println(count)
    }
    val list = List(1,2,3,4,5,6,76,43)
    for(travel<-list; if travel<10){
      print(+travel+"\t")
    }
    val result=for{travel<-list; if travel<6} yield {travel*2}
    print("\n"+result)
    //matching expressions
    age match{
      case 20 => println(age)
      case _ => println("error")
    }

  }
}
