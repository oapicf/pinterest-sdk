package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate
import java.util.HashMap

import AdGroupsAnalyticsResponseInner._

case class AdGroupsAnalyticsResponseInner (
  /* The ID of the ad group that this metrics belongs to. */
  AD_GROUP_ID: String,
/* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
  DATE: Option[LocalDate])

object AdGroupsAnalyticsResponseInner {
  import DateTimeCodecs._

  implicit val AdGroupsAnalyticsResponseInnerCodecJson: CodecJson[AdGroupsAnalyticsResponseInner] = CodecJson.derive[AdGroupsAnalyticsResponseInner]
  implicit val AdGroupsAnalyticsResponseInnerDecoder: EntityDecoder[AdGroupsAnalyticsResponseInner] = jsonOf[AdGroupsAnalyticsResponseInner]
  implicit val AdGroupsAnalyticsResponseInnerEncoder: EntityEncoder[AdGroupsAnalyticsResponseInner] = jsonEncoderOf[AdGroupsAnalyticsResponseInner]
}
