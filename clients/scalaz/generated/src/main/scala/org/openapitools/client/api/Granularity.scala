package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Granularity._

case class Granularity (
  
object Granularity {
  import DateTimeCodecs._

  implicit val GranularityCodecJson: CodecJson[Granularity] = CodecJson.derive[Granularity]
  implicit val GranularityDecoder: EntityDecoder[Granularity] = jsonOf[Granularity]
  implicit val GranularityEncoder: EntityEncoder[Granularity] = jsonEncoderOf[Granularity]
}
