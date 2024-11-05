
package org.openapitools.client.model


case class UpdateMemberAssetsResultsResponseArray (
    /* List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned. */
    _items: Option[List[UpdateMemberAssetsResultsResponseArrayItemsInner]]
)
object UpdateMemberAssetsResultsResponseArray {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
