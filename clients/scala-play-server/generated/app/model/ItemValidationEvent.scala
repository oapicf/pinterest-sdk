package model

import play.api.libs.json._

/**
  * Object describing an item validation event
  * @param attribute The attribute that the item validation event references
  * @param code The event code that the item validation event references
  * @param message Title message describing the item validation event
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class ItemValidationEvent(
  attribute: Option[String],
  code: Option[Int],
  message: Option[String]
)

object ItemValidationEvent {
  implicit lazy val itemValidationEventJsonFormat: Format[ItemValidationEvent] = Json.format[ItemValidationEvent]
}

