package model

import play.api.libs.json._

/**
  * The status of the item processing record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ItemProcessingStatus(
)

object ItemProcessingStatus {
  implicit lazy val itemProcessingStatusJsonFormat: Format[ItemProcessingStatus] = Json.format[ItemProcessingStatus]
}

