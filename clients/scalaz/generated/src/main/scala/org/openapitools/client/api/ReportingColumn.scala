package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReportingColumn._

case class ReportingColumn (
  
object ReportingColumn {
  import DateTimeCodecs._

  implicit val ReportingColumnCodecJson: CodecJson[ReportingColumn] = CodecJson.derive[ReportingColumn]
  implicit val ReportingColumnDecoder: EntityDecoder[ReportingColumn] = jsonOf[ReportingColumn]
  implicit val ReportingColumnEncoder: EntityEncoder[ReportingColumn] = jsonEncoderOf[ReportingColumn]
}
