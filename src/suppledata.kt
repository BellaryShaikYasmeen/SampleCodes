data class suppleData(var data:String,var validity:Int)

fun main()
{
    val obc:suppleData=suppleData("asas",12)
    obc.apply {
        data="dfd"
       validity=1
        println("$data")}
    var a:String?=null
        a?.let {
            println("not null")
            println("Wop-bop-a-loom-a-boom-bam-boom")
        } ?: run {
            println("null")
            println("When things go null, don't go with them")
        }




}
