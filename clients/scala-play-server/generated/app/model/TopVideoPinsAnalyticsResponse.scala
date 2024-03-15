package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TopVideoPinsAnalyticsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class TopVideoPinsAnalyticsResponse(
  dateAvailability: Option[TopPinsAnalyticsResponseDateAvailability],
  pins: Option[List[TopVideoPinsAnalyticsResponsePinsInner]],
  sortBy: Option[TopVideoPinsAnalyticsResponse.SortBy.Value]
)

object TopVideoPinsAnalyticsResponse {
  implicit lazy val topVideoPinsAnalyticsResponseJsonFormat: Format[TopVideoPinsAnalyticsResponse] = Json.format[TopVideoPinsAnalyticsResponse]

  // noinspection TypeAnnotation
  object SortBy extends Enumeration {
    val SAVE = Value("SAVE")
    val IMPRESSION = Value("IMPRESSION")
    val OUTBOUNDCLICK = Value("OUTBOUND_CLICK")
    val VIDEOMRCVIEW = Value("VIDEO_MRC_VIEW")
    val VIDEOAVGWATCHTIME = Value("VIDEO_AVG_WATCH_TIME")
    val VIDEOV50WATCHTIME = Value("VIDEO_V50_WATCH_TIME")
    val QUARTILE95PERCENTVIEW = Value("QUARTILE_95_PERCENT_VIEW")
    val VIDEO10SVIEW = Value("VIDEO_10S_VIEW")
    val VIDEOSTART = Value("VIDEO_START")

    type SortBy = Value
    implicit lazy val SortByJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

