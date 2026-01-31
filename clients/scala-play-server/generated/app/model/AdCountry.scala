package model

import play.api.libs.json._

/**
  * Country ID from ISO 3166-1 alpha-2.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdCountry(
)

object AdCountry {
  implicit lazy val adCountryJsonFormat: Format[AdCountry] = Json.format[AdCountry]
}

