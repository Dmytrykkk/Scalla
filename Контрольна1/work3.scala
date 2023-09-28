class Address(var street: String, var city: String, var zipCode: String) {
  override def toString: String = s"$street, $city, $zipCode"

  def updateAddress(newStreet: String, newCity: String, newZipCode: String): Unit = {
    street = newStreet
    city = newCity
    zipCode = newZipCode
  }
}

class Human(var name: String, var age: Int, var address: Address) {
  override def toString: String = s"Ім'я: $name, Вік: $age, Адреса: ${address.toString}"

  def changeName(newName: String): Unit = {
    name = newName
  }

  def haveBirthday(): Unit = {
    age += 1
  }
}

object work3 {
  def main(args: Array[String]): Unit = {
    val homeAddress = new Address("Вулиця", "Місто", "12345")
    val person = new Human("Іван", 30, homeAddress)

    println("Дані про людину:")
    println(person.toString())

    person.changeName("Іванка")
    person.haveBirthday()

    person.address.updateAddress("Інша вулиця", "Інше Місто", "67890")

    println("Оновлені дані про людину:")
    println(person.toString())
  }
}
