package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VideoPinMetricTypes._

case class VideoPinMetricTypes (
  
object VideoPinMetricTypes {
  import DateTimeCodecs._

  implicit val VideoPinMetricTypesCodecJson: CodecJson[VideoPinMetricTypes] = CodecJson.derive[VideoPinMetricTypes]
  implicit val VideoPinMetricTypesDecoder: EntityDecoder[VideoPinMetricTypes] = jsonOf[VideoPinMetricTypes]
  implicit val VideoPinMetricTypesEncoder: EntityEncoder[VideoPinMetricTypes] = jsonEncoderOf[VideoPinMetricTypes]
}
