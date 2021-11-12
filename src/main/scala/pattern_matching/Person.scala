package pattern_matching

class Person (val name: String, membershipType: MembershipType.Membership) {
  var myItems: List[String] = List()

  def borrow() =
    membershipType match {
      case MembershipType.junior => if (myItems.size < 2) Library.items.map(i => myItems:+i)
      case MembershipType.regular => if (myItems.size < 2) Library.items.map(i => myItems.+(i))
      case MembershipType.senior_citizen => if (myItems.size <= 10) Library.items.map(i => myItems.+(i))
      case _ => println("Unknown membership type")
    }
}
