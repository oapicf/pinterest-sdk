/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { DataStatus } from './DataStatus';
import {
    DataStatusFromJSON,
    DataStatusFromJSONTyped,
    DataStatusToJSON,
} from './DataStatus';

/**
 * 
 * @export
 * @interface PinAnalyticsMetricsResponseDailyMetricsInner
 */
export interface PinAnalyticsMetricsResponseDailyMetricsInner {
    /**
     * 
     * @type {DataStatus}
     * @memberof PinAnalyticsMetricsResponseDailyMetricsInner
     */
    dataStatus?: DataStatus;
    /**
     * Metrics date (UTC): YYYY-MM-DD.
     * @type {string}
     * @memberof PinAnalyticsMetricsResponseDailyMetricsInner
     */
    date?: string;
    /**
     * The metric name and daily value for each requested metric
     * @type {{ [key: string]: number; }}
     * @memberof PinAnalyticsMetricsResponseDailyMetricsInner
     */
    metrics?: { [key: string]: number; };
}

/**
 * Check if a given object implements the PinAnalyticsMetricsResponseDailyMetricsInner interface.
 */
export function instanceOfPinAnalyticsMetricsResponseDailyMetricsInner(value: object): boolean {
    return true;
}

export function PinAnalyticsMetricsResponseDailyMetricsInnerFromJSON(json: any): PinAnalyticsMetricsResponseDailyMetricsInner {
    return PinAnalyticsMetricsResponseDailyMetricsInnerFromJSONTyped(json, false);
}

export function PinAnalyticsMetricsResponseDailyMetricsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): PinAnalyticsMetricsResponseDailyMetricsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'dataStatus': json['data_status'] == null ? undefined : DataStatusFromJSON(json['data_status']),
        'date': json['date'] == null ? undefined : json['date'],
        'metrics': json['metrics'] == null ? undefined : json['metrics'],
    };
}

export function PinAnalyticsMetricsResponseDailyMetricsInnerToJSON(value?: PinAnalyticsMetricsResponseDailyMetricsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'data_status': DataStatusToJSON(value['dataStatus']),
        'date': value['date'],
        'metrics': value['metrics'],
    };
}
