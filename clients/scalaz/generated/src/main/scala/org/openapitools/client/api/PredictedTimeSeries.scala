package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate
import java.util.HashMap

import PredictedTimeSeries._

case class PredictedTimeSeries (
  date: Option[LocalDate])

object PredictedTimeSeries {
  import DateTimeCodecs._

  implicit val PredictedTimeSeriesCodecJson: CodecJson[PredictedTimeSeries] = CodecJson.derive[PredictedTimeSeries]
  implicit val PredictedTimeSeriesDecoder: EntityDecoder[PredictedTimeSeries] = jsonOf[PredictedTimeSeries]
  implicit val PredictedTimeSeriesEncoder: EntityEncoder[PredictedTimeSeries] = jsonEncoderOf[PredictedTimeSeries]
}
