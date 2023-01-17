class ScopeFunctions {

    var name :String="yasmeen"
    var age:Int=26
}
//with let apply run also\
//the way it refer to context object
//the return value  either 'context object' or 'lambda result'
//lambda result means result som sort of value
//context object doesn't return anything
/***
 * with --> Refer to the context object using "this"::::The return value is 'lambda result'
 * apply----->context object using "this"::::the return value is 'context Object
 * also----> context object using "it"::::::::the return value is 'context Object' (Perform Some Extra Operations)
 * let---->context object using "it"::::::::the return value is 'lambda result'(To avoid Null pointer exception using safe call(?.) )
 * run---->Refer to the context Object using "this"  ::::::::the return value is 'lambda result'(combination of with and let)
 * **/
fun main()
{
    val scope=ScopeFunctions()
    println(scope.name)
    println(scope.age)
  var data:String=  with(scope)
    {
        println(name+age)
        "My life is beautiful"
    }
    println(data)
//with scope function
    val applied=ScopeFunctions().apply {
        name="Apply function return Context object and refers this"
        age=2
    }
    with(applied)
    {
        println(name+age)

    }
///also Function

    var someList:MutableList<Int> = mutableListOf(1,2,3)
    var dea=someList.also {
        it.add(5)
        println("when add 5$someList")
        it.remove(1)
        println("Removed 1 $someList")

    }
    println(someList)
    println(dea)
    //Let funation

    var leFunction:String?="Let Function"
   var scoplet= leFunction?.let {
        println( it.reversed())
        it.length
    }
    println(scoplet)

}
