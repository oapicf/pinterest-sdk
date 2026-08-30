
package org.openapitools.client.model


case class LocalInventoryOperationResult (
    /* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
    _errors: Option[List[SupplementalItemValidationEvent]],
    /* Catalog item id in the merchant namespace */
    _itemId: String,
    /* Status of the item processing record */
    _status: SupplementalItemProcessingStatus,
    /* Store code for the local inventory item */
    _storeCode: String,
    _supplementalType: String,
    /* Array with the validation warnings for the item processing record */
    _warnings: Option[List[SupplementalItemValidationEvent]]
)
object LocalInventoryOperationResult {
    def toStringBody(var_errors: Object, var_itemId: Object, var_status: Object, var_storeCode: Object, var_supplementalType: Object, var_warnings: Object) =
        s"""
        | {
        | "errors":$var_errors,"itemId":$var_itemId,"status":$var_status,"storeCode":$var_storeCode,"supplementalType":$var_supplementalType,"warnings":$var_warnings
        | }
        """.stripMargin
}
