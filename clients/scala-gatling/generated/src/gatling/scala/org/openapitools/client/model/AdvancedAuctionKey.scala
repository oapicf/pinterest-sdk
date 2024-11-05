
package org.openapitools.client.model


case class AdvancedAuctionKey (
    /* The catalog retail item id in the merchant namespace */
    _itemId: String,
    _country: Country,
    _language: Language
)
object AdvancedAuctionKey {
    def toStringBody(var_itemId: Object, var_country: Object, var_language: Object) =
        s"""
        | {
        | "itemId":$var_itemId,"country":$var_country,"language":$var_language
        | }
        """.stripMargin
}
