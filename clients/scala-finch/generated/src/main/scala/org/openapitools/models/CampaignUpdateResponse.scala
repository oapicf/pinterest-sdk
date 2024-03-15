package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CampaignCreateResponseItem
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class CampaignUpdateResponse(items: Option[Seq[CampaignCreateResponseItem]]
                )

object CampaignUpdateResponse {
    /**
     * Creates the codec for converting CampaignUpdateResponse from and to JSON.
     */
    implicit val decoder: Decoder[CampaignUpdateResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignUpdateResponse] = deriveEncoder
}
