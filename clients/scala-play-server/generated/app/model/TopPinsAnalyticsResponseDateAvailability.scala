package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TopPinsAnalyticsResponse_date_availability.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class TopPinsAnalyticsResponseDateAvailability(
  latestAvailableTimestamp: Option[BigDecimal],
  isRealtime: Option[Boolean]
)

object TopPinsAnalyticsResponseDateAvailability {
  implicit lazy val topPinsAnalyticsResponseDateAvailabilityJsonFormat: Format[TopPinsAnalyticsResponseDateAvailability] = Json.format[TopPinsAnalyticsResponseDateAvailability]
}

