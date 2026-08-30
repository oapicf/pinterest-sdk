
package org.openapitools.client.model


case class AdvancedAuctionItemsSubmitRecord (
    _bidOptions: AdvancedAuctionBidOptions,
    _country: Country,
    /* Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. */
    _errors: Option[List[AdvancedAuctionOperationError]],
    /* The catalog retail item id in the merchant namespace */
    _itemId: String,
    _language: Language,
    _operation: String,
    /* The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`. */
    _updateMask: List[UpdateMaskBidOptionField]
)
object AdvancedAuctionItemsSubmitRecord {
    def toStringBody(var_bidOptions: Object, var_country: Object, var_errors: Object, var_itemId: Object, var_language: Object, var_operation: Object, var_updateMask: Object) =
        s"""
        | {
        | "bidOptions":$var_bidOptions,"country":$var_country,"errors":$var_errors,"itemId":$var_itemId,"language":$var_language,"operation":$var_operation,"updateMask":$var_updateMask
        | }
        """.stripMargin
}
