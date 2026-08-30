import { PerformancePlusCampaignSettings } from './performance-plus-campaign-settings';
import { ActionType } from './action-type';
import { ConversionLearningModeType } from './conversion-learning-mode-type';
import { PlacementTrafficType } from './placement-traffic-type';
import { PlacementGroupType } from './placement-group-type';
import { BudgetType } from './budget-type';
import { PacingDeliveryType } from './pacing-delivery-type';
import { BidStrategyType } from './bid-strategy-type';
import { AdgroupTrackingFeatures } from './adgroup-tracking-features';
import { SummaryStatus } from './summary-status';
import { AdGroupTrackingURLs } from './ad-group-tracking-urls';
import { NullableOptimizationGoalMetadata } from './nullable-optimization-goal-metadata';
import { PromotionApplicationLevel } from './promotion-application-level';
import { EntityStatus } from './entity-status';
import { TargetingSpecOptimal } from './targeting-spec-optimal';


export interface AdGroup { 
  /**
   * Advertiser ID.
   */
  readonly ad_account_id?: string;
  /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   */
  bid_in_micro_currency?: number | null;
  bid_strategy_type?: BidStrategyType | null;
  billable_event: ActionType;
  /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   */
  budget_in_micro_currency?: number | null;
  /**
   * Campaign ID of the ad group.
   */
  campaign_id: string;
  /**
   * oCPM learn mode
   */
  readonly conversion_learning_mode_type: ConversionLearningModeType | null;
  /**
   * Ad group creation time. Unix timestamp in seconds.
   */
  readonly created_time: number;
  /**
   * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to \'0\'.
   */
  customer_segment_id?: string;
  /**
   * [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
   */
  readonly dca_assets?: any | null;
  /**
   * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
   */
  end_time?: number | null;
  ext_features?: AdgroupTrackingFeatures | null;
  /**
   * Feed Profile ID associated to the adgroup.
   */
  feed_profile_id?: string;
  /**
   * Ad group ID.
   */
  id: string;
  /**
   * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
   */
  is_creative_optimization?: boolean | null;
  /**
   * Indicates whether the ad group should use the local inventory.
   */
  is_local_inventory?: boolean;
  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
   */
  lifetime_frequency_cap?: number;
  /**
   * The targeting radius of the local inventory ads in miles.
   */
  local_inventory_radius_in_miles?: number;
  /**
   * Ad group name.
   */
  name: string;
  /**
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign\'s `objective_type` is set to `\"WEB_CONVERSION\"`.
   */
  optimization_goal_metadata?: NullableOptimizationGoalMetadata | null;
  /**
   * Pinterest Performance+ campaign settings.
   */
  performance_plus_campaign_settings?: PerformancePlusCampaignSettings | null;
  /**
   * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
   */
  placement_group?: PlacementGroupType;
  /**
   * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
   */
  placement_traffic_type?: PlacementTrafficType | null;
  /**
   * Specify if the promotion is applied at ad group or item level
   */
  promotion_application_level?: PromotionApplicationLevel | null;
  /**
   * Promotion ID. To clear this field, set to null.
   */
  promotion_id?: string | null;
  /**
   * Promotion IDs list. To clear this field, set to an empty array [].
   */
  promotion_ids?: Array<string>;
  /**
   * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign\'s `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   */
  start_time?: number | null;
  /**
   * Ad group/entity status.
   */
  status?: EntityStatus;
  readonly summary_status: SummaryStatus;
  targeting_spec?: TargetingSpecOptimal;
  /**
   * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [\'0\'].
   */
  targeting_template_ids?: Array<string> | null;
  tracking_urls?: AdGroupTrackingURLs | null;
  /**
   * Always \"adgroup\".
   */
  readonly type: string;
  /**
   * Ad group last update time. Unix timestamp in seconds.
   */
  readonly updated_time: number;
  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   */
  auto_targeting_enabled?: boolean | null;
  /**
   * [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
   */
  bid_multiplier?: number | null;
  budget_type?: BudgetType;
  pacing_delivery_type?: PacingDeliveryType;
}
export namespace AdGroup {
}


