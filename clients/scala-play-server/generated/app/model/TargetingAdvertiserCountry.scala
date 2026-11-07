package model

import play.api.libs.json._

/**
  * Advertiser's ISO two character country code.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TargetingAdvertiserCountry(
)

object TargetingAdvertiserCountry {
  implicit lazy val targetingAdvertiserCountryJsonFormat: Format[TargetingAdvertiserCountry] = Json.format[TargetingAdvertiserCountry]
}

