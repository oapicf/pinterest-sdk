package model

import play.api.libs.json._

/**
  * Currency Codes from ISO 4217
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Currency(
)

object Currency {
  implicit lazy val currencyJsonFormat: Format[Currency] = Json.format[Currency]
}

