// P05 (*) Reverse a list.
//     Example:
//     scala> reverse(List(1, 1, 2, 3, 5, 8))
//     res0: List[Int] = List(8, 5, 3, 2, 1, 1)

object P05 {

  //pattern matching sauce
  def reversePattern[A](l: List[A]): List[A]= l match {
    case Nil => Nil
    case head :: tail => reversePattern(tail) ::: List(head)
  }

  //scala builtin function
  def reverseBuiltin[A](l: List[A]): List[A] = l.reverse
}

var list = List(1, 1, 2, 3, 5, 8)

P05.reversePattern(list)

P05.reverseBuiltin(list)