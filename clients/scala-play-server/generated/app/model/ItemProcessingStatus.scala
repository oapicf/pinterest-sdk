package model

import play.api.libs.json._

/**
  * The status of the item processing record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ItemProcessingStatus(
)

object ItemProcessingStatus {
  implicit lazy val itemProcessingStatusJsonFormat: Format[ItemProcessingStatus] = Json.format[ItemProcessingStatus]
}

