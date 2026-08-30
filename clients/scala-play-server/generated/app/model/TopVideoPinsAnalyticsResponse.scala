package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TopVideoPinsAnalyticsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TopVideoPinsAnalyticsResponse(
  dateAvailability: Option[TopVideoPinsAnalyticsResponseDateAvailability],
  pins: Option[List[TopVideoPinsAnalyticsResponsePinsItems]],
  sortBy: Option[TopVideoPinsSortBy]
)

object TopVideoPinsAnalyticsResponse {
  implicit lazy val topVideoPinsAnalyticsResponseJsonFormat: Format[TopVideoPinsAnalyticsResponse] = Json.format[TopVideoPinsAnalyticsResponse]
}

