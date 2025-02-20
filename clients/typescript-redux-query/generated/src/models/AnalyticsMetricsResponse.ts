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
    AnalyticsDailyMetrics,
    AnalyticsDailyMetricsFromJSON,
    AnalyticsDailyMetricsToJSON,
} from './';

/**
 * 
 * @export
 * @interface AnalyticsMetricsResponse
 */
export interface AnalyticsMetricsResponse  {
    /**
     * The metric name and value over the requested period for each requested metric
     * @type {{ [key: string]: number; }}
     * @memberof AnalyticsMetricsResponse
     */
    summaryMetrics?: { [key: string]: number; };
    /**
     * Array with the requested daily metric records
     * @type {Array<AnalyticsDailyMetrics>}
     * @memberof AnalyticsMetricsResponse
     */
    dailyMetrics?: Array<AnalyticsDailyMetrics>;
}

export function AnalyticsMetricsResponseFromJSON(json: any): AnalyticsMetricsResponse {
    return {
        'summaryMetrics': !exists(json, 'summary_metrics') ? undefined : json['summary_metrics'],
        'dailyMetrics': !exists(json, 'daily_metrics') ? undefined : (json['daily_metrics'] as Array<any>).map(AnalyticsDailyMetricsFromJSON),
    };
}

export function AnalyticsMetricsResponseToJSON(value?: AnalyticsMetricsResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'summary_metrics': value.summaryMetrics,
        'daily_metrics': value.dailyMetrics === undefined ? undefined : (value.dailyMetrics as Array<any>).map(AnalyticsDailyMetricsToJSON),
    };
}


