package pattern_matching

import org.scalatest.funsuite.AsyncFunSuite

class PersonTest extends AsyncFunSuite {
  val person = new Person("Emma", MembershipType.junior)
  person.borrow()
  test("Person.borrow") {
    assert(person.myItems.size === 2, "Membership does not permit to borrow more books")
  }
}
