package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AudienceCategory
import org.openapitools.models.AudienceDemographics
import org.openapitools.models.AudienceInsightType
import scala.collection.immutable.Seq

/**
 * Audience interests and demographics.
 * @param categories Category interest distribution
 * @param demographics 
 * @param _type 
 * @param date Generation date
 * @param size Population count.
 * @param sizeUnderscoreisUnderscoreupperUnderscorebound Indicates whether the audience size has been rounded up to the next highest upper boundary.
 */
case class AudienceInsightsResponse(categories: Option[Seq[AudienceCategory]],
                demographics: Option[AudienceDemographics],
                _type: Option[AudienceInsightType],
                date: Option[String],
                size: Option[Int],
                sizeUnderscoreisUnderscoreupperUnderscorebound: Option[Boolean]
                )

object AudienceInsightsResponse {
    /**
     * Creates the codec for converting AudienceInsightsResponse from and to JSON.
     */
    implicit val decoder: Decoder[AudienceInsightsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceInsightsResponse] = deriveEncoder
}
