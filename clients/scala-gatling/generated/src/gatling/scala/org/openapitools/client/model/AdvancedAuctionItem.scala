
package org.openapitools.client.model


case class AdvancedAuctionItem (
    _bidOptions: AdvancedAuctionBidOptions,
    _country: Country,
    /* The catalog retail item id in the merchant namespace */
    _itemId: String,
    _language: Language
)
object AdvancedAuctionItem {
    def toStringBody(var_bidOptions: Object, var_country: Object, var_itemId: Object, var_language: Object) =
        s"""
        | {
        | "bidOptions":$var_bidOptions,"country":$var_country,"itemId":$var_itemId,"language":$var_language
        | }
        """.stripMargin
}
