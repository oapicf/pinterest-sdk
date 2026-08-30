package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReportingColumnSync._

case class ReportingColumnSync (
  
object ReportingColumnSync {
  import DateTimeCodecs._

  implicit val ReportingColumnSyncCodecJson: CodecJson[ReportingColumnSync] = CodecJson.derive[ReportingColumnSync]
  implicit val ReportingColumnSyncDecoder: EntityDecoder[ReportingColumnSync] = jsonOf[ReportingColumnSync]
  implicit val ReportingColumnSyncEncoder: EntityEncoder[ReportingColumnSync] = jsonEncoderOf[ReportingColumnSync]
}
