package model

import play.api.libs.json._

/**
  * The status of the item processing record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class ItemProcessingStatus(
)

object ItemProcessingStatus {
  implicit lazy val itemProcessingStatusJsonFormat: Format[ItemProcessingStatus] = Json.format[ItemProcessingStatus]
}

