/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { AdGroupSummaryStatus } from './adGroupSummaryStatus';
import { EntityStatus } from './entityStatus';
import { TrackingUrls } from './trackingUrls';
import { PlacementGroupType } from './placementGroupType';
import { PacingDeliveryType } from './pacingDeliveryType';


export interface AdGroupResponseAllOf { 
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
     * Budget type. If DAILY, an ad group\'s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
     */
    budget_type?: AdGroupResponseAllOf.BudgetTypeEnum;
    /**
     * Ad group start time. Unix timestamp in seconds. Defaults to current time.
     */
    start_time?: number | null;
    /**
     * Ad group end time. Unix timestamp in seconds.
     */
    end_time?: number | null;
    /**
     * Ad group targeting specification defining the ad group target audience. For example, \'{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}\'
     */
    targeting_spec?: { [key: string]: Array<string>; };
    /**
     * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
     */
    lifetime_frequency_cap?: number;
    /**
     * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
     */
    tracking_urls?: TrackingUrls | null;
    /**
     * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
     */
    auto_targeting_enabled?: boolean | null;
    /**
     * <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.
     */
    placement_group?: PlacementGroupType;
    /**
     * Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
     */
    pacing_delivery_type?: PacingDeliveryType;
    /**
     * oCPM learn mode
     */
    conversion_learning_mode_type?: AdGroupResponseAllOf.ConversionLearningModeTypeEnum | null;
    /**
     * Ad group summary status.
     */
    summary_status?: AdGroupSummaryStatus;
    /**
     * Feed Profile ID associated to the adgroup.
     */
    feed_profile_id?: string;
}
export namespace AdGroupResponseAllOf {
    export type BudgetTypeEnum = 'DAILY' | 'LIFETIME' | 'CBO_ADGROUP';
    export const BudgetTypeEnum = {
        Daily: 'DAILY' as BudgetTypeEnum,
        Lifetime: 'LIFETIME' as BudgetTypeEnum,
        CboAdgroup: 'CBO_ADGROUP' as BudgetTypeEnum
    };
    export type ConversionLearningModeTypeEnum = 'NOT_ACTIVE' | 'ACTIVE' | 'null';
    export const ConversionLearningModeTypeEnum = {
        NotActive: 'NOT_ACTIVE' as ConversionLearningModeTypeEnum,
        Active: 'ACTIVE' as ConversionLearningModeTypeEnum,
        Null: 'null' as ConversionLearningModeTypeEnum
    };
}

