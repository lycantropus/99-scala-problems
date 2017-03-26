// P08 (**) Eliminate consecutive duplicates of list elements.
//     If a list contains repeated elements they should be replaced with a
//     single copy of the element.  The order of the elements should not be
//     changed.
//
//     Example:
//     scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//     res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)


object P08 {

  def compress[A](l: List[A]): List[A] = l match {

    case Nil       => Nil
    case head :: tail => head :: compress(tail.dropWhile(_ == head))

  }

  // functional magic
  def compressWithFunctional[A](l: List[A]): List[A] =

    l.foldRight(List[A]()) { (head, right) =>
      if (right.isEmpty || right.head != head) head :: right
      else right
    }

}


val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

P08.compress(list)
P08.compressWithFunctional(list)
