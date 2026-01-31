package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for brand_accounts_create_200_response.
  * @param brandAccountId id of the newly created brand account
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BrandAccountsCreate200Response(
  brandAccountId: Option[String]
)

object BrandAccountsCreate200Response {
  implicit lazy val brandAccountsCreate200ResponseJsonFormat: Format[BrandAccountsCreate200Response] = Json.format[BrandAccountsCreate200Response]
}

