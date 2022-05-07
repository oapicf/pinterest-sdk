package model

import play.api.libs.json._

/**
  * Country ID from ISO 3166-1 alpha-2.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class Country(
)

object Country {
  implicit lazy val countryJsonFormat: Format[Country] = Json.format[Country]
}

