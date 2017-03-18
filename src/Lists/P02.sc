// P02 (*) Find the last but one element of a list.
//     Example:
//     scala> penultimate(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 5

object P02{

  //pattern matching is awesome
  def penultimate[A](l:List[A]): A = l match {
    case head :: _ :: Nil => head
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }
}

P02.penultimate(List(1,1,2,3,5,8))