
package org.openapitools.client.model


case class DeleteBusinessMembershipBody (
    _members: List[DeleteBusinessMembershipMember]
)
object DeleteBusinessMembershipBody {
    def toStringBody(var_members: Object) =
        s"""
        | {
        | "members":$var_members
        | }
        """.stripMargin
}
