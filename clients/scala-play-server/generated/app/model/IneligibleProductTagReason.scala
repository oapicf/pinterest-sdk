package model

import play.api.libs.json._

/**
  * Reason why a product pin is ineligible for tagging.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class IneligibleProductTagReason(
)

object IneligibleProductTagReason {
  implicit lazy val ineligibleProductTagReasonJsonFormat: Format[IneligibleProductTagReason] = Json.format[IneligibleProductTagReason]
}

