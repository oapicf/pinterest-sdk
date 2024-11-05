package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param estimate 
 * @param lowerUnderscorebound 
 * @param upperUnderscorebound 
 */
case class TargetingTemplateAudienceSizingReachEstimate(estimate: Option[Long],
                lowerUnderscorebound: Option[Long],
                upperUnderscorebound: Option[Long]
                )

object TargetingTemplateAudienceSizingReachEstimate {
    /**
     * Creates the codec for converting TargetingTemplateAudienceSizingReachEstimate from and to JSON.
     */
    implicit val decoder: Decoder[TargetingTemplateAudienceSizingReachEstimate] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingTemplateAudienceSizingReachEstimate] = deriveEncoder
}
