package model

import play.api.libs.json._

/**
  * Advertiser's ISO two character country code.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingAdvertiserCountry(
)

object TargetingAdvertiserCountry {
  implicit lazy val targetingAdvertiserCountryJsonFormat: Format[TargetingAdvertiserCountry] = Json.format[TargetingAdvertiserCountry]
}

