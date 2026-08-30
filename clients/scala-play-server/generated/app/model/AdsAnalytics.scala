package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for AdsAnalytics.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdsAnalytics(
  AD_ID: String,
  DATE: Option[LocalDate]
)

object AdsAnalytics {
  implicit lazy val adsAnalyticsJsonFormat: Format[AdsAnalytics] = Json.format[AdsAnalytics]
}

