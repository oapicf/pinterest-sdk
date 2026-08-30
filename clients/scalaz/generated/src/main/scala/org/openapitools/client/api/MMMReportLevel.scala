package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MMMReportLevel._

case class MMMReportLevel (
  
object MMMReportLevel {
  import DateTimeCodecs._

  implicit val MMMReportLevelCodecJson: CodecJson[MMMReportLevel] = CodecJson.derive[MMMReportLevel]
  implicit val MMMReportLevelDecoder: EntityDecoder[MMMReportLevel] = jsonOf[MMMReportLevel]
  implicit val MMMReportLevelEncoder: EntityEncoder[MMMReportLevel] = jsonEncoderOf[MMMReportLevel]
}
