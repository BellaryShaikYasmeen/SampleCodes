

fun main() {
    fun nextloop(count:Int)
    {
        for(j in 1..count)
        {
            print("L")
        }
    }

    fun ascend(num:Int)
    {
        for( i in 1..num)
        {
            nextloop(i)
            println("")
        }

    }

    fun nextdeloop(count:Int)
    {
        for(j in count downTo(1))
        {
            print("L")
        }
    }
    fun desend(num:Int)
    {
        for(i in num downTo(1))
        {
            nextdeloop(i)
            println("")

        }
    }
    fun issis(num:Int)
    {
        ascend(num-1)
        desend(num)
    }


    ascend(5)
    desend(5)
    println("")
    issis(3)
}
