//Elvis operator (?:) is used to return the not null value
// even the conditional expression is null.
// It is also used to check the null safety of values.


fun main()
{
    var elvis:String?=null
    if(elvis!=null)
        elvis.length
    else
        println("Null")
}