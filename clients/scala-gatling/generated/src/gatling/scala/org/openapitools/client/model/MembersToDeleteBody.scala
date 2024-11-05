
package org.openapitools.client.model


case class MembersToDeleteBody (
    _members: List[MembersToDeleteBodyMembersInner]
)
object MembersToDeleteBody {
    def toStringBody(var_members: Object) =
        s"""
        | {
        | "members":$var_members
        | }
        """.stripMargin
}
