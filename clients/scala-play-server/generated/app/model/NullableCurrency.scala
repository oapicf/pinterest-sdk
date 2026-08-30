package model

import play.api.libs.json._

/**
  * Currency Codes from ISO 4217.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class NullableCurrency(
)

object NullableCurrency {
  implicit lazy val nullableCurrencyJsonFormat: Format[NullableCurrency] = Json.format[NullableCurrency]
}

