
package org.openapitools.client.model


case class BusinessMembershipMember (
    _businessRole: BusinessRoleForMembers,
    /* Unique identifier of the member. */
    _memberId: String
)
object BusinessMembershipMember {
    def toStringBody(var_businessRole: Object, var_memberId: Object) =
        s"""
        | {
        | "businessRole":$var_businessRole,"memberId":$var_memberId
        | }
        """.stripMargin
}
