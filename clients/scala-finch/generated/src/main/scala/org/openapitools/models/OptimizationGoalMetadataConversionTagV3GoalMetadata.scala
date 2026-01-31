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
 * @param isUnderscoreroasUnderscoreoptimized Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>.
 * @param learningUnderscoremodeUnderscoretype Conversion learning model type
 * @param reportingUnderscoreevent Event name for custom or standard events mapped to an oCPM model
 */
case class OptimizationGoalMetadataConversionTagV3GoalMetadata(attributionUnderscorewindows: Option[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows],
                conversionUnderscoreevent: Option[String],
                conversionUnderscoretagUnderscoreid: Option[String],
                cpaUnderscoregoalUnderscorevalueUnderscoreinUnderscoremicroUnderscorecurrency: Option[String],
                isUnderscoreroasUnderscoreoptimized: Option[Boolean],
                learningUnderscoremodeUnderscoretype: Option[String],
                reportingUnderscoreevent: Option[String]
                )

object OptimizationGoalMetadataConversionTagV3GoalMetadata {
    /**
     * Creates the codec for converting OptimizationGoalMetadataConversionTagV3GoalMetadata from and to JSON.
     */
    implicit val decoder: Decoder[OptimizationGoalMetadataConversionTagV3GoalMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[OptimizationGoalMetadataConversionTagV3GoalMetadata] = deriveEncoder
}
