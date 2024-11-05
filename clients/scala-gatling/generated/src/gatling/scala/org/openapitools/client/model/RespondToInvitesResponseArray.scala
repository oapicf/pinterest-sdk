
package org.openapitools.client.model


case class RespondToInvitesResponseArray (
    /* List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned. */
    _items: Option[List[RespondToInvitesResponseArrayItemsInner]]
)
object RespondToInvitesResponseArray {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
