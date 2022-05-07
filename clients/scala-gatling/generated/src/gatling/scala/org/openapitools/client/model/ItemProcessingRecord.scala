
package org.openapitools.client.model


case class ItemProcessingRecord (
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String],
    /* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
    _errors: Option[List[ItemValidationEvent]],
    /* Array with the validation warnings for the item processing record */
    _warnings: Option[List[ItemValidationEvent]],
    _status: Option[ItemProcessingStatus]
)
object ItemProcessingRecord {
    def toStringBody(var_itemId: Object, var_errors: Object, var_warnings: Object, var_status: Object) =
        s"""
        | {
        | "itemId":$var_itemId,"errors":$var_errors,"warnings":$var_warnings,"status":$var_status
        | }
        """.stripMargin
}
