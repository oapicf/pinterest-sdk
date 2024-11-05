package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadsExportResponseData._

case class LeadsExportResponseData (
  exportStatus: Option[LeadsExportStatus],
downloadUrl: Option[String])

object LeadsExportResponseData {
  import DateTimeCodecs._

  implicit val LeadsExportResponseDataCodecJson: CodecJson[LeadsExportResponseData] = CodecJson.derive[LeadsExportResponseData]
  implicit val LeadsExportResponseDataDecoder: EntityDecoder[LeadsExportResponseData] = jsonOf[LeadsExportResponseData]
  implicit val LeadsExportResponseDataEncoder: EntityEncoder[LeadsExportResponseData] = jsonEncoderOf[LeadsExportResponseData]
}
