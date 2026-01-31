package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupCommon.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
  * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
  * @param bidStrategyType Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  * @param campaignId Campaign ID of the ad group.
  * @param endTime Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
  * @param isCreativeOptimization Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
  * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  * @param name Ad group name.
  * @param optimizationGoalMetadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
  * @param placementGroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
  * @param promotionApplicationLevel Specify if the promotion is applied at ad group or item level
  * @param promotionId Promotion ID. To clear this field, set to null.
  * @param startTime Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
  * @param status Ad group/entity status.
  * @param targetingTemplateIds Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
  * @param trackingUrls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdGroupCommon(
  autoTargetingEnabled: Option[Boolean],
  bidInMicroCurrency: Option[Int],
  bidStrategyType: Option[AdGroupCommon.BidStrategyType.Value],
  billableEvent: Option[ActionType],
  budgetInMicroCurrency: Option[Int],
  budgetType: Option[BudgetType],
  campaignId: Option[String],
  endTime: Option[Int],
  isCreativeOptimization: Option[Boolean],
  lifetimeFrequencyCap: Option[Int],
  name: Option[String],
  optimizationGoalMetadata: Option[OptimizationGoalMetadata],
  pacingDeliveryType: Option[PacingDeliveryType],
  placementGroup: Option[PlacementGroupType],
  promotionApplicationLevel: Option[AdGroupCommon.PromotionApplicationLevel.Value],
  promotionId: Option[String],
  startTime: Option[Int],
  status: Option[EntityStatus],
  targetingSpec: Option[TargetingSpec],
  targetingTemplateIds: Option[List[String]],
  trackingUrls: Option[TrackingUrls]
)

object AdGroupCommon {
  implicit lazy val adGroupCommonJsonFormat: Format[AdGroupCommon] = Json.format[AdGroupCommon]

  // noinspection TypeAnnotation
  object BidStrategyType extends Enumeration {
    val AUTOMATICBID = Value("AUTOMATIC_BID")
    val MAXBID = Value("MAX_BID")
    val TARGETAVG = Value("TARGET_AVG")

    type BidStrategyType = Value
    implicit lazy val BidStrategyTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object PromotionApplicationLevel extends Enumeration {
    val NONE = Value("NONE")
    val ITEM = Value("ITEM")
    val ADGROUP = Value("AD_GROUP")

    type PromotionApplicationLevel = Value
    implicit lazy val PromotionApplicationLevelJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

