package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate
import java.util.HashMap

import AdsAnalyticsResponseInner._

case class AdsAnalyticsResponseInner (
  /* The ID of the ad that this metrics belongs to. */
  AD_ID: String,
/* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
  DATE: Option[LocalDate])

object AdsAnalyticsResponseInner {
  import DateTimeCodecs._

  implicit val AdsAnalyticsResponseInnerCodecJson: CodecJson[AdsAnalyticsResponseInner] = CodecJson.derive[AdsAnalyticsResponseInner]
  implicit val AdsAnalyticsResponseInnerDecoder: EntityDecoder[AdsAnalyticsResponseInner] = jsonOf[AdsAnalyticsResponseInner]
  implicit val AdsAnalyticsResponseInnerEncoder: EntityEncoder[AdsAnalyticsResponseInner] = jsonEncoderOf[AdsAnalyticsResponseInner]
}
