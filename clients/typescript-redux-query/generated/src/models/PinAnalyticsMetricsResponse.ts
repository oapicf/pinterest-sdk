// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    PinAnalyticsMetricsResponseDailyMetricsInner,
    PinAnalyticsMetricsResponseDailyMetricsInnerFromJSON,
    PinAnalyticsMetricsResponseDailyMetricsInnerToJSON,
} from './';

/**
 * 
 * @export
 * @interface PinAnalyticsMetricsResponse
 */
export interface PinAnalyticsMetricsResponse  {
    /**
     * The lifetime metric name and value.
     * @type {{ [key: string]: number; }}
     * @memberof PinAnalyticsMetricsResponse
     */
    lifetimeMetrics?: { [key: string]: number; };
    /**
     * Array with the requested daily metric records
     * @type {Array<PinAnalyticsMetricsResponseDailyMetricsInner>}
     * @memberof PinAnalyticsMetricsResponse
     */
    dailyMetrics?: Array<PinAnalyticsMetricsResponseDailyMetricsInner>;
    /**
     * The metric name and value over the requested period for each requested metric
     * @type {{ [key: string]: number; }}
     * @memberof PinAnalyticsMetricsResponse
     */
    summaryMetrics?: { [key: string]: number; };
}

export function PinAnalyticsMetricsResponseFromJSON(json: any): PinAnalyticsMetricsResponse {
    return {
        'lifetimeMetrics': !exists(json, 'lifetime_metrics') ? undefined : json['lifetime_metrics'],
        'dailyMetrics': !exists(json, 'daily_metrics') ? undefined : (json['daily_metrics'] as Array<any>).map(PinAnalyticsMetricsResponseDailyMetricsInnerFromJSON),
        'summaryMetrics': !exists(json, 'summary_metrics') ? undefined : json['summary_metrics'],
    };
}

export function PinAnalyticsMetricsResponseToJSON(value?: PinAnalyticsMetricsResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'lifetime_metrics': value.lifetimeMetrics,
        'daily_metrics': value.dailyMetrics === undefined ? undefined : (value.dailyMetrics as Array<any>).map(PinAnalyticsMetricsResponseDailyMetricsInnerToJSON),
        'summary_metrics': value.summaryMetrics,
    };
}


