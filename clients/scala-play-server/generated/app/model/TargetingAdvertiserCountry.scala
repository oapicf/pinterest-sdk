package model

import play.api.libs.json._

/**
  * Advertiser's ISO two character country code.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class TargetingAdvertiserCountry(
)

object TargetingAdvertiserCountry {
  implicit lazy val targetingAdvertiserCountryJsonFormat: Format[TargetingAdvertiserCountry] = Json.format[TargetingAdvertiserCountry]
}

