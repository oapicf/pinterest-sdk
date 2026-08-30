package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleUpdateRequest._

case class ScheduleUpdateRequest (
  entityId: Option[String],
/* Entity type */
  entityType: Option[String],
/* Schedule ID. */
  id: String,
deltaValue: Option[ScheduleCommonDeltaValue],
/* Schedule end time. Unix timestamp in seconds. */
  endTimestamp: Option[Integer],
name: Option[String],
scheduleAction: Option[ScheduleAction],
scheduleStatus: Option[ScheduleStatus],
scheduleType: Option[ScheduleType],
/* Schedule start time. Unix timestamp in seconds. */
  startTimestamp: Option[Integer])

object ScheduleUpdateRequest {
  import DateTimeCodecs._

  implicit val ScheduleUpdateRequestCodecJson: CodecJson[ScheduleUpdateRequest] = CodecJson.derive[ScheduleUpdateRequest]
  implicit val ScheduleUpdateRequestDecoder: EntityDecoder[ScheduleUpdateRequest] = jsonOf[ScheduleUpdateRequest]
  implicit val ScheduleUpdateRequestEncoder: EntityEncoder[ScheduleUpdateRequest] = jsonEncoderOf[ScheduleUpdateRequest]
}
