package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows

/**
 * 
 * @param attributionUnderscorewindows 
 * @param conversionUnderscoreevent 
 * @param conversionUnderscoretagUnderscoreid 
 * @param cpaUnderscoregoalUnderscorevalueUnderscoreinUnderscoremicroUnderscorecurrency 
 * @param isUnderscoreroasUnderscoreoptimized ROAS optimization is not supported
 * @param learningUnderscoremodeUnderscoretype Conversion learning model type
 */
case class OptimizationGoalMetadataConversionTagV3GoalMetadata(attributionUnderscorewindows: Option[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows],
                conversionUnderscoreevent: Option[String],
                conversionUnderscoretagUnderscoreid: Option[String],
                cpaUnderscoregoalUnderscorevalueUnderscoreinUnderscoremicroUnderscorecurrency: Option[String],
                isUnderscoreroasUnderscoreoptimized: Option[Boolean],
                learningUnderscoremodeUnderscoretype: Option[String]
                )

object OptimizationGoalMetadataConversionTagV3GoalMetadata {
    /**
     * Creates the codec for converting OptimizationGoalMetadataConversionTagV3GoalMetadata from and to JSON.
     */
    implicit val decoder: Decoder[OptimizationGoalMetadataConversionTagV3GoalMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[OptimizationGoalMetadataConversionTagV3GoalMetadata] = deriveEncoder
}
