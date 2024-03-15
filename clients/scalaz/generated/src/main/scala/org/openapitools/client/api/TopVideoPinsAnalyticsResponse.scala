package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TopVideoPinsAnalyticsResponse._

case class TopVideoPinsAnalyticsResponse (
  dateAvailability: Option[TopPinsAnalyticsResponseDateAvailability],
pins: Option[List[TopVideoPinsAnalyticsResponsePinsInner]],
sortBy: Option[SortBy])

object TopVideoPinsAnalyticsResponse {
  import DateTimeCodecs._
  sealed trait SortBy
  case object SAVE extends SortBy
  case object IMPRESSION extends SortBy
  case object OUTBOUNDCLICK extends SortBy
  case object VIDEOMRCVIEW extends SortBy
  case object VIDEOAVGWATCHTIME extends SortBy
  case object VIDEOV50WATCHTIME extends SortBy
  case object QUARTILE95PERCENTVIEW extends SortBy
  case object VIDEO10SVIEW extends SortBy
  case object VIDEOSTART extends SortBy

  object SortBy {
    def toSortBy(s: String): Option[SortBy] = s match {
      case "SAVE" => Some(SAVE)
      case "IMPRESSION" => Some(IMPRESSION)
      case "OUTBOUNDCLICK" => Some(OUTBOUNDCLICK)
      case "VIDEOMRCVIEW" => Some(VIDEOMRCVIEW)
      case "VIDEOAVGWATCHTIME" => Some(VIDEOAVGWATCHTIME)
      case "VIDEOV50WATCHTIME" => Some(VIDEOV50WATCHTIME)
      case "QUARTILE95PERCENTVIEW" => Some(QUARTILE95PERCENTVIEW)
      case "VIDEO10SVIEW" => Some(VIDEO10SVIEW)
      case "VIDEOSTART" => Some(VIDEOSTART)
      case _ => None
    }

    def fromSortBy(x: SortBy): String = x match {
      case SAVE => "SAVE"
      case IMPRESSION => "IMPRESSION"
      case OUTBOUNDCLICK => "OUTBOUNDCLICK"
      case VIDEOMRCVIEW => "VIDEOMRCVIEW"
      case VIDEOAVGWATCHTIME => "VIDEOAVGWATCHTIME"
      case VIDEOV50WATCHTIME => "VIDEOV50WATCHTIME"
      case QUARTILE95PERCENTVIEW => "QUARTILE95PERCENTVIEW"
      case VIDEO10SVIEW => "VIDEO10SVIEW"
      case VIDEOSTART => "VIDEOSTART"
    }
  }

  implicit val SortByEnumEncoder: EncodeJson[SortBy] =
    EncodeJson[SortBy](is => StringEncodeJson(SortBy.fromSortBy(is)))

  implicit val SortByEnumDecoder: DecodeJson[SortBy] =
    DecodeJson.optionDecoder[SortBy](n => n.string.flatMap(jStr => SortBy.toSortBy(jStr)), "SortBy failed to de-serialize")

  implicit val TopVideoPinsAnalyticsResponseCodecJson: CodecJson[TopVideoPinsAnalyticsResponse] = CodecJson.derive[TopVideoPinsAnalyticsResponse]
  implicit val TopVideoPinsAnalyticsResponseDecoder: EntityDecoder[TopVideoPinsAnalyticsResponse] = jsonOf[TopVideoPinsAnalyticsResponse]
  implicit val TopVideoPinsAnalyticsResponseEncoder: EntityEncoder[TopVideoPinsAnalyticsResponse] = jsonEncoderOf[TopVideoPinsAnalyticsResponse]
}
