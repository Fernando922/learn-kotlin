fun main() {
  val number: Int = 5
  val triple:  (Int) -> Int = {a: Int -> a * 3}
  val triple2: (Int) -> Int = {it * 3}  //quando se recebe 1 parametro
  println(triple(5))

  
  /*
   * Observação: para comparar dois objetos para ordená-los,
   * a convenção é retornar um valor menor que 0 se o primeiro objeto
   * for menor que o segundo, 0 se forem iguais
   * e um valor maior que 0 se o primeiro objeto for maior do que o segundo.
   * */
  val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
  println(peopleNames.sorted())
  println(peopleNames.sortedWith {
      str1: String, str2: String -> str1.length - str2.length
  })
}

/*
15
[Ann, Barbara, Fred, Joe]
[Ann, Joe, Fred, Barbara]
*/
