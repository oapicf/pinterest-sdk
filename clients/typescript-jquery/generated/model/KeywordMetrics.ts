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

import * as models from './models';

/**
 * Keyword metrics JSON
 */
export interface KeywordMetrics {
    /**
     * Average cost per click
     */
    avg_cpc_in_micro_currency?: number;

    /**
     * Keyword\'s search frequency. This value is based on keyword frequency in pepsi client response
     */
    keyword_query_volume?: string;

}
