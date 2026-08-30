package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NullableOptimizationGoalMetadata._

case class NullableOptimizationGoalMetadata (
  conversionTagV3GoalMetadata: Option[ConversionTagV3GoalMetadata],
frequencyGoalMetadata: Option[FrequencyGoalMetadata],
scrollupGoalMetadata: Option[ScrollupGoalMetadata])

object NullableOptimizationGoalMetadata {
  import DateTimeCodecs._

  implicit val NullableOptimizationGoalMetadataCodecJson: CodecJson[NullableOptimizationGoalMetadata] = CodecJson.derive[NullableOptimizationGoalMetadata]
  implicit val NullableOptimizationGoalMetadataDecoder: EntityDecoder[NullableOptimizationGoalMetadata] = jsonOf[NullableOptimizationGoalMetadata]
  implicit val NullableOptimizationGoalMetadataEncoder: EntityEncoder[NullableOptimizationGoalMetadata] = jsonEncoderOf[NullableOptimizationGoalMetadata]
}
