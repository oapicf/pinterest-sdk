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

import { RequestFile } from './models';
import { TrendingKeywordsResponseTrendsInner } from './trendingKeywordsResponseTrendsInner';

export class TrendingKeywordsResponse {
    /**
    * The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
    */
    'trends'?: Array<TrendingKeywordsResponseTrendsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "trends",
            "baseName": "trends",
            "type": "Array<TrendingKeywordsResponseTrendsInner>"
        }    ];

    static getAttributeTypeMap() {
        return TrendingKeywordsResponse.attributeTypeMap;
    }
}

