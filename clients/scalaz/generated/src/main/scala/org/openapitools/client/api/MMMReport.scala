package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MMMReport._

case class MMMReport (
  message: Option[String],
reportStatus: Option[BulkReportingJobStatus],
size: Option[BigDecimal],
status: Option[String],
token: Option[String],
url: Option[String])

object MMMReport {
  import DateTimeCodecs._

  implicit val MMMReportCodecJson: CodecJson[MMMReport] = CodecJson.derive[MMMReport]
  implicit val MMMReportDecoder: EntityDecoder[MMMReport] = jsonOf[MMMReport]
  implicit val MMMReportEncoder: EntityEncoder[MMMReport] = jsonEncoderOf[MMMReport]
}
