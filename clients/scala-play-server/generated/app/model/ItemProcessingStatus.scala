package model

import play.api.libs.json._

/**
  * The status of the item processing record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class ItemProcessingStatus(
)

object ItemProcessingStatus {
  implicit lazy val itemProcessingStatusJsonFormat: Format[ItemProcessingStatus] = Json.format[ItemProcessingStatus]
}

