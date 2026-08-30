package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SchedulesCreate200ResponseInnerData._

case class SchedulesCreate200ResponseInnerData (
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
  startTimestamp: Option[Integer],
id: String,
exceptions: Error)

object SchedulesCreate200ResponseInnerData {
  import DateTimeCodecs._

  implicit val SchedulesCreate200ResponseInnerDataCodecJson: CodecJson[SchedulesCreate200ResponseInnerData] = CodecJson.derive[SchedulesCreate200ResponseInnerData]
  implicit val SchedulesCreate200ResponseInnerDataDecoder: EntityDecoder[SchedulesCreate200ResponseInnerData] = jsonOf[SchedulesCreate200ResponseInnerData]
  implicit val SchedulesCreate200ResponseInnerDataEncoder: EntityEncoder[SchedulesCreate200ResponseInnerData] = jsonEncoderOf[SchedulesCreate200ResponseInnerData]
}
