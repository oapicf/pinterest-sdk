
package org.openapitools.client.model


case class AdvancedAuctionItemsGetRecord (
    _country: Country,
    /* The catalog retail item id in the merchant namespace */
    _itemId: String,
    _language: Language
)
object AdvancedAuctionItemsGetRecord {
    def toStringBody(var_country: Object, var_itemId: Object, var_language: Object) =
        s"""
        | {
        | "country":$var_country,"itemId":$var_itemId,"language":$var_language
        | }
        """.stripMargin
}
