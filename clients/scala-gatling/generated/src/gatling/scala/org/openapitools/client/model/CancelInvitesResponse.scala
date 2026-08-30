
package org.openapitools.client.model


case class CancelInvitesResponse (
    _items: Option[List[CancelInviteResultItem]]
)
object CancelInvitesResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
