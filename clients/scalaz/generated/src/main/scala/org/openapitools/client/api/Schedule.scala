package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Schedule._

case class Schedule (
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
/* Schedule ID. */
  scheduleId: String,
/* Schedule status. */
  scheduleStatus: Option[ScheduleStatus],
/* The schedule type. */
  scheduleType: Option[ScheduleType],
/* Schedule start time. Unix timestamp in seconds. */
  startTimestamp: Option[Integer])

object Schedule {
  import DateTimeCodecs._

  implicit val ScheduleCodecJson: CodecJson[Schedule] = CodecJson.derive[Schedule]
  implicit val ScheduleDecoder: EntityDecoder[Schedule] = jsonOf[Schedule]
  implicit val ScheduleEncoder: EntityEncoder[Schedule] = jsonEncoderOf[Schedule]
}
