package model

import play.api.libs.json._

/**
  * Item validation event
  * @param attribute The item attribute referenced by the validation event eg. price, availability, ad_link
  * @param code The event code that the item validation event references
  * @param message Title message describing the item validation event
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class SupplementalItemValidationEvent(
  attribute: String,
  code: Int,
  message: String
)

object SupplementalItemValidationEvent {
  implicit lazy val supplementalItemValidationEventJsonFormat: Format[SupplementalItemValidationEvent] = Json.format[SupplementalItemValidationEvent]
}

