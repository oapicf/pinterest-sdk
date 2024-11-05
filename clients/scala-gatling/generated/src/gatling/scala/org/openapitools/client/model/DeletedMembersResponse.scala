
package org.openapitools.client.model


case class DeletedMembersResponse (
    /* List of members whose business membership have been terminated. */
    _deletedMembers: Option[List[String]]
)
object DeletedMembersResponse {
    def toStringBody(var_deletedMembers: Object) =
        s"""
        | {
        | "deletedMembers":$var_deletedMembers
        | }
        """.stripMargin
}
