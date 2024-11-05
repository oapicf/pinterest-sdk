package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadsExportStatus._

case class LeadsExportStatus (
  
object LeadsExportStatus {
  import DateTimeCodecs._

  implicit val LeadsExportStatusCodecJson: CodecJson[LeadsExportStatus] = CodecJson.derive[LeadsExportStatus]
  implicit val LeadsExportStatusDecoder: EntityDecoder[LeadsExportStatus] = jsonOf[LeadsExportStatus]
  implicit val LeadsExportStatusEncoder: EntityEncoder[LeadsExportStatus] = jsonEncoderOf[LeadsExportStatus]
}
