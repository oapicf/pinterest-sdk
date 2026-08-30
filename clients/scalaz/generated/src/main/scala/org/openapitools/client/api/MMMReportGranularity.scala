package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MMMReportGranularity._

case class MMMReportGranularity (
  
object MMMReportGranularity {
  import DateTimeCodecs._

  implicit val MMMReportGranularityCodecJson: CodecJson[MMMReportGranularity] = CodecJson.derive[MMMReportGranularity]
  implicit val MMMReportGranularityDecoder: EntityDecoder[MMMReportGranularity] = jsonOf[MMMReportGranularity]
  implicit val MMMReportGranularityEncoder: EntityEncoder[MMMReportGranularity] = jsonEncoderOf[MMMReportGranularity]
}
