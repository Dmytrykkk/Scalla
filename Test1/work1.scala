import scala.util.Random

object RandomListGenerator {
  def generateRandomList(n: Int): List[Int] = {
    val random = new Random()
    List.fill(n)(random.nextInt())
  }

  def main(args: Array[String]): Unit = {
    val n = 5
    val randomList = generateRandomList(n)
    println(s"Cписок з $n елементів: $randomList")

    var maxElement = randomList.head
    var minElement = randomList.head

    for (element <- randomList.tail) {
      if (element > maxElement) {
        maxElement = element
      }
      if (element < minElement) {
        minElement = element
      }
    }

    println(s"Найбільший елемент: $maxElement")
    println(s"Найменший елемент: $minElement")
  }
}
