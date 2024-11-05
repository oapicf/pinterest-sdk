package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserWebsiteSummary.
  * @param website Website with path or domain only
  * @param status Status of the verification process
  * @param verifiedAt UTC timestamp when the verification happened - sometimes missing
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class UserWebsiteSummary(
  website: Option[String],
  status: Option[String],
  verifiedAt: Option[String]
)

object UserWebsiteSummary {
  implicit lazy val userWebsiteSummaryJsonFormat: Format[UserWebsiteSummary] = Json.format[UserWebsiteSummary]
}

