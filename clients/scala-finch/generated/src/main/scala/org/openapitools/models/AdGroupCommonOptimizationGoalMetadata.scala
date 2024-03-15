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
 * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 * @param conversionUnderscoretagUnderscorev3UnderscoregoalUnderscoremetadata 
 * @param frequencyUnderscoregoalUnderscoremetadata 
 * @param scrollupUnderscoregoalUnderscoremetadata 
 */
case class AdGroupCommonOptimizationGoalMetadata(conversionUnderscoretagUnderscorev3UnderscoregoalUnderscoremetadata: Option[OptimizationGoalMetadataConversionTagV3GoalMetadata],
                frequencyUnderscoregoalUnderscoremetadata: Option[OptimizationGoalMetadataFrequencyGoalMetadata],
                scrollupUnderscoregoalUnderscoremetadata: Option[OptimizationGoalMetadataScrollupGoalMetadata]
                )

object AdGroupCommonOptimizationGoalMetadata {
    /**
     * Creates the codec for converting AdGroupCommonOptimizationGoalMetadata from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupCommonOptimizationGoalMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupCommonOptimizationGoalMetadata] = deriveEncoder
}
