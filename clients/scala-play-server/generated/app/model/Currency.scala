package model

import play.api.libs.json._

/**
  * Currency Codes from ISO 4217
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class Currency(
)

object Currency {
  implicit lazy val currencyJsonFormat: Format[Currency] = Json.format[Currency]
}

