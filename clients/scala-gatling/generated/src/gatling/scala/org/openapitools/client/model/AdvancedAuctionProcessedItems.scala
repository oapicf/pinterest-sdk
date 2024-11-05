
package org.openapitools.client.model


case class AdvancedAuctionProcessedItems (
    /* Catalog id pertaining to all items */
    _catalogId: Option[String],
    /* Array of advanced auction processed items */
    _items: Option[List[AdvancedAuctionProcessedItem]]
)
object AdvancedAuctionProcessedItems {
    def toStringBody(var_catalogId: Object, var_items: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"items":$var_items
        | }
        """.stripMargin
}
