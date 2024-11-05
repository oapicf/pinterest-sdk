
package org.openapitools.client.model


case class AdvancedAuctionItemsSubmitRequest (
    /* Catalog id pertaining to all items */
    _catalogId: String,
    /* Array of item bid option operations */
    _items: List[AdvancedAuctionItemsSubmitRecord]
)
object AdvancedAuctionItemsSubmitRequest {
    def toStringBody(var_catalogId: Object, var_items: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"items":$var_items
        | }
        """.stripMargin
}
