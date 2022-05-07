package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id Campaign ID.
 */
case class CampaignResponseAllOf(id: String
                )

object CampaignResponseAllOf {
    /**
     * Creates the codec for converting CampaignResponseAllOf from and to JSON.
     */
    implicit val decoder: Decoder[CampaignResponseAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignResponseAllOf] = deriveEncoder
}
