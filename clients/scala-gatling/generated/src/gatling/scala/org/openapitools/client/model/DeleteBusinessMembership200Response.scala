
package org.openapitools.client.model


case class DeleteBusinessMembership200Response (
    _deletedMembers: Option[List[String]]
)
object DeleteBusinessMembership200Response {
    def toStringBody(var_deletedMembers: Object) =
        s"""
        | {
        | "deletedMembers":$var_deletedMembers
        | }
        """.stripMargin
}
