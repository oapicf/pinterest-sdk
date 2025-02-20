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
/**
 * 
 * @export
 * @interface AdGroupsAnalyticsResponseInner
 */
export interface AdGroupsAnalyticsResponseInner {
    [key: string]: any | any;
    /**
     * The ID of the ad group that this metrics belongs to.
     * @type {string}
     * @memberof AdGroupsAnalyticsResponseInner
     */
    aDGROUPID: string;
    /**
     * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
     * @type {Date}
     * @memberof AdGroupsAnalyticsResponseInner
     */
    dATE?: Date;
}

/**
 * Check if a given object implements the AdGroupsAnalyticsResponseInner interface.
 */
export function instanceOfAdGroupsAnalyticsResponseInner(value: object): value is AdGroupsAnalyticsResponseInner {
    if (!('aDGROUPID' in value) || value['aDGROUPID'] === undefined) return false;
    return true;
}

export function AdGroupsAnalyticsResponseInnerFromJSON(json: any): AdGroupsAnalyticsResponseInner {
    return AdGroupsAnalyticsResponseInnerFromJSONTyped(json, false);
}

export function AdGroupsAnalyticsResponseInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): AdGroupsAnalyticsResponseInner {
    if (json == null) {
        return json;
    }
    return {
        
            ...json,
        'aDGROUPID': json['AD_GROUP_ID'],
        'dATE': json['DATE'] == null ? undefined : (new Date(json['DATE'])),
    };
}

  export function AdGroupsAnalyticsResponseInnerToJSON(json: any): AdGroupsAnalyticsResponseInner {
      return AdGroupsAnalyticsResponseInnerToJSONTyped(json, false);
  }

  export function AdGroupsAnalyticsResponseInnerToJSONTyped(value?: AdGroupsAnalyticsResponseInner | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
            ...value,
        'AD_GROUP_ID': value['aDGROUPID'],
        'DATE': value['dATE'] == null ? undefined : ((value['dATE']).toISOString().substring(0,10)),
    };
}

