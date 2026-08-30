package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SchedulesList200Response._

case class SchedulesList200Response (
  bookmark: Option[String],
items: List[Schedule])

object SchedulesList200Response {
  import DateTimeCodecs._

  implicit val SchedulesList200ResponseCodecJson: CodecJson[SchedulesList200Response] = CodecJson.derive[SchedulesList200Response]
  implicit val SchedulesList200ResponseDecoder: EntityDecoder[SchedulesList200Response] = jsonOf[SchedulesList200Response]
  implicit val SchedulesList200ResponseEncoder: EntityEncoder[SchedulesList200Response] = jsonEncoderOf[SchedulesList200Response]
}
