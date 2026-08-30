
package org.openapitools.client.model


case class DeleteBusinessMembershipMember (
    _businessRole: BusinessRoleForMembers,
    /* Unique identifier of the member */
    _memberId: String
)
object DeleteBusinessMembershipMember {
    def toStringBody(var_businessRole: Object, var_memberId: Object) =
        s"""
        | {
        | "businessRole":$var_businessRole,"memberId":$var_memberId
        | }
        """.stripMargin
}
