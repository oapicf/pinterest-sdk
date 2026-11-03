package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserWebsite.
  * @param status Status of the verification process
  * @param verifiedAt UTC timestamp when the verification happened - sometimes missing
  * @param website Website with path or domain only
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UserWebsite(
  status: Option[String],
  verifiedAt: Option[String],
  website: Option[String]
)

object UserWebsite {
  implicit lazy val userWebsiteJsonFormat: Format[UserWebsite] = Json.format[UserWebsite]
}

