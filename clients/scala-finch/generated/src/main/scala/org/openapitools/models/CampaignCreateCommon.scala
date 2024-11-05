package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EntityStatus
import org.openapitools.models.TrackingUrls

/**
 * 
 * @param adUnderscoreaccountUnderscoreid Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
 * @param name Campaign name.
 * @param status 
 * @param lifetimeUnderscorespendUnderscorecap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
 * @param dailyUnderscorespendUnderscorecap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
 * @param orderUnderscorelineUnderscoreid Order line ID that appears on the invoice.
 * @param trackingUnderscoreurls 
 * @param startUnderscoretime Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @param endUnderscoretime Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @param isUnderscoreflexibleUnderscoredailyUnderscorebudgets Determine if a campaign has flexible daily budgets setup.
 * @param defaultUnderscoreadUnderscoregroupUnderscorebudgetUnderscoreinUnderscoremicroUnderscorecurrency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
 * @param isUnderscoreautomatedUnderscorecampaign Specifies whether the campaign was created in the automated campaign flow
 */
case class CampaignCreateCommon(adUnderscoreaccountUnderscoreid: Option[String],
                name: Option[String],
                status: Option[EntityStatus],
                lifetimeUnderscorespendUnderscorecap: Option[Int],
                dailyUnderscorespendUnderscorecap: Option[Int],
                orderUnderscorelineUnderscoreid: Option[String],
                trackingUnderscoreurls: Option[TrackingUrls],
                startUnderscoretime: Option[Int],
                endUnderscoretime: Option[Int],
                isUnderscoreflexibleUnderscoredailyUnderscorebudgets: Option[Boolean],
                defaultUnderscoreadUnderscoregroupUnderscorebudgetUnderscoreinUnderscoremicroUnderscorecurrency: Option[Int],
                isUnderscoreautomatedUnderscorecampaign: Option[Boolean]
                )

object CampaignCreateCommon {
    /**
     * Creates the codec for converting CampaignCreateCommon from and to JSON.
     */
    implicit val decoder: Decoder[CampaignCreateCommon] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignCreateCommon] = deriveEncoder
}
