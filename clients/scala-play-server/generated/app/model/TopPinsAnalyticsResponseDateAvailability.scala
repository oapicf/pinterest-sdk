package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TopPinsAnalyticsResponse_date_availability.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TopPinsAnalyticsResponseDateAvailability(
  isRealtime: Option[Boolean],
  latestAvailableTimestamp: Option[BigDecimal]
)

object TopPinsAnalyticsResponseDateAvailability {
  implicit lazy val topPinsAnalyticsResponseDateAvailabilityJsonFormat: Format[TopPinsAnalyticsResponseDateAvailability] = Json.format[TopPinsAnalyticsResponseDateAvailability]
}

