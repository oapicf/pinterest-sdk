/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { ActionType } from './actionType';
import { OptimizationGoalMetadata } from './optimizationGoalMetadata';
import { EntityStatus } from './entityStatus';
import { TrackingUrls } from './trackingUrls';
import { TargetingSpec } from './targetingSpec';
import { PlacementGroupType } from './placementGroupType';
import { BudgetType } from './budgetType';
import { PacingDeliveryType } from './pacingDeliveryType';


export interface AdGroupCommon { 
    /**
     * Ad group name.
     */
    name?: string;
    /**
     * Ad group/entity status.
     */
    status?: EntityStatus;
    /**
     * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
     */
    budget_in_micro_currency?: number | null;
    /**
     * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
     */
    bid_in_micro_currency?: number | null;
    /**
     * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign\'s `objective_type` is set to `\"WEB_CONVERSION\"`.
     */
    optimization_goal_metadata?: OptimizationGoalMetadata | null;
    budget_type?: BudgetType;
    /**
     * Ad group start time. Unix timestamp in seconds. Defaults to current time.
     */
    start_time?: number | null;
    /**
     * Ad group end time. Unix timestamp in seconds.
     */
    end_time?: number | null;
    targeting_spec?: TargetingSpec;
    /**
     * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
     */
    lifetime_frequency_cap?: number;
    /**
     * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
     */
    tracking_urls?: TrackingUrls | null;
    /**
     * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
     */
    auto_targeting_enabled?: boolean | null;
    /**
     * <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
     */
    placement_group?: PlacementGroupType;
    pacing_delivery_type?: PacingDeliveryType;
    /**
     * Campaign ID of the ad group.
     */
    campaign_id?: string;
    billable_event?: ActionType;
    /**
     * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.
     */
    bid_strategy_type?: AdGroupCommon.BidStrategyTypeEnum | null;
    /**
     * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [\'0\'].
     */
    targeting_template_ids?: Array<string> | null;
}
export namespace AdGroupCommon {
    export type BidStrategyTypeEnum = 'AUTOMATIC_BID' | 'MAX_BID' | 'TARGET_AVG';
    export const BidStrategyTypeEnum = {
        AutomaticBid: 'AUTOMATIC_BID' as BidStrategyTypeEnum,
        MaxBid: 'MAX_BID' as BidStrategyTypeEnum,
        TargetAvg: 'TARGET_AVG' as BidStrategyTypeEnum
    };
}


