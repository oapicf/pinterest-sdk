
package org.openapitools.client.model


case class UpdatePartnerResultsResponseArray (
    _items: Option[List[UpdatePartnerResultsResponseArrayItemsInner]]
)
object UpdatePartnerResultsResponseArray {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
