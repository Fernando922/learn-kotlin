fun main(){
  val numbers = listOf(1,2,5,7,8,8,8,9,6)
  val setOfNumbers = numbers.toSet()
  println("Set: ${setOfNumbers}")
  val set1 = setOf(1,2,3)
  val set2 = mutableSetOf(3,2,1)
  println("$set1 == $set2: ${set1 == set2}")  //true (mesmo conjunto de items)
  println("Contains 10: ${setOfNumbers.contains(10)}")
}

/*
Set: [1, 2, 5, 7, 8, 9, 6]
[1, 2, 3] == [3, 2, 1]: true
Contains 7: false
*/
