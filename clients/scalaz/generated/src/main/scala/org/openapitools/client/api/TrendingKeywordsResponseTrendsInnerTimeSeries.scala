package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate
import java.util.HashMap

import TrendingKeywordsResponseTrendsInnerTimeSeries._

case class TrendingKeywordsResponseTrendsInnerTimeSeries (
  date: Option[LocalDate])

object TrendingKeywordsResponseTrendsInnerTimeSeries {
  import DateTimeCodecs._

  implicit val TrendingKeywordsResponseTrendsInnerTimeSeriesCodecJson: CodecJson[TrendingKeywordsResponseTrendsInnerTimeSeries] = CodecJson.derive[TrendingKeywordsResponseTrendsInnerTimeSeries]
  implicit val TrendingKeywordsResponseTrendsInnerTimeSeriesDecoder: EntityDecoder[TrendingKeywordsResponseTrendsInnerTimeSeries] = jsonOf[TrendingKeywordsResponseTrendsInnerTimeSeries]
  implicit val TrendingKeywordsResponseTrendsInnerTimeSeriesEncoder: EntityEncoder[TrendingKeywordsResponseTrendsInnerTimeSeries] = jsonEncoderOf[TrendingKeywordsResponseTrendsInnerTimeSeries]
}
