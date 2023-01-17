class Player(val name:String,val surname:String) {
    var totalScore = 0
    var personalScore = 0
    fun fullName(): String {
        return name + surname
    }
}
class Score()
{
    fun checkbest(best:Int,current:Int):Int
    {
        if (best>current)
            return best
        return current
    }
}
fun main()
{
    val P1=Player("Yasmeen","Shaik")
    val P2=Player("Shaik","Bellary")
    println( P1.fullName())
    val score=Score()
    var lvlscore=0
    P1.totalScore=+lvlscore
    P1.personalScore=score.checkbest(P1.personalScore,lvlscore)
    lvlscore=90
    P2.totalScore=+lvlscore
    P2.personalScore=score.checkbest(P2.personalScore,lvlscore)
     lvlscore=10
    P1.totalScore=+lvlscore
    P1.personalScore=score.checkbest(P1.personalScore,lvlscore)
    lvlscore=50
    P2.totalScore=+lvlscore
    P2.personalScore=score.checkbest(P2.personalScore,lvlscore)

     lvlscore=12
    P1.totalScore=+lvlscore
    P1.personalScore=score.checkbest(P1.personalScore,lvlscore)
    lvlscore=23
    P2.totalScore=+lvlscore
    P2.personalScore=score.checkbest(P2.personalScore,lvlscore)

    if(P1.totalScore>P2.totalScore)
    {
      print("the Winner is "+P1.fullName()+"with a score of "+P1.totalScore)
        println("Personal Best score"+P1.personalScore)
    }

    else
    {
        print("the Winner is " + P2.fullName() + "with a score of " + P2.totalScore)
        println("Personal Best score" + P2.personalScore)
    }


}