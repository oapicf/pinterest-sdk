package model

import play.api.libs.json._

/**
  * Status of a single event in the response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EventProcessingStatus(
)

object EventProcessingStatus {
  implicit lazy val eventProcessingStatusJsonFormat: Format[EventProcessingStatus] = Json.format[EventProcessingStatus]
}

