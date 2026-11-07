package model

import play.api.libs.json._

/**
  * Currency Codes from ISO 4217.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class NullableCurrency(
)

object NullableCurrency {
  implicit lazy val nullableCurrencyJsonFormat: Format[NullableCurrency] = Json.format[NullableCurrency]
}

