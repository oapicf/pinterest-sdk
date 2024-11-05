package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreateReportResponse._

case class CatalogsCreateReportResponse (
  /* Token to be used to get the report */
  token: Option[String])

object CatalogsCreateReportResponse {
  import DateTimeCodecs._

  implicit val CatalogsCreateReportResponseCodecJson: CodecJson[CatalogsCreateReportResponse] = CodecJson.derive[CatalogsCreateReportResponse]
  implicit val CatalogsCreateReportResponseDecoder: EntityDecoder[CatalogsCreateReportResponse] = jsonOf[CatalogsCreateReportResponse]
  implicit val CatalogsCreateReportResponseEncoder: EntityEncoder[CatalogsCreateReportResponse] = jsonEncoderOf[CatalogsCreateReportResponse]
}
