package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CampaignResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class CampaignsList200Response(items: Seq[CampaignResponse],
                bookmark: Option[String]
                )

object CampaignsList200Response {
    /**
     * Creates the codec for converting CampaignsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[CampaignsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignsList200Response] = deriveEncoder
}
