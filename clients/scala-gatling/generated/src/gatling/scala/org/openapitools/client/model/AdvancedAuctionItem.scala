
package org.openapitools.client.model


case class AdvancedAuctionItem (
    _country: Country,
    /* The catalog retail item id in the merchant namespace */
    _itemId: String,
    _language: Language,
    _bidOptions: AdvancedAuctionBidOptions
)
object AdvancedAuctionItem {
    def toStringBody(var_country: Object, var_itemId: Object, var_language: Object, var_bidOptions: Object) =
        s"""
        | {
        | "country":$var_country,"itemId":$var_itemId,"language":$var_language,"bidOptions":$var_bidOptions
        | }
        """.stripMargin
}
