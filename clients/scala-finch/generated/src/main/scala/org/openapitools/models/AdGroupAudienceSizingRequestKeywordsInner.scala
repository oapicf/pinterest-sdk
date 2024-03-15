package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MatchTypeResponse

/**
 * 
 * @param matchUnderscoretype 
 * @param value Keyword value (120 chars max).
 */
case class AdGroupAudienceSizingRequestKeywordsInner(matchUnderscoretype: MatchTypeResponse,
                value: String
                )

object AdGroupAudienceSizingRequestKeywordsInner {
    /**
     * Creates the codec for converting AdGroupAudienceSizingRequestKeywordsInner from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupAudienceSizingRequestKeywordsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupAudienceSizingRequestKeywordsInner] = deriveEncoder
}
