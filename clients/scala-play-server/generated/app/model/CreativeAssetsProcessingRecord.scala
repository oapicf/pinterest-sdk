package model

import play.api.libs.json._

/**
  * Object describing an item processing record
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  * @param warnings Array with the validation warnings for the item processing record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CreativeAssetsProcessingRecord(
  creativeAssetsId: Option[String],
  errors: Option[List[ItemValidationEvent]],
  warnings: Option[List[ItemValidationEvent]],
  status: Option[ItemProcessingStatus]
)

object CreativeAssetsProcessingRecord {
  implicit lazy val creativeAssetsProcessingRecordJsonFormat: Format[CreativeAssetsProcessingRecord] = Json.format[CreativeAssetsProcessingRecord]
}

