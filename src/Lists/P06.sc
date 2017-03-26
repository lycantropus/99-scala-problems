// P06 (*) Find out whether a list is a palindrome.
//     Example:
//     scala> isPalindrome(List(1, 2, 3, 2, 1))
//     res0: Boolean = true

object P06 {
  def checkPalindrome[A](l:List[A]): Boolean =
    l == l.reverse
}

/// we could do better by getting the first half of the list and comparing it with the first half of the reversed list


var palindromeList=List(1, 2, 3, 2, 1)
var notPalindromeList=List(1, 2, 3, 2, 2)

P06.checkPalindrome(palindromeList)
P06.checkPalindrome(notPalindromeList)