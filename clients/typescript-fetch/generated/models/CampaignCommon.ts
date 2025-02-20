/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { EntityStatus } from './EntityStatus';
import {
    EntityStatusFromJSON,
    EntityStatusFromJSONTyped,
    EntityStatusToJSON,
    EntityStatusToJSONTyped,
} from './EntityStatus';
import type { TrackingUrls } from './TrackingUrls';
import {
    TrackingUrlsFromJSON,
    TrackingUrlsFromJSONTyped,
    TrackingUrlsToJSON,
    TrackingUrlsToJSONTyped,
} from './TrackingUrls';

/**
 * Campaign Data
 * @export
 * @interface CampaignCommon
 */
export interface CampaignCommon {
    /**
     * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
     * @type {string}
     * @memberof CampaignCommon
     */
    adAccountId?: string;
    /**
     * Campaign name.
     * @type {string}
     * @memberof CampaignCommon
     */
    name?: string;
    /**
     * 
     * @type {EntityStatus}
     * @memberof CampaignCommon
     */
    status?: EntityStatus;
    /**
     * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and "daily_spend_cap" cannot be set at the same time.
     * @type {number}
     * @memberof CampaignCommon
     */
    lifetimeSpendCap?: number | null;
    /**
     * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and "lifetime_spend_cap" cannot be set at the same time.
     * @type {number}
     * @memberof CampaignCommon
     */
    dailySpendCap?: number | null;
    /**
     * Order line ID that appears on the invoice.
     * @type {string}
     * @memberof CampaignCommon
     */
    orderLineId?: string | null;
    /**
     * 
     * @type {TrackingUrls}
     * @memberof CampaignCommon
     */
    trackingUrls?: TrackingUrls | null;
    /**
     * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     * @type {number}
     * @memberof CampaignCommon
     */
    startTime?: number | null;
    /**
     * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     * @type {number}
     * @memberof CampaignCommon
     */
    endTime?: number | null;
    /**
     * Determine if a campaign has flexible daily budgets setup.
     * @type {boolean}
     * @memberof CampaignCommon
     */
    isFlexibleDailyBudgets?: boolean | null;
}



/**
 * Check if a given object implements the CampaignCommon interface.
 */
export function instanceOfCampaignCommon(value: object): value is CampaignCommon {
    return true;
}

export function CampaignCommonFromJSON(json: any): CampaignCommon {
    return CampaignCommonFromJSONTyped(json, false);
}

export function CampaignCommonFromJSONTyped(json: any, ignoreDiscriminator: boolean): CampaignCommon {
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
        'trackingUrls': json['tracking_urls'] == null ? undefined : TrackingUrlsFromJSON(json['tracking_urls']),
        'startTime': json['start_time'] == null ? undefined : json['start_time'],
        'endTime': json['end_time'] == null ? undefined : json['end_time'],
        'isFlexibleDailyBudgets': json['is_flexible_daily_budgets'] == null ? undefined : json['is_flexible_daily_budgets'],
    };
}

  export function CampaignCommonToJSON(json: any): CampaignCommon {
      return CampaignCommonToJSONTyped(json, false);
  }

  export function CampaignCommonToJSONTyped(value?: CampaignCommon | null, ignoreDiscriminator: boolean = false): any {
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
        'tracking_urls': TrackingUrlsToJSON(value['trackingUrls']),
        'start_time': value['startTime'],
        'end_time': value['endTime'],
        'is_flexible_daily_budgets': value['isFlexibleDailyBudgets'],
    };
}

