package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SchedulesCreate200ResponseInner._

case class SchedulesCreate200ResponseInner (
  data: SchedulesCreate200ResponseInnerData)

object SchedulesCreate200ResponseInner {
  import DateTimeCodecs._

  implicit val SchedulesCreate200ResponseInnerCodecJson: CodecJson[SchedulesCreate200ResponseInner] = CodecJson.derive[SchedulesCreate200ResponseInner]
  implicit val SchedulesCreate200ResponseInnerDecoder: EntityDecoder[SchedulesCreate200ResponseInner] = jsonOf[SchedulesCreate200ResponseInner]
  implicit val SchedulesCreate200ResponseInnerEncoder: EntityEncoder[SchedulesCreate200ResponseInner] = jsonEncoderOf[SchedulesCreate200ResponseInner]
}
