package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CampaignCommon
import org.openapitools.models.CampaignResponseAllOf
import org.openapitools.models.CampaignResponseAllOf1
import org.openapitools.models.EntityStatus
import org.openapitools.models.ObjectiveType
import org.openapitools.models.TrackingUrls

/**
 * 
 * @param id Campaign ID.
 * @param adUnderscoreaccountUnderscoreid Campaign's Advertiser ID.
 * @param name Campaign name.
 * @param status 
 * @param lifetimeUnderscorespendUnderscorecap Campaign total spending cap.
 * @param dailyUnderscorespendUnderscorecap Campaign daily spending cap.
 * @param orderUnderscorelineUnderscoreid Order line ID that appears on the invoice.
 * @param trackingUnderscoreurls 
 * @param startUnderscoretime Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @param endUnderscoretime Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @param objectiveUnderscoretype 
 * @param createdUnderscoretime Campaign creation time. Unix timestamp in seconds.
 * @param updatedUnderscoretime UTC timestamp. Last update time.
 * @param _type Always \"campaign\".
 */
case class CampaignResponse(id: String,
                adUnderscoreaccountUnderscoreid: String,
                name: Option[String],
                status: Option[EntityStatus],
                lifetimeUnderscorespendUnderscorecap: Option[Int],
                dailyUnderscorespendUnderscorecap: Option[Int],
                orderUnderscorelineUnderscoreid: Option[String],
                trackingUnderscoreurls: Option[TrackingUrls],
                startUnderscoretime: Option[Int],
                endUnderscoretime: Option[Int],
                objectiveUnderscoretype: Option[ObjectiveType],
                createdUnderscoretime: Option[Int],
                updatedUnderscoretime: Option[Int],
                _type: Option[String]
                )

object CampaignResponse {
    /**
     * Creates the codec for converting CampaignResponse from and to JSON.
     */
    implicit val decoder: Decoder[CampaignResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignResponse] = deriveEncoder
}
