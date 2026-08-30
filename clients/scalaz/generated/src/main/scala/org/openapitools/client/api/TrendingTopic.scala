package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrendingTopic._

case class TrendingTopic (
  /* Description of the trending topic */
  description: String,
/* Unique identifier for the trending topic */
  id: String,
/* Month-over-month growth percentage */
  percentGrowthMom: Option[Integer],
/* Array of pin images related to this trend (up to 6) */
  pins: List[TrendingPin],
/* List of related interest categories */
  relatedInterests: List[String],
/* List of related search terms */
  relatedSearches: List[String],
/* Time series data showing trend values over time, with dates as keys and values as numeric */
  timeSeries: Map[String, BigDecimal],
/* Title of the trending topic */
  title: String)

object TrendingTopic {
  import DateTimeCodecs._

  implicit val TrendingTopicCodecJson: CodecJson[TrendingTopic] = CodecJson.derive[TrendingTopic]
  implicit val TrendingTopicDecoder: EntityDecoder[TrendingTopic] = jsonOf[TrendingTopic]
  implicit val TrendingTopicEncoder: EntityEncoder[TrendingTopic] = jsonEncoderOf[TrendingTopic]
}
