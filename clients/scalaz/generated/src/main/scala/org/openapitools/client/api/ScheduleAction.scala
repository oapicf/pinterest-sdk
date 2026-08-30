package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleAction._

case class ScheduleAction (
  
object ScheduleAction {
  import DateTimeCodecs._

  implicit val ScheduleActionCodecJson: CodecJson[ScheduleAction] = CodecJson.derive[ScheduleAction]
  implicit val ScheduleActionDecoder: EntityDecoder[ScheduleAction] = jsonOf[ScheduleAction]
  implicit val ScheduleActionEncoder: EntityEncoder[ScheduleAction] = jsonEncoderOf[ScheduleAction]
}
