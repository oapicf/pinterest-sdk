package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param clickUnderscorewindowUnderscoredays 
 * @param engagementUnderscorewindowUnderscoredays 
 * @param viewUnderscorewindowUnderscoredays 
 */
case class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows(clickUnderscorewindowUnderscoredays: Option[Int],
                engagementUnderscorewindowUnderscoredays: Option[Int],
                viewUnderscorewindowUnderscoredays: Option[Int]
                )

object OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows {
    /**
     * Creates the codec for converting OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows from and to JSON.
     */
    implicit val decoder: Decoder[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows] = deriveDecoder
    implicit val encoder: ObjectEncoder[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows] = deriveEncoder
}
