package pattern_matching

object MembershipType extends Enumeration {
  type Membership = Value
    val junior: MembershipType.Value = Value("junior")
    val regular: MembershipType.Value = Value("regular")
    val senior_citizen: MembershipType.Value = Value("senior citizen")
}
