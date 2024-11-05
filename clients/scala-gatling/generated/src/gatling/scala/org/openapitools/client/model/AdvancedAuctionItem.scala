
package org.openapitools.client.model


case class AdvancedAuctionItem (
    /* The catalog retail item id in the merchant namespace */
    _itemId: String,
    _country: Country,
    _language: Language,
    _bidOptions: AdvancedAuctionBidOptions
)
object AdvancedAuctionItem {
    def toStringBody(var_itemId: Object, var_country: Object, var_language: Object, var_bidOptions: Object) =
        s"""
        | {
        | "itemId":$var_itemId,"country":$var_country,"language":$var_language,"bidOptions":$var_bidOptions
        | }
        """.stripMargin
}
