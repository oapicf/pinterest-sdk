
package org.openapitools.client.model


case class MembersToDeleteBodyMembersInner (
    /* Unique identifier of the member */
    _memberId: String,
    _businessRole: BusinessRoleForMembers
)
object MembersToDeleteBodyMembersInner {
    def toStringBody(var_memberId: Object, var_businessRole: Object) =
        s"""
        | {
        | "memberId":$var_memberId,"businessRole":$var_businessRole
        | }
        """.stripMargin
}
