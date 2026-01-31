package model

import play.api.libs.json._

/**
  * Object describing an item processing record
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  * @param warnings Array with the validation warnings for the item processing record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreativeAssetsProcessingRecord(
  creativeAssetsId: Option[String],
  errors: Option[List[ItemValidationEvent]],
  status: Option[ItemProcessingStatus],
  warnings: Option[List[ItemValidationEvent]]
)

object CreativeAssetsProcessingRecord {
  implicit lazy val creativeAssetsProcessingRecordJsonFormat: Format[CreativeAssetsProcessingRecord] = Json.format[CreativeAssetsProcessingRecord]
}

