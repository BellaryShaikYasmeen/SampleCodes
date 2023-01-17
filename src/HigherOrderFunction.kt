fun his(s:String) {
    println(s)
}
fun prt(s: String,her:(String)->Unit)
{
    her(s)
}
fun man()
{
    prt("Higherorderfunction ",::his)
}
// regular function definition
/*fun printMe(s:String): Unit{
    println(s)
}
// higher-order function definition
fun higherfunc( str : String, myfunc: (String) -> Unit){
// invoke regular function using local name
    myfunc(str)
}
fun main(args: Array<String>) {
    // invoke higher-order function
    higherfunc("GeeksforGeeks: A Computer Science portal for Geeks",::printMe)
}*/

fun high(dth:String)
{
    println("hey")
}
fun resoul( rem:String,high:(String)->Unit)
{
    high(rem)
}
fun higherorder()
{
    resoul("Welcome to the dth ",::high)
}
 class  HigherOrderFunction{
     fun display()
     {
         println("Method in the classs")
     }
 }
fun HigherOrderFunction.outside(){
    println("Method out side theclasss")

}
fun main()
{
    var obc=HigherOrderFunction()
    obc.display()
    obc.outside()
}

