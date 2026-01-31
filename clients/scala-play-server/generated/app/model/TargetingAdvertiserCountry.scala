package model

import play.api.libs.json._

/**
  * Advertiser's ISO two character country code.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingAdvertiserCountry(
)

object TargetingAdvertiserCountry {
  implicit lazy val targetingAdvertiserCountryJsonFormat: Format[TargetingAdvertiserCountry] = Json.format[TargetingAdvertiserCountry]
}

