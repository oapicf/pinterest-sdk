package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param audienceUnderscoresizeUnderscorelowerUnderscorebound The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
 * @param audienceUnderscoresizeUnderscoreupperUnderscorebound The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
 */
case class AdGroupAudienceSizingResponse(audienceUnderscoresizeUnderscorelowerUnderscorebound: Option[BigDecimal],
                audienceUnderscoresizeUnderscoreupperUnderscorebound: Option[BigDecimal]
                )

object AdGroupAudienceSizingResponse {
    /**
     * Creates the codec for converting AdGroupAudienceSizingResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupAudienceSizingResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupAudienceSizingResponse] = deriveEncoder
}
