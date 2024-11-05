package model

import play.api.libs.json._

/**
  * Object describing an item processing record
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  * @param warnings Array with the validation warnings for the item processing record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class HotelProcessingRecord(
  hotelId: Option[String],
  errors: Option[List[ItemValidationEvent]],
  warnings: Option[List[ItemValidationEvent]],
  status: Option[ItemProcessingStatus]
)

object HotelProcessingRecord {
  implicit lazy val hotelProcessingRecordJsonFormat: Format[HotelProcessingRecord] = Json.format[HotelProcessingRecord]
}

