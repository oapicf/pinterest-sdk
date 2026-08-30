package model

import play.api.libs.json._

/**
  * Object describing an item processing record
  * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  * @param itemId The catalog item id in the merchant namespace
  * @param warnings Array with the validation warnings for the item processing record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ItemProcessingRecord(
  errors: Option[List[ItemValidationEvent]],
  itemId: Option[String],
  status: Option[ItemProcessingStatus],
  warnings: Option[List[ItemValidationEvent]]
)

object ItemProcessingRecord {
  implicit lazy val itemProcessingRecordJsonFormat: Format[ItemProcessingRecord] = Json.format[ItemProcessingRecord]
}

