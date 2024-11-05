package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ActionType
import org.openapitools.models.BudgetType
import org.openapitools.models.EntityStatus
import org.openapitools.models.OptimizationGoalMetadata
import org.openapitools.models.PacingDeliveryType
import org.openapitools.models.PlacementGroupType
import org.openapitools.models.TargetingSpec
import org.openapitools.models.TrackingUrls
import scala.collection.immutable.Seq

/**
 * 
 * @param name Ad group name.
 * @param status Ad group/entity status.
 * @param budgetUnderscoreinUnderscoremicroUnderscorecurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @param bidUnderscoreinUnderscoremicroUnderscorecurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
 * @param optimizationUnderscoregoalUnderscoremetadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 * @param budgetUnderscoretype 
 * @param startUnderscoretime Ad group start time. Unix timestamp in seconds. Defaults to current time.
 * @param endUnderscoretime Ad group end time. Unix timestamp in seconds.
 * @param targetingUnderscorespec 
 * @param lifetimeUnderscorefrequencyUnderscorecap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @param trackingUnderscoreurls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @param autoUnderscoretargetingUnderscoreenabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @param placementUnderscoregroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @param pacingUnderscoredeliveryUnderscoretype 
 * @param campaignUnderscoreid Campaign ID of the ad group.
 * @param billableUnderscoreevent 
 * @param bidUnderscorestrategyUnderscoretype Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.
 * @param targetingUnderscoretemplateUnderscoreids Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
 * @param id Ad group ID.
 */
case class AdGroupUpdateRequest(name: Option[String],
                status: Option[EntityStatus],
                budgetUnderscoreinUnderscoremicroUnderscorecurrency: Option[Int],
                bidUnderscoreinUnderscoremicroUnderscorecurrency: Option[Int],
                optimizationUnderscoregoalUnderscoremetadata: Option[OptimizationGoalMetadata],
                budgetUnderscoretype: Option[BudgetType],
                startUnderscoretime: Option[Int],
                endUnderscoretime: Option[Int],
                targetingUnderscorespec: Option[TargetingSpec],
                lifetimeUnderscorefrequencyUnderscorecap: Option[Int],
                trackingUnderscoreurls: Option[TrackingUrls],
                autoUnderscoretargetingUnderscoreenabled: Option[Boolean],
                placementUnderscoregroup: Option[PlacementGroupType],
                pacingUnderscoredeliveryUnderscoretype: Option[PacingDeliveryType],
                campaignUnderscoreid: Option[String],
                billableUnderscoreevent: Option[ActionType],
                bidUnderscorestrategyUnderscoretype: Option[String],
                targetingUnderscoretemplateUnderscoreids: Option[Seq[String]],
                id: String
                )

object AdGroupUpdateRequest {
    /**
     * Creates the codec for converting AdGroupUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupUpdateRequest] = deriveEncoder
}
