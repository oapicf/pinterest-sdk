package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TopPinsAnalyticsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TopPinsAnalyticsResponse(
  dateAvailability: Option[TopPinsAnalyticsResponseDateAvailability],
  pins: Option[List[TopPinsAnalyticsResponsePinsItems]],
  sortBy: Option[TopPinsSortBy]
)

object TopPinsAnalyticsResponse {
  implicit lazy val topPinsAnalyticsResponseJsonFormat: Format[TopPinsAnalyticsResponse] = Json.format[TopPinsAnalyticsResponse]
}

