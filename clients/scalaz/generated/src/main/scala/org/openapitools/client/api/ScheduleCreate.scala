package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleCreate._

case class ScheduleCreate (
  deltaValue: Option[ScheduleDeltaValue],
/* Schedule end time. Unix timestamp in seconds. */
  endTimestamp: Option[Integer],
/* entity ID. */
  entityId: String,
/* Specify the entity_type to get summary information */
  entityType: Option[AdAccountEntityType],
/* Schedule name. */
  name: Option[String],
/* The schedule action. */
  scheduleAction: Option[ScheduleAction],
/* Schedule status. */
  scheduleStatus: Option[ScheduleStatus],
/* The schedule type. */
  scheduleType: Option[ScheduleType],
/* Schedule start time. Unix timestamp in seconds. */
  startTimestamp: Option[Integer])

object ScheduleCreate {
  import DateTimeCodecs._

  implicit val ScheduleCreateCodecJson: CodecJson[ScheduleCreate] = CodecJson.derive[ScheduleCreate]
  implicit val ScheduleCreateDecoder: EntityDecoder[ScheduleCreate] = jsonOf[ScheduleCreate]
  implicit val ScheduleCreateEncoder: EntityEncoder[ScheduleCreate] = jsonEncoderOf[ScheduleCreate]
}
