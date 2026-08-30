package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleType._

case class ScheduleType (
  
object ScheduleType {
  import DateTimeCodecs._

  implicit val ScheduleTypeCodecJson: CodecJson[ScheduleType] = CodecJson.derive[ScheduleType]
  implicit val ScheduleTypeDecoder: EntityDecoder[ScheduleType] = jsonOf[ScheduleType]
  implicit val ScheduleTypeEncoder: EntityEncoder[ScheduleType] = jsonEncoderOf[ScheduleType]
}
