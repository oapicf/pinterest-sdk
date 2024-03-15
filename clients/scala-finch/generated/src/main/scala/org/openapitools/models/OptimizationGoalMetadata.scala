package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OptimizationGoalMetadataConversionTagV3GoalMetadata
import org.openapitools.models.OptimizationGoalMetadataFrequencyGoalMetadata
import org.openapitools.models.OptimizationGoalMetadataScrollupGoalMetadata

/**
 * 
 * @param conversionUnderscoretagUnderscorev3UnderscoregoalUnderscoremetadata 
 * @param frequencyUnderscoregoalUnderscoremetadata 
 * @param scrollupUnderscoregoalUnderscoremetadata 
 */
case class OptimizationGoalMetadata(conversionUnderscoretagUnderscorev3UnderscoregoalUnderscoremetadata: Option[OptimizationGoalMetadataConversionTagV3GoalMetadata],
                frequencyUnderscoregoalUnderscoremetadata: Option[OptimizationGoalMetadataFrequencyGoalMetadata],
                scrollupUnderscoregoalUnderscoremetadata: Option[OptimizationGoalMetadataScrollupGoalMetadata]
                )

object OptimizationGoalMetadata {
    /**
     * Creates the codec for converting OptimizationGoalMetadata from and to JSON.
     */
    implicit val decoder: Decoder[OptimizationGoalMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[OptimizationGoalMetadata] = deriveEncoder
}
