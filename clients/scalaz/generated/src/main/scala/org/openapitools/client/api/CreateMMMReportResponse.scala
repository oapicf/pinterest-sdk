package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateMMMReportResponse._

case class CreateMMMReportResponse (
  code: Option[BigDecimal],
data: Option[CreateMMMReportResponseData])

object CreateMMMReportResponse {
  import DateTimeCodecs._

  implicit val CreateMMMReportResponseCodecJson: CodecJson[CreateMMMReportResponse] = CodecJson.derive[CreateMMMReportResponse]
  implicit val CreateMMMReportResponseDecoder: EntityDecoder[CreateMMMReportResponse] = jsonOf[CreateMMMReportResponse]
  implicit val CreateMMMReportResponseEncoder: EntityEncoder[CreateMMMReportResponse] = jsonEncoderOf[CreateMMMReportResponse]
}
