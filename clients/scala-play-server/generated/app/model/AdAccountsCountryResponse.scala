package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountsCountryResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AdAccountsCountryResponse(
  items: Option[List[AdAccountsCountryResponseData]]
)

object AdAccountsCountryResponse {
  implicit lazy val adAccountsCountryResponseJsonFormat: Format[AdAccountsCountryResponse] = Json.format[AdAccountsCountryResponse]
}

