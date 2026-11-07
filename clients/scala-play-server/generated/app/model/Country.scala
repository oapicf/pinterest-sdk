package model

import play.api.libs.json._

/**
  * Country ID from ISO 3166-1 alpha-2.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class Country(
)

object Country {
  implicit lazy val countryJsonFormat: Format[Country] = Json.format[Country]
}

