//Elvis operator (?:) is used to return the not null value
// even the conditional expression is null.
// It is also used to check the null safety of values.


fun main()
{/*
    val elvis:String?=null
    if(elvis!=null)
        elvis.length
    else
        println("Null")*/
    val name:String?= null   //null
    val name1= name?.length ?: -1
    println(name1)

}