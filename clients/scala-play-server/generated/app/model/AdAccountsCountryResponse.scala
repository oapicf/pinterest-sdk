package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountsCountryResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdAccountsCountryResponse(
  items: Option[List[AdAccountsCountryResponseData]]
)

object AdAccountsCountryResponse {
  implicit lazy val adAccountsCountryResponseJsonFormat: Format[AdAccountsCountryResponse] = Json.format[AdAccountsCountryResponse]
}

