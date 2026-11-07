package model

import play.api.libs.json._

/**
  * Error response for requests containing ineligible product tags.
  * @param details Details about which product tags failed eligibility check.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ProductTagsError(
  code: Int,
  details: Option[IneligibleProductTagsErrorDetails],
  message: String
)

object ProductTagsError {
  implicit lazy val productTagsErrorJsonFormat: Format[ProductTagsError] = Json.format[ProductTagsError]
}

