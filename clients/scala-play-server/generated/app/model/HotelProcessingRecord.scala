package model

import play.api.libs.json._

/**
  * Object describing an item processing record
  * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param warnings Array with the validation warnings for the item processing record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class HotelProcessingRecord(
  errors: Option[List[ItemValidationEvent]],
  hotelId: Option[String],
  status: Option[ItemProcessingStatus],
  warnings: Option[List[ItemValidationEvent]]
)

object HotelProcessingRecord {
  implicit lazy val hotelProcessingRecordJsonFormat: Format[HotelProcessingRecord] = Json.format[HotelProcessingRecord]
}

