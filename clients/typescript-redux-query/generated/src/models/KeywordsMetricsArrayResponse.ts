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
    KeywordMetricsResponse,
    KeywordMetricsResponseFromJSON,
    KeywordMetricsResponseToJSON,
} from './';

/**
 * 
 * @export
 * @interface KeywordsMetricsArrayResponse
 */
export interface KeywordsMetricsArrayResponse  {
    /**
     * 
     * @type {Array<KeywordMetricsResponse>}
     * @memberof KeywordsMetricsArrayResponse
     */
    data?: Array<KeywordMetricsResponse>;
}

export function KeywordsMetricsArrayResponseFromJSON(json: any): KeywordsMetricsArrayResponse {
    return {
        'data': !exists(json, 'data') ? undefined : (json['data'] as Array<any>).map(KeywordMetricsResponseFromJSON),
    };
}

export function KeywordsMetricsArrayResponseToJSON(value?: KeywordsMetricsArrayResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'data': value.data === undefined ? undefined : (value.data as Array<any>).map(KeywordMetricsResponseToJSON),
    };
}


