package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetMMMReportResponse._

case class GetMMMReportResponse (
  code: Option[BigDecimal],
data: Option[GetMMMReportResponseData],
message: Option[String],
status: Option[String])

object GetMMMReportResponse {
  import DateTimeCodecs._

  implicit val GetMMMReportResponseCodecJson: CodecJson[GetMMMReportResponse] = CodecJson.derive[GetMMMReportResponse]
  implicit val GetMMMReportResponseDecoder: EntityDecoder[GetMMMReportResponse] = jsonOf[GetMMMReportResponse]
  implicit val GetMMMReportResponseEncoder: EntityEncoder[GetMMMReportResponse] = jsonEncoderOf[GetMMMReportResponse]
}
