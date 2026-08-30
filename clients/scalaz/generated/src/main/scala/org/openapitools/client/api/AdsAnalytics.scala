package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import AdsAnalytics._

case class AdsAnalytics (
  AD_ID: String,
DATE: Option[LocalDate])

object AdsAnalytics {
  import DateTimeCodecs._

  implicit val AdsAnalyticsCodecJson: CodecJson[AdsAnalytics] = CodecJson.derive[AdsAnalytics]
  implicit val AdsAnalyticsDecoder: EntityDecoder[AdsAnalytics] = jsonOf[AdsAnalytics]
  implicit val AdsAnalyticsEncoder: EntityEncoder[AdsAnalytics] = jsonEncoderOf[AdsAnalytics]
}
