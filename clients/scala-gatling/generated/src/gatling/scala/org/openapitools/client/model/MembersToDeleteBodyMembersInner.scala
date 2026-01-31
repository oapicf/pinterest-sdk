
package org.openapitools.client.model


case class MembersToDeleteBodyMembersInner (
    _businessRole: BusinessRoleForMembers,
    /* Unique identifier of the member */
    _memberId: String
)
object MembersToDeleteBodyMembersInner {
    def toStringBody(var_businessRole: Object, var_memberId: Object) =
        s"""
        | {
        | "businessRole":$var_businessRole,"memberId":$var_memberId
        | }
        """.stripMargin
}
