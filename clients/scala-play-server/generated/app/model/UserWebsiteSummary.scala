package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserWebsiteSummary.
  * @param status Status of the verification process
  * @param verifiedAt UTC timestamp when the verification happened - sometimes missing
  * @param website Website with path or domain only
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UserWebsiteSummary(
  status: Option[String],
  verifiedAt: Option[String],
  website: Option[String]
)

object UserWebsiteSummary {
  implicit lazy val userWebsiteSummaryJsonFormat: Format[UserWebsiteSummary] = Json.format[UserWebsiteSummary]
}

