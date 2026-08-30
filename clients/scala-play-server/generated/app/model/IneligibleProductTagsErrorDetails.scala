package model

import play.api.libs.json._

/**
  * Details about ineligible product tags in the request.
  * @param productTags List of product tags that failed eligibility check.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class IneligibleProductTagsErrorDetails(
  productTags: List[IneligibleProductTagErrorItem]
)

object IneligibleProductTagsErrorDetails {
  implicit lazy val ineligibleProductTagsErrorDetailsJsonFormat: Format[IneligibleProductTagsErrorDetails] = Json.format[IneligibleProductTagsErrorDetails]
}

