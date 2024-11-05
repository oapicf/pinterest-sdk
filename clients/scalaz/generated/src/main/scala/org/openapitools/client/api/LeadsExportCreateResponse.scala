package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadsExportCreateResponse._

case class LeadsExportCreateResponse (
  /* ID for the leads export job */
  leadsExportId: Option[String])

object LeadsExportCreateResponse {
  import DateTimeCodecs._

  implicit val LeadsExportCreateResponseCodecJson: CodecJson[LeadsExportCreateResponse] = CodecJson.derive[LeadsExportCreateResponse]
  implicit val LeadsExportCreateResponseDecoder: EntityDecoder[LeadsExportCreateResponse] = jsonOf[LeadsExportCreateResponse]
  implicit val LeadsExportCreateResponseEncoder: EntityEncoder[LeadsExportCreateResponse] = jsonEncoderOf[LeadsExportCreateResponse]
}
