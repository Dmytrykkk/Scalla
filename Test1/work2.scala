import scala.util.Random

object work2 {
  def generateRandomList(n: Int, seed: Long): List[Int] = {
    val random = new Random(seed)
    List.fill(n)(random.nextInt())
  }

  def main(args: Array[String]): Unit = {
    val n = 5
    val seed = 12345

    val randomList = generateRandomList(n, seed)

    println(s"Список з $n елементів: $randomList")

    val maxVal = randomList.max
    val minVal = randomList.min
    println(s"Максимальне значення: $maxVal")
    println(s"Мінімальне значення: $minVal")

    val filteredList = randomList.filter(_ > 0)
    println(s"Елементи більше 0: $filteredList")

    val findValue = 0
    val foundElement = randomList.find(_ == findValue)
    println(s"Перший елемент, який дорівнює $findValue: $foundElement")

    val hasEvenElement = randomList.exists(_ % 2 == 0)
    println(s"Чи є парний елемент: $hasEvenElement")

    val isEmptyList = randomList.isEmpty
    println(s"Чи є пустий список: $isEmptyList")

    val headElement = randomList.head
    val tailList = randomList.tail
    println(s"Перший елемент: $headElement")
    println(s"Хвіст списку: $tailList")

    val average = randomList.sum / randomList.length
    println(s"Середнє значення: $average")

    val product = randomList.product

    println(s"Добуток всіх елементів: $product")

    println("Еелементи списку:")
    randomList.foreach(println)
  }
}
