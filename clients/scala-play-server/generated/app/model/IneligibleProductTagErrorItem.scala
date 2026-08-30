package model

import play.api.libs.json._

/**
  * Error item for a product tag that failed eligibility check.
  * @param errorMessage Reason why the pin is ineligible for tagging.
  * @param pinId Pin ID that failed eligibility check.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class IneligibleProductTagErrorItem(
  errorMessage: IneligibleProductTagReason,
  pinId: String
)

object IneligibleProductTagErrorItem {
  implicit lazy val ineligibleProductTagErrorItemJsonFormat: Format[IneligibleProductTagErrorItem] = Json.format[IneligibleProductTagErrorItem]
}

