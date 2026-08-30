package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleCreateRequest._

case class ScheduleCreateRequest (
  entityId: String,
/* Entity type */
  entityType: String,
deltaValue: ScheduleCommonDeltaValue,
/* Schedule end time. Unix timestamp in seconds. */
  endTimestamp: Integer,
name: String,
scheduleAction: ScheduleAction,
scheduleStatus: ScheduleStatus,
scheduleType: ScheduleType,
/* Schedule start time. Unix timestamp in seconds. */
  startTimestamp: Integer)

object ScheduleCreateRequest {
  import DateTimeCodecs._

  implicit val ScheduleCreateRequestCodecJson: CodecJson[ScheduleCreateRequest] = CodecJson.derive[ScheduleCreateRequest]
  implicit val ScheduleCreateRequestDecoder: EntityDecoder[ScheduleCreateRequest] = jsonOf[ScheduleCreateRequest]
  implicit val ScheduleCreateRequestEncoder: EntityEncoder[ScheduleCreateRequest] = jsonEncoderOf[ScheduleCreateRequest]
}
