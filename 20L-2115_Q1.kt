open class Cricketer(val name: String, val age: Int, val nationality: String) {

    fun print() {
        println("Cricketer Information:")
        println("Name: $name")
        println("Age: $age")
        println("Nationality: $nationality")
    }
}

class Bowler(name: String, age: Int, nationality: String, val wickets: Int, val bowlerRanking: Int) : Cricketer(name, age, nationality) {

    fun getRanking(): Int {
        return bowlerRanking
    }

    override fun print() {
        super.print()
        println("Bowler Information:")
        println("Wickets: $wickets")
        println("Bowler Ranking: $bowlerRanking")
    }
}

class Batsman(name: String, age: Int, nationality: String, val score: Int, val batsmanRanking: Int) : Cricketer(name, age, nationality) {

    fun getRanking(): Int {
        return batsmanRanking
    }

    override fun print() {
        super.print()
        println("Batsman Information:")
        println("Score: $score")
        println("Batsman Ranking: $batsmanRanking")
    }
}

class AllRounder(
    name: String,
    age: Int,
    nationality: String,
    wickets: Int,
    bowlerRanking: Int,
    score: Int,
    batsmanRanking: Int,
    val ranking: Int
) : Bowler(name, age, nationality, wickets, bowlerRanking), Batsman(name, age, nationality, score, batsmanRanking) {

    override fun getRanking(): Int {
        return ranking
    }

    override fun print() {
        super<Bowler>.print()
        super<Batsman>.print()
        println("All-Rounder Information:")
        println("All-Rounder Ranking: $ranking")
    }
}

fun main() {
    val bowler = Bowler("James Anderson", 38, "England", 600, 1)
    val batsman = Batsman("Virat Kohli", 32, "India", 12000, 2)
    val allRounder = AllRounder("Shakib Al Hasan", 34, "Bangladesh", 400, 5, 6000, 10, 3)

    bowler.print()
    println("Bowler Ranking: ${bowler.getRanking()}")

    batsman.print()
    println("Batsman Ranking: ${batsman.getRanking()}")

    allRounder.print()
    println("All-Rounder Ranking: ${allRounder.getRanking()}")
}
