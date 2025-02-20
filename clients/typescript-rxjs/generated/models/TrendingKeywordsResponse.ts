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

import type {
    TrendingKeywordsResponseTrendsInner,
} from './';

/**
 * @export
 * @interface TrendingKeywordsResponse
 */
export interface TrendingKeywordsResponse {
    /**
     * The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
     * @type {Array<TrendingKeywordsResponseTrendsInner>}
     * @memberof TrendingKeywordsResponse
     */
    trends?: Array<TrendingKeywordsResponseTrendsInner>;
}
