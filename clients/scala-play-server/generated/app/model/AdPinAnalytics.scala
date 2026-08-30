package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for AdPinAnalytics.
  * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  * @param PIN_ID The ID of the pin that the metric belongs to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdPinAnalytics(
  DATE: Option[LocalDate],
  PIN_ID: String
)

object AdPinAnalytics {
  implicit lazy val adPinAnalyticsJsonFormat: Format[AdPinAnalytics] = Json.format[AdPinAnalytics]
}

