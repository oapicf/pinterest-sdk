package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param frequency 
 * @param timerange User entity counts time range
 */
case class OptimizationGoalMetadataFrequencyGoalMetadata(frequency: Option[Int],
                timerange: Option[String]
                )

object OptimizationGoalMetadataFrequencyGoalMetadata {
    /**
     * Creates the codec for converting OptimizationGoalMetadataFrequencyGoalMetadata from and to JSON.
     */
    implicit val decoder: Decoder[OptimizationGoalMetadataFrequencyGoalMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[OptimizationGoalMetadataFrequencyGoalMetadata] = deriveEncoder
}
