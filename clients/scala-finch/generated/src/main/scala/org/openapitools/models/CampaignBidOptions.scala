package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AppTypeMultipliers
import org.openapitools.models.CampaignAudienceMultipliers
import org.openapitools.models.PlacementMultipliers

/**
 * Object describing the campaign level bid multipliers.
 * @param appUnderscoretypeUnderscoremultipliers 
 * @param audienceUnderscoremultipliers 
 * @param placementUnderscoremultipliers 
 */
case class CampaignBidOptions(appUnderscoretypeUnderscoremultipliers: Option[AppTypeMultipliers],
                audienceUnderscoremultipliers: Option[CampaignAudienceMultipliers],
                placementUnderscoremultipliers: Option[PlacementMultipliers]
                )

object CampaignBidOptions {
    /**
     * Creates the codec for converting CampaignBidOptions from and to JSON.
     */
    implicit val decoder: Decoder[CampaignBidOptions] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignBidOptions] = deriveEncoder
}
