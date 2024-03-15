package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param scrollupUnderscoregoalUnderscorevalueUnderscoreinUnderscoremicroUnderscorecurrency 
 */
case class OptimizationGoalMetadataScrollupGoalMetadata(scrollupUnderscoregoalUnderscorevalueUnderscoreinUnderscoremicroUnderscorecurrency: Option[String]
                )

object OptimizationGoalMetadataScrollupGoalMetadata {
    /**
     * Creates the codec for converting OptimizationGoalMetadataScrollupGoalMetadata from and to JSON.
     */
    implicit val decoder: Decoder[OptimizationGoalMetadataScrollupGoalMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[OptimizationGoalMetadataScrollupGoalMetadata] = deriveEncoder
}
