// P07 (**) Flatten a nested list structure.
//     Example:
//     scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//     res0: List[Any] = List(1, 1, 2, 3, 5, 8)


object P07 {
  def flatten(l: List[Any]): List[Any]= l flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }
}

val list1 = List(1, 1)
val list2 = List(5,8)
val list3 = List(3, list2)
val listToFlatten= List(list1, 2, list3)

P07.flatten(List(List(1, 1), 2, List(3, List(5, 8))))