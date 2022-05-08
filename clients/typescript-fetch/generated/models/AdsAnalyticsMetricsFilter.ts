/* tslint:disable */
/* eslint-disable */
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

import { exists, mapValues } from '../runtime';
import {
    AdsAnalyticsFilterColumn,
    AdsAnalyticsFilterColumnFromJSON,
    AdsAnalyticsFilterColumnFromJSONTyped,
    AdsAnalyticsFilterColumnToJSON,
} from './AdsAnalyticsFilterColumn';
import {
    AdsAnalyticsFilterOperator,
    AdsAnalyticsFilterOperatorFromJSON,
    AdsAnalyticsFilterOperatorFromJSONTyped,
    AdsAnalyticsFilterOperatorToJSON,
} from './AdsAnalyticsFilterOperator';

/**
 * 
 * @export
 * @interface AdsAnalyticsMetricsFilter
 */
export interface AdsAnalyticsMetricsFilter {
    /**
     * 
     * @type {AdsAnalyticsFilterColumn}
     * @memberof AdsAnalyticsMetricsFilter
     */
    field?: AdsAnalyticsFilterColumn;
    /**
     * 
     * @type {AdsAnalyticsFilterOperator}
     * @memberof AdsAnalyticsMetricsFilter
     */
    operator?: AdsAnalyticsFilterOperator;
    /**
     * List of values for filtering
     * @type {Array<number>}
     * @memberof AdsAnalyticsMetricsFilter
     */
    values?: Array<number>;
}

export function AdsAnalyticsMetricsFilterFromJSON(json: any): AdsAnalyticsMetricsFilter {
    return AdsAnalyticsMetricsFilterFromJSONTyped(json, false);
}

export function AdsAnalyticsMetricsFilterFromJSONTyped(json: any, ignoreDiscriminator: boolean): AdsAnalyticsMetricsFilter {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'field': !exists(json, 'field') ? undefined : AdsAnalyticsFilterColumnFromJSON(json['field']),
        'operator': !exists(json, 'operator') ? undefined : AdsAnalyticsFilterOperatorFromJSON(json['operator']),
        'values': !exists(json, 'values') ? undefined : json['values'],
    };
}

export function AdsAnalyticsMetricsFilterToJSON(value?: AdsAnalyticsMetricsFilter | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'field': AdsAnalyticsFilterColumnToJSON(value.field),
        'operator': AdsAnalyticsFilterOperatorToJSON(value.operator),
        'values': value.values,
    };
}
