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
    AdsAnalyticsTargetingType,
} from './';

/**
 * @export
 * @interface TargetingTypeFilter
 */
export interface TargetingTypeFilter {
    /**
     * List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
     * @type {Array<AdsAnalyticsTargetingType>}
     * @memberof TargetingTypeFilter
     */
    targeting_types?: Array<AdsAnalyticsTargetingType>;
}
