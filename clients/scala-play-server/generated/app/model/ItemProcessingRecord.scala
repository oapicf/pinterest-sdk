package model

import play.api.libs.json._

/**
  * Object describing an item processing record
  * @param itemId The catalog item id in the merchant namespace
  * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  * @param warnings Array with the validation warnings for the item processing record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ItemProcessingRecord(
  itemId: Option[String],
  errors: Option[List[ItemValidationEvent]],
  warnings: Option[List[ItemValidationEvent]],
  status: Option[ItemProcessingStatus]
)

object ItemProcessingRecord {
  implicit lazy val itemProcessingRecordJsonFormat: Format[ItemProcessingRecord] = Json.format[ItemProcessingRecord]
}

