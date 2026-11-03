package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param verificationMethod Method used to verify website ownership.
  * @param website Website with path or domain only
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UserWebsiteCreate(
  verificationMethod: Option[WebsiteVerificationMethod],
  website: Option[String]
)

object UserWebsiteCreate {
  implicit lazy val userWebsiteCreateJsonFormat: Format[UserWebsiteCreate] = Json.format[UserWebsiteCreate]
}

