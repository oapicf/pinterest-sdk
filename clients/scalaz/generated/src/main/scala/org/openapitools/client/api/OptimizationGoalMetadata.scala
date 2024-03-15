package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OptimizationGoalMetadata._

case class OptimizationGoalMetadata (
  conversionTagV3GoalMetadata: Option[OptimizationGoalMetadataConversionTagV3GoalMetadata],
frequencyGoalMetadata: Option[OptimizationGoalMetadataFrequencyGoalMetadata],
scrollupGoalMetadata: Option[OptimizationGoalMetadataScrollupGoalMetadata])

object OptimizationGoalMetadata {
  import DateTimeCodecs._

  implicit val OptimizationGoalMetadataCodecJson: CodecJson[OptimizationGoalMetadata] = CodecJson.derive[OptimizationGoalMetadata]
  implicit val OptimizationGoalMetadataDecoder: EntityDecoder[OptimizationGoalMetadata] = jsonOf[OptimizationGoalMetadata]
  implicit val OptimizationGoalMetadataEncoder: EntityEncoder[OptimizationGoalMetadata] = jsonEncoderOf[OptimizationGoalMetadata]
}
