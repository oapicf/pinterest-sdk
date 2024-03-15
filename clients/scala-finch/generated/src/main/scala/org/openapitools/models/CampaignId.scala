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
case class CampaignId(id: Option[String]
                )

object CampaignId {
    /**
     * Creates the codec for converting CampaignId from and to JSON.
     */
    implicit val decoder: Decoder[CampaignId] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignId] = deriveEncoder
}
