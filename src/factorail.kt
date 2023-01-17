
fun factorail(num:Int): Int
{
    var number=1
    for(i in 1..num)
        number *= i
    return number

}
fun fact(num:Int):Int
{
    println(num)
    if(num<=1)
        return 1
    println(num)
    return fact(num-1)*num

}
    fun main()

{
    println(factorail(0))
    println(fact(12))
}