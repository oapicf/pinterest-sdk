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
case class CampaignCreateResponse(items: Option[Seq[CampaignCreateResponseItem]]
                )

object CampaignCreateResponse {
    /**
     * Creates the codec for converting CampaignCreateResponse from and to JSON.
     */
    implicit val decoder: Decoder[CampaignCreateResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignCreateResponse] = deriveEncoder
}
