package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleBatchUpdate._

case class ScheduleBatchUpdate (
  deltaValue: Option[ScheduleDeltaValue],
/* Schedule end time. Unix timestamp in seconds. */
  endTimestamp: Option[Integer],
/* entity ID. */
  entityId: Option[String],
/* Specify the entity_type to get summary information */
  entityType: Option[AdAccountEntityType],
id: String,
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

object ScheduleBatchUpdate {
  import DateTimeCodecs._

  implicit val ScheduleBatchUpdateCodecJson: CodecJson[ScheduleBatchUpdate] = CodecJson.derive[ScheduleBatchUpdate]
  implicit val ScheduleBatchUpdateDecoder: EntityDecoder[ScheduleBatchUpdate] = jsonOf[ScheduleBatchUpdate]
  implicit val ScheduleBatchUpdateEncoder: EntityEncoder[ScheduleBatchUpdate] = jsonEncoderOf[ScheduleBatchUpdate]
}
