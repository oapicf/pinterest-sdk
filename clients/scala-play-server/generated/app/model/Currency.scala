package model

import play.api.libs.json._

/**
  * Currency Codes from ISO 4217
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class Currency(
)

object Currency {
  implicit lazy val currencyJsonFormat: Format[Currency] = Json.format[Currency]
}

