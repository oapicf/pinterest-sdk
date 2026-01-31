
package org.openapitools.client.model


case class HotelProcessingRecord (
    /* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
    _errors: Option[List[ItemValidationEvent]],
    /* The catalog hotel id in the merchant namespace */
    _hotelId: Option[String],
    _status: Option[ItemProcessingStatus],
    /* Array with the validation warnings for the item processing record */
    _warnings: Option[List[ItemValidationEvent]]
)
object HotelProcessingRecord {
    def toStringBody(var_errors: Object, var_hotelId: Object, var_status: Object, var_warnings: Object) =
        s"""
        | {
        | "errors":$var_errors,"hotelId":$var_hotelId,"status":$var_status,"warnings":$var_warnings
        | }
        """.stripMargin
}
