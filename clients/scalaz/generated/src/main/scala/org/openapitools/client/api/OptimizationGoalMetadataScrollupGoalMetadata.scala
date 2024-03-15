package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OptimizationGoalMetadataScrollupGoalMetadata._

case class OptimizationGoalMetadataScrollupGoalMetadata (
  scrollupGoalValueInMicroCurrency: Option[String])

object OptimizationGoalMetadataScrollupGoalMetadata {
  import DateTimeCodecs._

  implicit val OptimizationGoalMetadataScrollupGoalMetadataCodecJson: CodecJson[OptimizationGoalMetadataScrollupGoalMetadata] = CodecJson.derive[OptimizationGoalMetadataScrollupGoalMetadata]
  implicit val OptimizationGoalMetadataScrollupGoalMetadataDecoder: EntityDecoder[OptimizationGoalMetadataScrollupGoalMetadata] = jsonOf[OptimizationGoalMetadataScrollupGoalMetadata]
  implicit val OptimizationGoalMetadataScrollupGoalMetadataEncoder: EntityEncoder[OptimizationGoalMetadataScrollupGoalMetadata] = jsonEncoderOf[OptimizationGoalMetadataScrollupGoalMetadata]
}
