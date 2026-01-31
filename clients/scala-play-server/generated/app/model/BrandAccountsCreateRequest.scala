package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for brand_accounts_create_request.
  * @param name Brand Account name
  * @param username Brand Account username
  * @param about Brand Account about information
  * @param website Brand Account website
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BrandAccountsCreateRequest(
  name: String,
  username: String,
  country: Country,
  about: Option[String],
  website: Option[String],
  profileImage: Option[ImageBase64]
)

object BrandAccountsCreateRequest {
  implicit lazy val brandAccountsCreateRequestJsonFormat: Format[BrandAccountsCreateRequest] = Json.format[BrandAccountsCreateRequest]
}

