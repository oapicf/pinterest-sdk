package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserWebsiteSummary.
  * @param website Website with path or domain only
  * @param status Status of the verification process
  * @param verifiedAt UTC timestamp when the verification happened - sometimes missing
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class UserWebsiteSummary(
  website: Option[String],
  status: Option[String],
  verifiedAt: Option[String]
)

object UserWebsiteSummary {
  implicit lazy val userWebsiteSummaryJsonFormat: Format[UserWebsiteSummary] = Json.format[UserWebsiteSummary]
}

