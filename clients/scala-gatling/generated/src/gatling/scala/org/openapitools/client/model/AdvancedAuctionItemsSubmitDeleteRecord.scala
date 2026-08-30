
package org.openapitools.client.model


case class AdvancedAuctionItemsSubmitDeleteRecord (
    _country: Country,
    /* Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. */
    _errors: Option[List[AdvancedAuctionOperationError]],
    /* The catalog retail item id in the merchant namespace */
    _itemId: String,
    _language: Language,
    _operation: String
)
object AdvancedAuctionItemsSubmitDeleteRecord {
    def toStringBody(var_country: Object, var_errors: Object, var_itemId: Object, var_language: Object, var_operation: Object) =
        s"""
        | {
        | "country":$var_country,"errors":$var_errors,"itemId":$var_itemId,"language":$var_language,"operation":$var_operation
        | }
        """.stripMargin
}
