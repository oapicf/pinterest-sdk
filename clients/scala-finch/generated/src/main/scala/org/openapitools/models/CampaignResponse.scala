package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdCommonTrackingUrls
import org.openapitools.models.CampaignSummaryStatus
import org.openapitools.models.EntityStatus
import org.openapitools.models.ObjectiveType

/**
 * 
 * @param id Campaign ID.
 * @param adUnderscoreaccountUnderscoreid Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
 * @param name Campaign name.
 * @param status 
 * @param lifetimeUnderscorespendUnderscorecap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
 * @param dailyUnderscorespendUnderscorecap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
 * @param orderUnderscorelineUnderscoreid Order line ID that appears on the invoice.
 * @param trackingUnderscoreurls 
 * @param startUnderscoretime Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @param endUnderscoretime Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @param summaryUnderscorestatus 
 * @param objectiveUnderscoretype 
 * @param createdUnderscoretime Campaign creation time. Unix timestamp in seconds.
 * @param updatedUnderscoretime UTC timestamp. Last update time.
 * @param _type Always \"campaign\".
 * @param isUnderscoreflexibleUnderscoredailyUnderscorebudgets Determines if a campaign has flexible daily budgets setup.
 * @param isUnderscorecampaignUnderscorebudgetUnderscoreoptimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
 */
case class CampaignResponse(id: Option[String],
                adUnderscoreaccountUnderscoreid: Option[String],
                name: Option[String],
                status: Option[EntityStatus],
                lifetimeUnderscorespendUnderscorecap: Option[Int],
                dailyUnderscorespendUnderscorecap: Option[Int],
                orderUnderscorelineUnderscoreid: Option[String],
                trackingUnderscoreurls: Option[AdCommonTrackingUrls],
                startUnderscoretime: Option[Int],
                endUnderscoretime: Option[Int],
                summaryUnderscorestatus: Option[CampaignSummaryStatus],
                objectiveUnderscoretype: Option[ObjectiveType],
                createdUnderscoretime: Option[Int],
                updatedUnderscoretime: Option[Int],
                _type: Option[String],
                isUnderscoreflexibleUnderscoredailyUnderscorebudgets: Option[Boolean],
                isUnderscorecampaignUnderscorebudgetUnderscoreoptimization: Option[Boolean]
                )

object CampaignResponse {
    /**
     * Creates the codec for converting CampaignResponse from and to JSON.
     */
    implicit val decoder: Decoder[CampaignResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignResponse] = deriveEncoder
}
