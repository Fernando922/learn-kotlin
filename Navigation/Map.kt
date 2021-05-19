fun main() {                   //chave, valor
  val peopleAges = mutableMapOf<String, Int>(
      "Fred" to 30,
      "Ann" to 23
  )
  peopleAges.put("Barbara", 42)  //criou um novo
  peopleAges["Joe"] = 51  //criou um novo
  peopleAges["Joe"] = 52  //alterou o que já existe
  println(peopleAges)
  println(peopleAges["Joe"])
  
  peopleAges.forEach{  //it representa cada item do map
      println("${it.key} is ${it.value}, ")
  }
  
  println("")
  
  println(peopleAges.map{
      "${it.key} is ${it.value}"
  }.joinToString(", "))
  
  
  val filteredNames = peopleAges.filter {it.key.length < 4} //nomes menores que 4 caracteres
  println(filteredNames)
}

/*
{Fred=30, Ann=23, Barbara=42, Joe=52}
52
Fred is 30, 
Ann is 23, 
Barbara is 42, 
Joe is 52, 

Fred is 30, Ann is 23, Barbara is 42, Joe is 52
{Ann=23,
*/