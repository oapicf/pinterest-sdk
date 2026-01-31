package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountsCountryResponseData.
  * @param currency Country currency.
  * @param index Country index
  * @param name Country name
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdAccountsCountryResponseData(
  code: Option[AdCountry],
  currency: Option[String],
  index: Option[BigDecimal],
  name: Option[String]
)

object AdAccountsCountryResponseData {
  implicit lazy val adAccountsCountryResponseDataJsonFormat: Format[AdAccountsCountryResponseData] = Json.format[AdAccountsCountryResponseData]
}

