package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CountryFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CountryFilter(
  COUNTRY: CatalogsProductGroupMultipleCountriesCriteria
)

object CountryFilter {
  implicit lazy val countryFilterJsonFormat: Format[CountryFilter] = Json.format[CountryFilter]
}

