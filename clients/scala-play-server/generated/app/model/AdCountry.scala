package model

import play.api.libs.json._

/**
  * Country ID from ISO 3166-1 alpha-2.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AdCountry(
)

object AdCountry {
  implicit lazy val adCountryJsonFormat: Format[AdCountry] = Json.format[AdCountry]
}

