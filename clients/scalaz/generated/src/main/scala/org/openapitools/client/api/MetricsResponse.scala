package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MetricsResponse._

case class MetricsResponse (
  data: Option[List[Any]])

object MetricsResponse {
  import DateTimeCodecs._

  implicit val MetricsResponseCodecJson: CodecJson[MetricsResponse] = CodecJson.derive[MetricsResponse]
  implicit val MetricsResponseDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]
  implicit val MetricsResponseEncoder: EntityEncoder[MetricsResponse] = jsonEncoderOf[MetricsResponse]
}
