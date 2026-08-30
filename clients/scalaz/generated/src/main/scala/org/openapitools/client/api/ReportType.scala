package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReportType._

case class ReportType (
  
object ReportType {
  import DateTimeCodecs._

  implicit val ReportTypeCodecJson: CodecJson[ReportType] = CodecJson.derive[ReportType]
  implicit val ReportTypeDecoder: EntityDecoder[ReportType] = jsonOf[ReportType]
  implicit val ReportTypeEncoder: EntityEncoder[ReportType] = jsonEncoderOf[ReportType]
}
