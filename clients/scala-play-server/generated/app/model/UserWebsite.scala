package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserWebsite.
  * @param status Status of the verification process
  * @param verifiedAt UTC timestamp when the verification happened - sometimes missing
  * @param website Website with path or domain only
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class UserWebsite(
  status: Option[String],
  verifiedAt: Option[String],
  website: Option[String]
)

object UserWebsite {
  implicit lazy val userWebsiteJsonFormat: Format[UserWebsite] = Json.format[UserWebsite]
}

