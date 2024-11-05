
package org.openapitools.client.model


case class AdvancedAuctionItems (
    /* Response object of item bid options */
    _catalogId: Option[String],
    /* Array with item bid options */
    _items: Option[List[AdvancedAuctionItem]]
)
object AdvancedAuctionItems {
    def toStringBody(var_catalogId: Object, var_items: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"items":$var_items
        | }
        """.stripMargin
}
