package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ActionType
import org.openapitools.models.BigDecimal
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
 * @param autoUnderscoretargetingUnderscoreenabled Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
 * @param bidUnderscoreinUnderscoremicroUnderscorecurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
 * @param bidUnderscorestrategyUnderscoretype Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
 * @param billableUnderscoreevent 
 * @param budgetUnderscoreinUnderscoremicroUnderscorecurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @param budgetUnderscoretype 
 * @param campaignUnderscoreid Campaign ID of the ad group.
 * @param endUnderscoretime Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
 * @param isUnderscorecreativeUnderscoreoptimization Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
 * @param lifetimeUnderscorefrequencyUnderscorecap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @param name Ad group name.
 * @param optimizationUnderscoregoalUnderscoremetadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 * @param pacingUnderscoredeliveryUnderscoretype 
 * @param placementUnderscoregroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @param promotionUnderscoreapplicationUnderscorelevel Specify if the promotion is applied at ad group or item level
 * @param promotionUnderscoreid Promotion ID. To clear this field, set to null.
 * @param startUnderscoretime Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
 * @param status Ad group/entity status.
 * @param targetingUnderscorespec 
 * @param targetingUnderscoretemplateUnderscoreids Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
 * @param trackingUnderscoreurls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @param bidUnderscoremultiplier <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
 */
case class AdGroupCreateRequest(autoUnderscoretargetingUnderscoreenabled: Option[Boolean],
                bidUnderscoreinUnderscoremicroUnderscorecurrency: Option[Int],
                bidUnderscorestrategyUnderscoretype: Option[String],
                billableUnderscoreevent: ActionType,
                budgetUnderscoreinUnderscoremicroUnderscorecurrency: Option[Int],
                budgetUnderscoretype: Option[BudgetType],
                campaignUnderscoreid: String,
                endUnderscoretime: Option[Int],
                isUnderscorecreativeUnderscoreoptimization: Option[Boolean],
                lifetimeUnderscorefrequencyUnderscorecap: Option[Int],
                name: String,
                optimizationUnderscoregoalUnderscoremetadata: Option[OptimizationGoalMetadata],
                pacingUnderscoredeliveryUnderscoretype: Option[PacingDeliveryType],
                placementUnderscoregroup: Option[PlacementGroupType],
                promotionUnderscoreapplicationUnderscorelevel: Option[String],
                promotionUnderscoreid: Option[String],
                startUnderscoretime: Option[Int],
                status: Option[EntityStatus],
                targetingUnderscorespec: Option[TargetingSpec],
                targetingUnderscoretemplateUnderscoreids: Option[Seq[String]],
                trackingUnderscoreurls: Option[TrackingUrls],
                bidUnderscoremultiplier: Option[BigDecimal]
                )

object AdGroupCreateRequest {
    /**
     * Creates the codec for converting AdGroupCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupCreateRequest] = deriveEncoder
}
