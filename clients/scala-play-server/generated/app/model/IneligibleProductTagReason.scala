package model

import play.api.libs.json._

/**
  * Reason why a product pin is ineligible for tagging.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class IneligibleProductTagReason(
)

object IneligibleProductTagReason {
  implicit lazy val ineligibleProductTagReasonJsonFormat: Format[IneligibleProductTagReason] = Json.format[IneligibleProductTagReason]
}

