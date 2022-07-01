package model

import play.api.libs.json._

/**
  * Currency Codes from ISO 4217
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class Currency(
)

object Currency {
  implicit lazy val currencyJsonFormat: Format[Currency] = Json.format[Currency]
}

