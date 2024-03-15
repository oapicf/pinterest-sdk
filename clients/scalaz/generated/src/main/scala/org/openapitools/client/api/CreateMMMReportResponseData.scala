package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateMMMReportResponseData._

case class CreateMMMReportResponseData (
  reportStatus: Option[BulkReportingJobStatus],
token: Option[String],
message: Option[String],
status: Option[String])

object CreateMMMReportResponseData {
  import DateTimeCodecs._

  implicit val CreateMMMReportResponseDataCodecJson: CodecJson[CreateMMMReportResponseData] = CodecJson.derive[CreateMMMReportResponseData]
  implicit val CreateMMMReportResponseDataDecoder: EntityDecoder[CreateMMMReportResponseData] = jsonOf[CreateMMMReportResponseData]
  implicit val CreateMMMReportResponseDataEncoder: EntityEncoder[CreateMMMReportResponseData] = jsonEncoderOf[CreateMMMReportResponseData]
}
