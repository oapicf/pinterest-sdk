
package org.openapitools.client.model


case class CreateInvitesResultsResponseArray (
    /* List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. */
    _items: Option[List[CreateInvitesResultsResponseArrayItemsInner]]
)
object CreateInvitesResultsResponseArray {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
