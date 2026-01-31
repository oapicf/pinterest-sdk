package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate
import java.util.HashMap

import TimeSeries._

case class TimeSeries (
  date: Option[LocalDate])

object TimeSeries {
  import DateTimeCodecs._

  implicit val TimeSeriesCodecJson: CodecJson[TimeSeries] = CodecJson.derive[TimeSeries]
  implicit val TimeSeriesDecoder: EntityDecoder[TimeSeries] = jsonOf[TimeSeries]
  implicit val TimeSeriesEncoder: EntityEncoder[TimeSeries] = jsonEncoderOf[TimeSeries]
}
