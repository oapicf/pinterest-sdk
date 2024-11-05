package model

import play.api.libs.json._

/**
  * The status of the item processing record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ItemProcessingStatus(
)

object ItemProcessingStatus {
  implicit lazy val itemProcessingStatusJsonFormat: Format[ItemProcessingStatus] = Json.format[ItemProcessingStatus]
}

