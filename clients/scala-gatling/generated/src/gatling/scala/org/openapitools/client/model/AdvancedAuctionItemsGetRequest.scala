
package org.openapitools.client.model


case class AdvancedAuctionItemsGetRequest (
    /* Catalog id pertaining to the retail item */
    _catalogId: String,
    /* A list of retail catalog items to fetch bid options for */
    _items: List[AdvancedAuctionItemsGetRecord]
)
object AdvancedAuctionItemsGetRequest {
    def toStringBody(var_catalogId: Object, var_items: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"items":$var_items
        | }
        """.stripMargin
}
