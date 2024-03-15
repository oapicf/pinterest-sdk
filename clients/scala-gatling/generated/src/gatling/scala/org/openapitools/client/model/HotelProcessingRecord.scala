
package org.openapitools.client.model


case class HotelProcessingRecord (
    /* The catalog hotel id in the merchant namespace */
    _hotelId: Option[String],
    /* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
    _errors: Option[List[ItemValidationEvent]],
    /* Array with the validation warnings for the item processing record */
    _warnings: Option[List[ItemValidationEvent]],
    _status: Option[ItemProcessingStatus]
)
object HotelProcessingRecord {
    def toStringBody(var_hotelId: Object, var_errors: Object, var_warnings: Object, var_status: Object) =
        s"""
        | {
        | "hotelId":$var_hotelId,"errors":$var_errors,"warnings":$var_warnings,"status":$var_status
        | }
        """.stripMargin
}
