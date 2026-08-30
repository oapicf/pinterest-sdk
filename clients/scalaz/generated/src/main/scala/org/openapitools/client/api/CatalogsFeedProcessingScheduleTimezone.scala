package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedProcessingScheduleTimezone._

case class CatalogsFeedProcessingScheduleTimezone (
  
object CatalogsFeedProcessingScheduleTimezone {
  import DateTimeCodecs._

  implicit val CatalogsFeedProcessingScheduleTimezoneCodecJson: CodecJson[CatalogsFeedProcessingScheduleTimezone] = CodecJson.derive[CatalogsFeedProcessingScheduleTimezone]
  implicit val CatalogsFeedProcessingScheduleTimezoneDecoder: EntityDecoder[CatalogsFeedProcessingScheduleTimezone] = jsonOf[CatalogsFeedProcessingScheduleTimezone]
  implicit val CatalogsFeedProcessingScheduleTimezoneEncoder: EntityEncoder[CatalogsFeedProcessingScheduleTimezone] = jsonEncoderOf[CatalogsFeedProcessingScheduleTimezone]
}
