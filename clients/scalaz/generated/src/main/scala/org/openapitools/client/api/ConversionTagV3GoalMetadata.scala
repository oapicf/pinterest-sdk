package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionTagV3GoalMetadata._

case class ConversionTagV3GoalMetadata (
  attributionWindows: Option[AttributionWindows],
conversionEvent: Option[ConversionEvent],
conversionTagId: Option[String],
cpaGoalValueInMicroCurrency: Option[String],
/* Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). */
  isRoasOptimized: Option[Boolean],
/* Event name for custom or standard events mapped to an oCPM model */
  reportingEvent: Option[String])

object ConversionTagV3GoalMetadata {
  import DateTimeCodecs._

  implicit val ConversionTagV3GoalMetadataCodecJson: CodecJson[ConversionTagV3GoalMetadata] = CodecJson.derive[ConversionTagV3GoalMetadata]
  implicit val ConversionTagV3GoalMetadataDecoder: EntityDecoder[ConversionTagV3GoalMetadata] = jsonOf[ConversionTagV3GoalMetadata]
  implicit val ConversionTagV3GoalMetadataEncoder: EntityEncoder[ConversionTagV3GoalMetadata] = jsonEncoderOf[ConversionTagV3GoalMetadata]
}
