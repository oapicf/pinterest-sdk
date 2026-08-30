package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadsExports._

case class LeadsExports (
  /* ID for the leads export job. */
  leadsExportId: Option[String])

object LeadsExports {
  import DateTimeCodecs._

  implicit val LeadsExportsCodecJson: CodecJson[LeadsExports] = CodecJson.derive[LeadsExports]
  implicit val LeadsExportsDecoder: EntityDecoder[LeadsExports] = jsonOf[LeadsExports]
  implicit val LeadsExportsEncoder: EntityEncoder[LeadsExports] = jsonEncoderOf[LeadsExports]
}
