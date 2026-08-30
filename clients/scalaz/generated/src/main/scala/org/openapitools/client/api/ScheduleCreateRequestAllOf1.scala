package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleCreateRequestAllOf1._

case class ScheduleCreateRequestAllOf1 (
  entityId: String,
/* Entity type */
  entityType: String)

object ScheduleCreateRequestAllOf1 {
  import DateTimeCodecs._

  implicit val ScheduleCreateRequestAllOf1CodecJson: CodecJson[ScheduleCreateRequestAllOf1] = CodecJson.derive[ScheduleCreateRequestAllOf1]
  implicit val ScheduleCreateRequestAllOf1Decoder: EntityDecoder[ScheduleCreateRequestAllOf1] = jsonOf[ScheduleCreateRequestAllOf1]
  implicit val ScheduleCreateRequestAllOf1Encoder: EntityEncoder[ScheduleCreateRequestAllOf1] = jsonEncoderOf[ScheduleCreateRequestAllOf1]
}
