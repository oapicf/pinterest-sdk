package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupCommonOptimizationGoalMetadata._

case class AdGroupCommonOptimizationGoalMetadata (
  conversionTagV3GoalMetadata: Option[OptimizationGoalMetadataConversionTagV3GoalMetadata],
frequencyGoalMetadata: Option[OptimizationGoalMetadataFrequencyGoalMetadata],
scrollupGoalMetadata: Option[OptimizationGoalMetadataScrollupGoalMetadata])

object AdGroupCommonOptimizationGoalMetadata {
  import DateTimeCodecs._

  implicit val AdGroupCommonOptimizationGoalMetadataCodecJson: CodecJson[AdGroupCommonOptimizationGoalMetadata] = CodecJson.derive[AdGroupCommonOptimizationGoalMetadata]
  implicit val AdGroupCommonOptimizationGoalMetadataDecoder: EntityDecoder[AdGroupCommonOptimizationGoalMetadata] = jsonOf[AdGroupCommonOptimizationGoalMetadata]
  implicit val AdGroupCommonOptimizationGoalMetadataEncoder: EntityEncoder[AdGroupCommonOptimizationGoalMetadata] = jsonEncoderOf[AdGroupCommonOptimizationGoalMetadata]
}
