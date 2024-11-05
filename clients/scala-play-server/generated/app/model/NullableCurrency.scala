package model

import play.api.libs.json._

/**
  * Currency Codes from ISO 4217.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class NullableCurrency(
)

object NullableCurrency {
  implicit lazy val nullableCurrencyJsonFormat: Format[NullableCurrency] = Json.format[NullableCurrency]
}

