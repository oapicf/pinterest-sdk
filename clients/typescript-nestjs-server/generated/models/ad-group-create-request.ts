import { ActionType } from './action-type';
import { EntityStatus } from './entity-status';
import { TargetingSpec } from './targeting-spec';
import { PlacementGroupType } from './placement-group-type';
import { BudgetType } from './budget-type';
import { PacingDeliveryType } from './pacing-delivery-type';
import { BidStrategyType } from './bid-strategy-type';


export interface AdGroupCreateRequest { 
  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
   */
  auto_targeting_enabled?: boolean;
  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
   */
  bid_multiplier?: number;
  budget_type?: BudgetType;
  pacing_delivery_type?: PacingDeliveryType;
  /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
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
   * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   */
  end_time?: number | null;
  /**
   * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
   */
  is_creative_optimization?: boolean | null;
  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
   */
  lifetime_frequency_cap?: number;
  /**
   * Ad group name.
   */
  name: string;
  /**
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign\'s `objective_type` is set to `\"WEB_CONVERSION\"`.
   */
  optimization_goal_metadata?: object | null;
  /**
   * <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
   */
  placement_group?: PlacementGroupType;
  /**
   * Specify if the promotion is applied at ad group or item level
   */
  promotion_application_level?: AdGroupCreateRequest.PromotionApplicationLevelEnum | null;
  /**
   * Promotion ID. To clear this field, set to null.
   */
  promotion_id?: string | null;
  /**
   * Promotion IDs list. To clear this field, set to an empty array [].
   */
  promotion_ids?: Array<string>;
  /**
   * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign\'s `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   */
  start_time?: number | null;
  /**
   * Ad group/entity status.
   */
  status?: EntityStatus;
  targeting_spec?: TargetingSpec;
  /**
   * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [\'0\'].
   */
  targeting_template_ids?: Array<string> | null;
  /**
   * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
   */
  tracking_urls?: object | null;
}
export namespace AdGroupCreateRequest {
  export const PromotionApplicationLevelEnum = {
    None: 'NONE',
    Item: 'ITEM',
    AdGroup: 'AD_GROUP'
  } as const;
  export type PromotionApplicationLevelEnum = typeof PromotionApplicationLevelEnum[keyof typeof PromotionApplicationLevelEnum];
}


