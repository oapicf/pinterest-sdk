package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate
import java.util.HashMap

import AdAccountAnalyticsResponseInner._

case class AdAccountAnalyticsResponseInner (
  /* The ID of the advertiser that this metrics belongs to. */
  AD_ACCOUNT_ID: String,
/* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
  DATE: Option[LocalDate])

object AdAccountAnalyticsResponseInner {
  import DateTimeCodecs._

  implicit val AdAccountAnalyticsResponseInnerCodecJson: CodecJson[AdAccountAnalyticsResponseInner] = CodecJson.derive[AdAccountAnalyticsResponseInner]
  implicit val AdAccountAnalyticsResponseInnerDecoder: EntityDecoder[AdAccountAnalyticsResponseInner] = jsonOf[AdAccountAnalyticsResponseInner]
  implicit val AdAccountAnalyticsResponseInnerEncoder: EntityEncoder[AdAccountAnalyticsResponseInner] = jsonEncoderOf[AdAccountAnalyticsResponseInner]
}
