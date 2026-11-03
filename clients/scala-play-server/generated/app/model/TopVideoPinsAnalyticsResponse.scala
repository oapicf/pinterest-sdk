package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TopVideoPinsAnalyticsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TopVideoPinsAnalyticsResponse(
  dateAvailability: Option[TopVideoPinsAnalyticsResponseDateAvailability],
  pins: Option[List[TopVideoPinsAnalyticsResponsePinsItems]],
  sortBy: Option[TopVideoPinsSortBy]
)

object TopVideoPinsAnalyticsResponse {
  implicit lazy val topVideoPinsAnalyticsResponseJsonFormat: Format[TopVideoPinsAnalyticsResponse] = Json.format[TopVideoPinsAnalyticsResponse]
}

