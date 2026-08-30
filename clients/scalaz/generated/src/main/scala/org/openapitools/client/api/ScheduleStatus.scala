package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleStatus._

case class ScheduleStatus (
  
object ScheduleStatus {
  import DateTimeCodecs._

  implicit val ScheduleStatusCodecJson: CodecJson[ScheduleStatus] = CodecJson.derive[ScheduleStatus]
  implicit val ScheduleStatusDecoder: EntityDecoder[ScheduleStatus] = jsonOf[ScheduleStatus]
  implicit val ScheduleStatusEncoder: EntityEncoder[ScheduleStatus] = jsonEncoderOf[ScheduleStatus]
}
