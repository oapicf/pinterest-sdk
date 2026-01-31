package model

import play.api.libs.json._

/**
  * Object describing an item processing record
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  * @param warnings Array with the validation warnings for the item processing record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class HotelProcessingRecord(
  hotelId: Option[String],
  errors: Option[List[ItemValidationEvent]],
  warnings: Option[List[ItemValidationEvent]],
  status: Option[ItemProcessingStatus]
)

object HotelProcessingRecord {
  implicit lazy val hotelProcessingRecordJsonFormat: Format[HotelProcessingRecord] = Json.format[HotelProcessingRecord]
}

