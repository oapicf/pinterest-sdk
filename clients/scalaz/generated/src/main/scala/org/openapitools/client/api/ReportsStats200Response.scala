package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReportsStats200Response._

case class ReportsStats200Response (
  items: List[CatalogsReportStats],
bookmark: Option[String])

object ReportsStats200Response {
  import DateTimeCodecs._

  implicit val ReportsStats200ResponseCodecJson: CodecJson[ReportsStats200Response] = CodecJson.derive[ReportsStats200Response]
  implicit val ReportsStats200ResponseDecoder: EntityDecoder[ReportsStats200Response] = jsonOf[ReportsStats200Response]
  implicit val ReportsStats200ResponseEncoder: EntityEncoder[ReportsStats200Response] = jsonEncoderOf[ReportsStats200Response]
}
