
package org.openapitools.client.model


case class ItemProcessingRecord (
    /* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
    _errors: Option[List[ItemValidationEvent]],
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String],
    _status: Option[ItemProcessingStatus],
    /* Array with the validation warnings for the item processing record */
    _warnings: Option[List[ItemValidationEvent]]
)
object ItemProcessingRecord {
    def toStringBody(var_errors: Object, var_itemId: Object, var_status: Object, var_warnings: Object) =
        s"""
        | {
        | "errors":$var_errors,"itemId":$var_itemId,"status":$var_status,"warnings":$var_warnings
        | }
        """.stripMargin
}
