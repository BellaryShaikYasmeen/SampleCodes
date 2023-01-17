class A{
    fun prt( S:String, d:Int)
    {
        println("$S,$d")

    }

}


fun main()
{
    fun A.ptr()
    {
        println("new function")

    }
    val obc=A()
    obc.prt("My World",100)
    obc.ptr()

}