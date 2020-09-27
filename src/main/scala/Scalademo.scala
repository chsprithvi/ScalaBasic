import java.util.Date

import Scalademo.Math.log

object Scalademo {
  object Math{
    def add(x:Int,y:Int):Int={
    x+y
  }
    def sqr(x:Int):Int=x*x
    def cal(x:Int,y:Int,f:(Int,Int)=>Int): Int=f(x,y);


    def log(date:Date, message: String)={
      println(date+"  "+message)
    }
}

  def main(args: Array[String]): Unit = {
    println(Math.add(4,5))
    val res=Math.cal(5, 155, (x,y)=> x max y) //Higher order function
    println(res);

    val date=new Date;
    val newLog=log(date, _:String)
    newLog("The message 1") //partially applied function
    println("hello")
    println("hello2")
  }
