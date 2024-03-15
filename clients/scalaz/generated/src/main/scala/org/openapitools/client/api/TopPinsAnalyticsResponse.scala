package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TopPinsAnalyticsResponse._

case class TopPinsAnalyticsResponse (
  dateAvailability: Option[TopPinsAnalyticsResponseDateAvailability],
pins: Option[List[TopPinsAnalyticsResponsePinsInner]],
sortBy: Option[SortBy])

object TopPinsAnalyticsResponse {
  import DateTimeCodecs._
  sealed trait SortBy
  case object ENGAGEMENT extends SortBy
  case object SAVE extends SortBy
  case object IMPRESSION extends SortBy
  case object OUTBOUNDCLICK extends SortBy
  case object PINCLICK extends SortBy

  object SortBy {
    def toSortBy(s: String): Option[SortBy] = s match {
      case "ENGAGEMENT" => Some(ENGAGEMENT)
      case "SAVE" => Some(SAVE)
      case "IMPRESSION" => Some(IMPRESSION)
      case "OUTBOUNDCLICK" => Some(OUTBOUNDCLICK)
      case "PINCLICK" => Some(PINCLICK)
      case _ => None
    }

    def fromSortBy(x: SortBy): String = x match {
      case ENGAGEMENT => "ENGAGEMENT"
      case SAVE => "SAVE"
      case IMPRESSION => "IMPRESSION"
      case OUTBOUNDCLICK => "OUTBOUNDCLICK"
      case PINCLICK => "PINCLICK"
    }
  }

  implicit val SortByEnumEncoder: EncodeJson[SortBy] =
    EncodeJson[SortBy](is => StringEncodeJson(SortBy.fromSortBy(is)))

  implicit val SortByEnumDecoder: DecodeJson[SortBy] =
    DecodeJson.optionDecoder[SortBy](n => n.string.flatMap(jStr => SortBy.toSortBy(jStr)), "SortBy failed to de-serialize")

  implicit val TopPinsAnalyticsResponseCodecJson: CodecJson[TopPinsAnalyticsResponse] = CodecJson.derive[TopPinsAnalyticsResponse]
  implicit val TopPinsAnalyticsResponseDecoder: EntityDecoder[TopPinsAnalyticsResponse] = jsonOf[TopPinsAnalyticsResponse]
  implicit val TopPinsAnalyticsResponseEncoder: EntityEncoder[TopPinsAnalyticsResponse] = jsonEncoderOf[TopPinsAnalyticsResponse]
}
