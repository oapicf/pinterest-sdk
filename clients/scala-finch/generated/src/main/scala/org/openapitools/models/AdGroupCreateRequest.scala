package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ActionType
import org.openapitools.models.AdGroupCommonOptimizationGoalMetadata
import org.openapitools.models.AdGroupCommonTrackingUrls
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
 * @param autoUnderscoretargetingUnderscoreenabled Enable auto-targeting for ad group.Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @param placementUnderscoregroup <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @param pacingUnderscoredeliveryUnderscoretype 
 * @param campaignUnderscoreid Campaign ID of the ad group.
 * @param billableUnderscoreevent 
 * @param bidUnderscorestrategyUnderscoretype Bid strategy type
 */
case class AdGroupCreateRequest(name: String,
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
                campaignUnderscoreid: String,
                billableUnderscoreevent: ActionType,
                bidUnderscorestrategyUnderscoretype: Option[String]
                )

object AdGroupCreateRequest {
    /**
     * Creates the codec for converting AdGroupCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupCreateRequest] = deriveEncoder
}
