package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AppTypeMultipliers
import org.openapitools.models.CampaignAudienceMultipliers
import org.openapitools.models.PlacementMultipliers
import scala.collection.immutable.Seq

/**
 * Object describing an update to the campaign level bid multipliers.
 * @param appUnderscoretypeUnderscoremultipliers 
 * @param audienceUnderscoremultipliers 
 * @param placementUnderscoremultipliers 
 * @param updateUnderscoremask List of fields to update, only the fields in the list will be updated.
 */
case class CampaignBidOptionsUpdate(appUnderscoretypeUnderscoremultipliers: Option[AppTypeMultipliers],
                audienceUnderscoremultipliers: Option[CampaignAudienceMultipliers],
                placementUnderscoremultipliers: Option[PlacementMultipliers],
                updateUnderscoremask: Seq[String]
                )

object CampaignBidOptionsUpdate {
    /**
     * Creates the codec for converting CampaignBidOptionsUpdate from and to JSON.
     */
    implicit val decoder: Decoder[CampaignBidOptionsUpdate] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignBidOptionsUpdate] = deriveEncoder
}
