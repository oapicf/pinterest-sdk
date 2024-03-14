/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { AdCommonTrackingUrls } from './AdCommonTrackingUrls';
import {
    AdCommonTrackingUrlsFromJSON,
    AdCommonTrackingUrlsFromJSONTyped,
    AdCommonTrackingUrlsToJSON,
} from './AdCommonTrackingUrls';
import type { EntityStatus } from './EntityStatus';
import {
    EntityStatusFromJSON,
    EntityStatusFromJSONTyped,
    EntityStatusToJSON,
} from './EntityStatus';

/**
 * 
 * @export
 * @interface CampaignCreateCommon
 */
export interface CampaignCreateCommon {
    /**
     * Campaign's Advertiser ID.
     * @type {string}
     * @memberof CampaignCreateCommon
     */
    adAccountId?: string;
    /**
     * Campaign name.
     * @type {string}
     * @memberof CampaignCreateCommon
     */
    name?: string;
    /**
     * 
     * @type {EntityStatus}
     * @memberof CampaignCreateCommon
     */
    status?: EntityStatus;
    /**
     * Campaign total spending cap.
     * @type {number}
     * @memberof CampaignCreateCommon
     */
    lifetimeSpendCap?: number;
    /**
     * Campaign daily spending cap.
     * @type {number}
     * @memberof CampaignCreateCommon
     */
    dailySpendCap?: number;
    /**
     * Order line ID that appears on the invoice.
     * @type {string}
     * @memberof CampaignCreateCommon
     */
    orderLineId?: string;
    /**
     * 
     * @type {AdCommonTrackingUrls}
     * @memberof CampaignCreateCommon
     */
    trackingUrls?: AdCommonTrackingUrls;
    /**
     * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     * @type {number}
     * @memberof CampaignCreateCommon
     */
    startTime?: number;
    /**
     * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     * @type {number}
     * @memberof CampaignCreateCommon
     */
    endTime?: number;
    /**
     * Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
     * @type {boolean}
     * @memberof CampaignCreateCommon
     */
    isCampaignBudgetOptimization?: boolean;
    /**
     * Determine if a campaign has flexible daily budgets setup.
     * @type {boolean}
     * @memberof CampaignCreateCommon
     */
    isFlexibleDailyBudgets?: boolean;
    /**
     * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
     * @type {number}
     * @memberof CampaignCreateCommon
     */
    defaultAdGroupBudgetInMicroCurrency?: number;
    /**
     * Specifies whether the campaign was created in the automated campaign flow
     * @type {boolean}
     * @memberof CampaignCreateCommon
     */
    isAutomatedCampaign?: boolean;
}

/**
 * Check if a given object implements the CampaignCreateCommon interface.
 */
export function instanceOfCampaignCreateCommon(value: object): boolean {
    return true;
}

export function CampaignCreateCommonFromJSON(json: any): CampaignCreateCommon {
    return CampaignCreateCommonFromJSONTyped(json, false);
}

export function CampaignCreateCommonFromJSONTyped(json: any, ignoreDiscriminator: boolean): CampaignCreateCommon {
    if (json == null) {
        return json;
    }
    return {
        
        'adAccountId': json['ad_account_id'] == null ? undefined : json['ad_account_id'],
        'name': json['name'] == null ? undefined : json['name'],
        'status': json['status'] == null ? undefined : EntityStatusFromJSON(json['status']),
        'lifetimeSpendCap': json['lifetime_spend_cap'] == null ? undefined : json['lifetime_spend_cap'],
        'dailySpendCap': json['daily_spend_cap'] == null ? undefined : json['daily_spend_cap'],
        'orderLineId': json['order_line_id'] == null ? undefined : json['order_line_id'],
        'trackingUrls': json['tracking_urls'] == null ? undefined : AdCommonTrackingUrlsFromJSON(json['tracking_urls']),
        'startTime': json['start_time'] == null ? undefined : json['start_time'],
        'endTime': json['end_time'] == null ? undefined : json['end_time'],
        'isCampaignBudgetOptimization': json['is_campaign_budget_optimization'] == null ? undefined : json['is_campaign_budget_optimization'],
        'isFlexibleDailyBudgets': json['is_flexible_daily_budgets'] == null ? undefined : json['is_flexible_daily_budgets'],
        'defaultAdGroupBudgetInMicroCurrency': json['default_ad_group_budget_in_micro_currency'] == null ? undefined : json['default_ad_group_budget_in_micro_currency'],
        'isAutomatedCampaign': json['is_automated_campaign'] == null ? undefined : json['is_automated_campaign'],
    };
}

export function CampaignCreateCommonToJSON(value?: CampaignCreateCommon | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'ad_account_id': value['adAccountId'],
        'name': value['name'],
        'status': EntityStatusToJSON(value['status']),
        'lifetime_spend_cap': value['lifetimeSpendCap'],
        'daily_spend_cap': value['dailySpendCap'],
        'order_line_id': value['orderLineId'],
        'tracking_urls': AdCommonTrackingUrlsToJSON(value['trackingUrls']),
        'start_time': value['startTime'],
        'end_time': value['endTime'],
        'is_campaign_budget_optimization': value['isCampaignBudgetOptimization'],
        'is_flexible_daily_budgets': value['isFlexibleDailyBudgets'],
        'default_ad_group_budget_in_micro_currency': value['defaultAdGroupBudgetInMicroCurrency'],
        'is_automated_campaign': value['isAutomatedCampaign'],
    };
}
