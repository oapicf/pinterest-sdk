package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EventQualityScore._

case class EventQualityScore (
  ingestionSource: IngestionSourceOptions,
lookbackPeriod: LookbackPeriodOptions,
overallStatus: OverallStatusOptions,
qualityComponents: QualityComponents,
sourcePlatform: SourcePlatformOptions)

object EventQualityScore {
  import DateTimeCodecs._

  implicit val EventQualityScoreCodecJson: CodecJson[EventQualityScore] = CodecJson.derive[EventQualityScore]
  implicit val EventQualityScoreDecoder: EntityDecoder[EventQualityScore] = jsonOf[EventQualityScore]
  implicit val EventQualityScoreEncoder: EntityEncoder[EventQualityScore] = jsonEncoderOf[EventQualityScore]
}
