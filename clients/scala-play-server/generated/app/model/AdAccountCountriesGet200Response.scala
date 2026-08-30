package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_account_countries_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdAccountCountriesGet200Response(
  items: List[AdAccountsCountry]
)

object AdAccountCountriesGet200Response {
  implicit lazy val adAccountCountriesGet200ResponseJsonFormat: Format[AdAccountCountriesGet200Response] = Json.format[AdAccountCountriesGet200Response]
}

