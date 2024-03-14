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
/**
 * Keyword metrics JSON
 * @export
 * @interface KeywordMetrics
 */
export interface KeywordMetrics {
    /**
     * Average cost per click
     * @type {number}
     * @memberof KeywordMetrics
     */
    avgCpcInMicroCurrency?: number;
    /**
     * Keyword's search frequency. This value is based on keyword frequency in pepsi client response
     * @type {string}
     * @memberof KeywordMetrics
     */
    keywordQueryVolume?: string;
}

/**
 * Check if a given object implements the KeywordMetrics interface.
 */
export function instanceOfKeywordMetrics(value: object): boolean {
    return true;
}

export function KeywordMetricsFromJSON(json: any): KeywordMetrics {
    return KeywordMetricsFromJSONTyped(json, false);
}

export function KeywordMetricsFromJSONTyped(json: any, ignoreDiscriminator: boolean): KeywordMetrics {
    if (json == null) {
        return json;
    }
    return {
        
        'avgCpcInMicroCurrency': json['avg_cpc_in_micro_currency'] == null ? undefined : json['avg_cpc_in_micro_currency'],
        'keywordQueryVolume': json['keyword_query_volume'] == null ? undefined : json['keyword_query_volume'],
    };
}

export function KeywordMetricsToJSON(value?: KeywordMetrics | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'avg_cpc_in_micro_currency': value['avgCpcInMicroCurrency'],
        'keyword_query_volume': value['keywordQueryVolume'],
    };
}
