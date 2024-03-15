package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MMMReportingColumn._

case class MMMReportingColumn (
  
object MMMReportingColumn {
  import DateTimeCodecs._

  implicit val MMMReportingColumnCodecJson: CodecJson[MMMReportingColumn] = CodecJson.derive[MMMReportingColumn]
  implicit val MMMReportingColumnDecoder: EntityDecoder[MMMReportingColumn] = jsonOf[MMMReportingColumn]
  implicit val MMMReportingColumnEncoder: EntityEncoder[MMMReportingColumn] = jsonEncoderOf[MMMReportingColumn]
}
