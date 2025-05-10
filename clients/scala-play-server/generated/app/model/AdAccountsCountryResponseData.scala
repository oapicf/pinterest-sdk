package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountsCountryResponseData.
  * @param currency Country currency.
  * @param index Country index
  * @param name Country name
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AdAccountsCountryResponseData(
  code: Option[AdCountry],
  currency: Option[String],
  index: Option[BigDecimal],
  name: Option[String]
)

object AdAccountsCountryResponseData {
  implicit lazy val adAccountsCountryResponseDataJsonFormat: Format[AdAccountsCountryResponseData] = Json.format[AdAccountsCountryResponseData]
}

