package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CampaignBidOptionsCreate
import org.openapitools.models.EntityStatus
import org.openapitools.models.ObjectiveType
import org.openapitools.models.TrackingUrls

/**
 * 
 * @param adUnderscoreaccountUnderscoreid Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
 * @param dailyUnderscorespendUnderscorecap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
 * @param endUnderscoretime Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
 * @param isUnderscoreautomatedUnderscorecampaign Specifies whether the campaign was created in the automated campaign flow
 * @param isUnderscoreflexibleUnderscoredailyUnderscorebudgets Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\".
 * @param lifetimeUnderscorespendUnderscorecap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
 * @param name Campaign name.
 * @param orderUnderscorelineUnderscoreid Order line ID that appears on the invoice.
 * @param startUnderscoretime Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
 * @param status 
 * @param trackingUnderscoreurls 
 * @param defaultUnderscoreadUnderscoregroupUnderscorebudgetUnderscoreinUnderscoremicroUnderscorecurrency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
 * @param isUnderscorecampaignUnderscorebudgetUnderscoreoptimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
 * @param bidUnderscoreoptions 
 * @param isUnderscoreperformanceUnderscoreplus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
 * @param objectiveUnderscoretype 
 */
case class CampaignCreateRequest(adUnderscoreaccountUnderscoreid: String,
                dailyUnderscorespendUnderscorecap: Option[Int],
                endUnderscoretime: Option[Int],
                isUnderscoreautomatedUnderscorecampaign: Option[Boolean],
                isUnderscoreflexibleUnderscoredailyUnderscorebudgets: Option[Boolean],
                lifetimeUnderscorespendUnderscorecap: Option[Int],
                name: String,
                orderUnderscorelineUnderscoreid: Option[String],
                startUnderscoretime: Option[Int],
                status: Option[EntityStatus],
                trackingUnderscoreurls: Option[TrackingUrls],
                defaultUnderscoreadUnderscoregroupUnderscorebudgetUnderscoreinUnderscoremicroUnderscorecurrency: Option[Int],
                isUnderscorecampaignUnderscorebudgetUnderscoreoptimization: Option[Boolean],
                bidUnderscoreoptions: Option[CampaignBidOptionsCreate],
                isUnderscoreperformanceUnderscoreplus: Option[Boolean],
                objectiveUnderscoretype: ObjectiveType
                )

object CampaignCreateRequest {
    /**
     * Creates the codec for converting CampaignCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CampaignCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignCreateRequest] = deriveEncoder
}
