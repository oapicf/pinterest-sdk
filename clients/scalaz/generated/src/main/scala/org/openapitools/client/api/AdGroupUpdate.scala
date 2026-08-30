package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupUpdate._

case class AdGroupUpdate (
  /* Advertiser ID. */
  adAccountId: Option[String],
/* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. */
  bidInMicroCurrency: Option[Integer],
bidStrategyType: Option[BidStrategyType],
billableEvent: ActionType,
/* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
  budgetInMicroCurrency: Option[Integer],
/* Campaign ID of the ad group. */
  campaignId: String,
/* oCPM learn mode */
  conversionLearningModeType: ConversionLearningModeType,
/* Ad group creation time. Unix timestamp in seconds. */
  createdTime: Integer,
/* Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'. */
  customerSegmentId: Option[String],
/* [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. */
  dcaAssets: Option[AnyType],
/* Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. */
  endTime: Option[Integer],
extFeatures: Option[AdgroupTrackingFeatures],
/* Feed Profile ID associated to the adgroup. */
  feedProfileId: Option[String],
/* Ad group ID. */
  id: String,
/* Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. */
  isCreativeOptimization: Option[Boolean],
/* Indicates whether the ad group should use the local inventory. */
  isLocalInventory: Option[Boolean],
/* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field. */
  lifetimeFrequencyCap: Option[Integer],
/* The targeting radius of the local inventory ads in miles. */
  localInventoryRadiusInMiles: Option[BigDecimal],
/* Ad group name. */
  name: String,
/* Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. */
  optimizationGoalMetadata: Option[NullableOptimizationGoalMetadata],
/* Pinterest Performance+ campaign settings. */
  performancePlusCampaignSettings: Option[PerformancePlusCampaignSettings],
/* [Placement group](https://help.pinterest.com/en/business/article/placement-groups). */
  placementGroup: Option[PlacementGroupType],
/* A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both */
  placementTrafficType: Option[PlacementTrafficType],
/* Specify if the promotion is applied at ad group or item level */
  promotionApplicationLevel: Option[PromotionApplicationLevel],
/* Promotion ID. To clear this field, set to null. */
  promotionId: Option[String],
/* Promotion IDs list. To clear this field, set to an empty array []. */
  promotionIds: Option[List[String]],
/* Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. */
  startTime: Option[Integer],
/* Ad group/entity status. */
  status: Option[EntityStatus],
summaryStatus: SummaryStatus,
targetingSpec: Option[TargetingSpecOptimal],
/* Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. */
  targetingTemplateIds: Option[List[String]],
trackingUrls: Option[AdGroupTrackingURLs],
/* Always \"adgroup\". */
  `type`: String,
/* Ad group last update time. Unix timestamp in seconds. */
  updatedTime: Integer,
/* Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting). */
  autoTargetingEnabled: Option[Boolean],
/* [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns). */
  bidMultiplier: Option[BigDecimal],
budgetType: Option[BudgetType],
pacingDeliveryType: Option[PacingDeliveryType])

object AdGroupUpdate {
  import DateTimeCodecs._

  implicit val AdGroupUpdateCodecJson: CodecJson[AdGroupUpdate] = CodecJson.derive[AdGroupUpdate]
  implicit val AdGroupUpdateDecoder: EntityDecoder[AdGroupUpdate] = jsonOf[AdGroupUpdate]
  implicit val AdGroupUpdateEncoder: EntityEncoder[AdGroupUpdate] = jsonEncoderOf[AdGroupUpdate]
}
