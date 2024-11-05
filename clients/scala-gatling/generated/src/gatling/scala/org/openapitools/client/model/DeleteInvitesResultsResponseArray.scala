
package org.openapitools.client.model


case class DeleteInvitesResultsResponseArray (
    /* List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled. */
    _items: Option[List[DeleteInvitesResultsResponseArrayItemsInner]]
)
object DeleteInvitesResultsResponseArray {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
