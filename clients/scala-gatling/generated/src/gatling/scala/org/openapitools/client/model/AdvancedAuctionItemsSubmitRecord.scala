
package org.openapitools.client.model


case class AdvancedAuctionItemsSubmitRecord (
    _operation: AdvancedAuctionOperation,
    /* The catalog retail item id in the merchant namespace */
    _itemId: String,
    _country: Country,
    _language: Language,
    _bidOptions: AdvancedAuctionBidOptions,
    /* The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`. */
    _updateMask: List[UpdateMaskBidOptionField]
)
object AdvancedAuctionItemsSubmitRecord {
    def toStringBody(var_operation: Object, var_itemId: Object, var_country: Object, var_language: Object, var_bidOptions: Object, var_updateMask: Object) =
        s"""
        | {
        | "operation":$var_operation,"itemId":$var_itemId,"country":$var_country,"language":$var_language,"bidOptions":$var_bidOptions,"updateMask":$var_updateMask
        | }
        """.stripMargin
}
