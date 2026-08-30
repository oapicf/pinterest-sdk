
package org.openapitools.client.model


case class UpdateBusinessMembershipsResponse (
    /* List of members with updated business access role. */
    _items: Option[List[BusinessMembershipMember]]
)
object UpdateBusinessMembershipsResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
