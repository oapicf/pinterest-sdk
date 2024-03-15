package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ActionType
import org.openapitools.models.AdGroupCommonOptimizationGoalMetadata
import org.openapitools.models.AdGroupCommonTrackingUrls
import org.openapitools.models.AdGroupSummaryStatus
import org.openapitools.models.AnyType
import org.openapitools.models.BudgetType
import org.openapitools.models.EntityStatus
import org.openapitools.models.PacingDeliveryType
import org.openapitools.models.PlacementGroupType
import org.openapitools.models.TargetingSpec

/**
 * 
 * @param name Ad group name.
 * @param status Ad group/entity status.
 * @param budgetUnderscoreinUnderscoremicroUnderscorecurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @param bidUnderscoreinUnderscoremicroUnderscorecurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
 * @param optimizationUnderscoregoalUnderscoremetadata 
 * @param budgetUnderscoretype 
 * @param startUnderscoretime Ad group start time. Unix timestamp in seconds. Defaults to current time.
 * @param endUnderscoretime Ad group end time. Unix timestamp in seconds.
 * @param targetingUnderscorespec 
 * @param lifetimeUnderscorefrequencyUnderscorecap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @param trackingUnderscoreurls 
 * @param autoUnderscoretargetingUnderscoreenabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @param placementUnderscoregroup <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @param pacingUnderscoredeliveryUnderscoretype 
 * @param campaignUnderscoreid Campaign ID of the ad group.
 * @param billableUnderscoreevent 
 * @param bidUnderscorestrategyUnderscoretype Bid strategy type
 * @param id Ad group ID.
 * @param adUnderscoreaccountUnderscoreid Advertiser ID.
 * @param createdUnderscoretime Ad group creation time. Unix timestamp in seconds.
 * @param updatedUnderscoretime Ad group last update time. Unix timestamp in seconds.
 * @param _type Always \"adgroup\".
 * @param conversionUnderscorelearningUnderscoremodeUnderscoretype oCPM learn mode
 * @param summaryUnderscorestatus Ad group summary status.
 * @param feedUnderscoreprofileUnderscoreid Feed Profile ID associated to the adgroup.
 * @param dcaUnderscoreassets [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
 */
case class AdGroupResponse(name: Option[String],
                status: Option[EntityStatus],
                budgetUnderscoreinUnderscoremicroUnderscorecurrency: Option[Int],
                bidUnderscoreinUnderscoremicroUnderscorecurrency: Option[Int],
                optimizationUnderscoregoalUnderscoremetadata: Option[AdGroupCommonOptimizationGoalMetadata],
                budgetUnderscoretype: Option[BudgetType],
                startUnderscoretime: Option[Int],
                endUnderscoretime: Option[Int],
                targetingUnderscorespec: Option[TargetingSpec],
                lifetimeUnderscorefrequencyUnderscorecap: Option[Int],
                trackingUnderscoreurls: Option[AdGroupCommonTrackingUrls],
                autoUnderscoretargetingUnderscoreenabled: Option[Boolean],
                placementUnderscoregroup: Option[PlacementGroupType],
                pacingUnderscoredeliveryUnderscoretype: Option[PacingDeliveryType],
                campaignUnderscoreid: Option[String],
                billableUnderscoreevent: Option[ActionType],
                bidUnderscorestrategyUnderscoretype: Option[String],
                id: Option[String],
                adUnderscoreaccountUnderscoreid: Option[String],
                createdUnderscoretime: Option[Int],
                updatedUnderscoretime: Option[Int],
                _type: Option[String],
                conversionUnderscorelearningUnderscoremodeUnderscoretype: Option[String],
                summaryUnderscorestatus: Option[AdGroupSummaryStatus],
                feedUnderscoreprofileUnderscoreid: Option[String],
                dcaUnderscoreassets: Option[AnyType]
                )

object AdGroupResponse {
    /**
     * Creates the codec for converting AdGroupResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupResponse] = deriveEncoder
}
