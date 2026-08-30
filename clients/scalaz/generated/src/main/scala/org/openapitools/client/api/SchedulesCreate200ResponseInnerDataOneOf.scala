package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SchedulesCreate200ResponseInnerDataOneOf._

case class SchedulesCreate200ResponseInnerDataOneOf (
  id: String,
/* Schedule ID. */
  scheduleId: String,
exceptions: Error)

object SchedulesCreate200ResponseInnerDataOneOf {
  import DateTimeCodecs._

  implicit val SchedulesCreate200ResponseInnerDataOneOfCodecJson: CodecJson[SchedulesCreate200ResponseInnerDataOneOf] = CodecJson.derive[SchedulesCreate200ResponseInnerDataOneOf]
  implicit val SchedulesCreate200ResponseInnerDataOneOfDecoder: EntityDecoder[SchedulesCreate200ResponseInnerDataOneOf] = jsonOf[SchedulesCreate200ResponseInnerDataOneOf]
  implicit val SchedulesCreate200ResponseInnerDataOneOfEncoder: EntityEncoder[SchedulesCreate200ResponseInnerDataOneOf] = jsonEncoderOf[SchedulesCreate200ResponseInnerDataOneOf]
}
