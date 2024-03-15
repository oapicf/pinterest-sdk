package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TopPinsAnalyticsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class TopPinsAnalyticsResponse(
  dateAvailability: Option[TopPinsAnalyticsResponseDateAvailability],
  pins: Option[List[TopPinsAnalyticsResponsePinsInner]],
  sortBy: Option[TopPinsAnalyticsResponse.SortBy.Value]
)

object TopPinsAnalyticsResponse {
  implicit lazy val topPinsAnalyticsResponseJsonFormat: Format[TopPinsAnalyticsResponse] = Json.format[TopPinsAnalyticsResponse]

  // noinspection TypeAnnotation
  object SortBy extends Enumeration {
    val ENGAGEMENT = Value("ENGAGEMENT")
    val SAVE = Value("SAVE")
    val IMPRESSION = Value("IMPRESSION")
    val OUTBOUNDCLICK = Value("OUTBOUND_CLICK")
    val PINCLICK = Value("PIN_CLICK")

    type SortBy = Value
    implicit lazy val SortByJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

