package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountsCountry.
  * @param currency Country currency.
  * @param index Country index
  * @param name Country name
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdAccountsCountry(
  code: Country,
  currency: String,
  index: BigDecimal,
  name: String
)

object AdAccountsCountry {
  implicit lazy val adAccountsCountryJsonFormat: Format[AdAccountsCountry] = Json.format[AdAccountsCountry]
}

