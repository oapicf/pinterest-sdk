package model

import play.api.libs.json._

/**
  * Advertiser's ISO two character country code.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class TargetingAdvertiserCountry(
)

object TargetingAdvertiserCountry {
  implicit lazy val targetingAdvertiserCountryJsonFormat: Format[TargetingAdvertiserCountry] = Json.format[TargetingAdvertiserCountry]
}

