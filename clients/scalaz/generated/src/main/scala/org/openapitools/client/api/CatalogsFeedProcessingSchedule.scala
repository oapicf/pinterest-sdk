package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedProcessingSchedule._

case class CatalogsFeedProcessingSchedule (
  /* A time in format HH:MM with leading 0 (zero) */
  time: String,
/* The timezone considered for the processing schedule time. */
  timezone: CatalogsFeedProcessingScheduleTimezone)

object CatalogsFeedProcessingSchedule {
  import DateTimeCodecs._

  implicit val CatalogsFeedProcessingScheduleCodecJson: CodecJson[CatalogsFeedProcessingSchedule] = CodecJson.derive[CatalogsFeedProcessingSchedule]
  implicit val CatalogsFeedProcessingScheduleDecoder: EntityDecoder[CatalogsFeedProcessingSchedule] = jsonOf[CatalogsFeedProcessingSchedule]
  implicit val CatalogsFeedProcessingScheduleEncoder: EntityEncoder[CatalogsFeedProcessingSchedule] = jsonEncoderOf[CatalogsFeedProcessingSchedule]
}
