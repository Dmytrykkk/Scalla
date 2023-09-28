class ListHuman {
  private var humans: List[Human] = List()

  def addHuman(human: Human): Unit = {
    humans = human :: humans
  }

  def deleteHumanByName(name: String): Unit = {
    humans = humans.filterNot(_.name == name)
  }

  def findHumanByName(name: String): Option[Human] = {
    humans.find(_.name == name)
  }

  def filterHumans(condition: Human => Boolean): List[Human] = {
    humans.filter(condition)
  }

  def printAllHumans(): Unit = {
    humans.foreach(println)
  }
}

object work4 {
  def main(args: Array[String]): Unit = {
    val humanList = new ListHuman()

    val human1 = new Human("Іван", 30, new Address("Вулиця1", "Місто1", "12345"))
    val human2 = new Human("Петро", 25, new Address("Вулиця2", "Місто2", "67890"))
    val human3 = new Human("Марія", 35, new Address("Вулиця3", "Місто3", "54321"))

    humanList.addHuman(human1)
    humanList.addHuman(human2)
    humanList.addHuman(human3)

    println("Всі люди:")
    humanList.printAllHumans()

    println("Пошук людини:")
    val foundHuman = humanList.findHumanByName("Петро")
    foundHuman.foreach(println)

    humanList.deleteHumanByName("Петро")

    println("Люди за 30:")
    val filteredHumans = humanList.filterHumans(h => h.age > 30)
    filteredHumans.foreach(println)
  }
}
