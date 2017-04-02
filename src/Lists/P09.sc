// P09 (**) Pack consecutive duplicates of list elements into sublists.
//     If a list contains repeated elements they should be placed in separate
//     sublists.
//
//     Example:
//     scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//     res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

object P09 {

  def pack[A](l: List[A]): List[List[A]] = {
    if (l.isEmpty) List(List())
    else {
      val (packed, next) = l span { _ == l.head}
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
}

var list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

P09.pack(list)