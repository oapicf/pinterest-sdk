package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReportingTimeZone._

case class ReportingTimeZone (
  
object ReportingTimeZone {
  import DateTimeCodecs._

  implicit val ReportingTimeZoneCodecJson: CodecJson[ReportingTimeZone] = CodecJson.derive[ReportingTimeZone]
  implicit val ReportingTimeZoneDecoder: EntityDecoder[ReportingTimeZone] = jsonOf[ReportingTimeZone]
  implicit val ReportingTimeZoneEncoder: EntityEncoder[ReportingTimeZone] = jsonEncoderOf[ReportingTimeZone]
}
