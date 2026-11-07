package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CountryFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CountryFilter(
  COUNTRY: CatalogsProductGroupMultipleCountriesCriteria
)

object CountryFilter {
  implicit lazy val countryFilterJsonFormat: Format[CountryFilter] = Json.format[CountryFilter]
}

