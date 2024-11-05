package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TargetingTemplateAudienceSizingReachEstimate

/**
 * Gets an audience size estimate for a set of given targeting spec data. <p>Returns:</p> An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
 * @param reachUnderscoreestimate 
 */
case class TargetingTemplateAudienceSizing(reachUnderscoreestimate: Option[TargetingTemplateAudienceSizingReachEstimate]
                )

object TargetingTemplateAudienceSizing {
    /**
     * Creates the codec for converting TargetingTemplateAudienceSizing from and to JSON.
     */
    implicit val decoder: Decoder[TargetingTemplateAudienceSizing] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingTemplateAudienceSizing] = deriveEncoder
}
