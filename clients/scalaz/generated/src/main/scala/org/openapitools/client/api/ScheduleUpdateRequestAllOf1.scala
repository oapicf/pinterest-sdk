package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleUpdateRequestAllOf1._

case class ScheduleUpdateRequestAllOf1 (
  entityId: Option[String],
/* Entity type */
  entityType: Option[String],
/* Schedule ID. */
  id: String)

object ScheduleUpdateRequestAllOf1 {
  import DateTimeCodecs._

  implicit val ScheduleUpdateRequestAllOf1CodecJson: CodecJson[ScheduleUpdateRequestAllOf1] = CodecJson.derive[ScheduleUpdateRequestAllOf1]
  implicit val ScheduleUpdateRequestAllOf1Decoder: EntityDecoder[ScheduleUpdateRequestAllOf1] = jsonOf[ScheduleUpdateRequestAllOf1]
  implicit val ScheduleUpdateRequestAllOf1Encoder: EntityEncoder[ScheduleUpdateRequestAllOf1] = jsonEncoderOf[ScheduleUpdateRequestAllOf1]
}
