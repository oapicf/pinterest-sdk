// tslint:disable
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
    AdsAnalyticsTargetingType,
    AdsAnalyticsTargetingTypeFromJSON,
    AdsAnalyticsTargetingTypeToJSON,
} from './';

/**
 * 
 * @export
 * @interface TargetingTypeFilter
 */
export interface TargetingTypeFilter  {
    /**
     * List of targeting types
     * @type {Array<AdsAnalyticsTargetingType>}
     * @memberof TargetingTypeFilter
     */
    targetingTypes?: Array<AdsAnalyticsTargetingType>;
}

export function TargetingTypeFilterFromJSON(json: any): TargetingTypeFilter {
    return {
        'targetingTypes': !exists(json, 'targeting_types') ? undefined : (json['targeting_types'] as Array<any>).map(AdsAnalyticsTargetingTypeFromJSON),
    };
}

export function TargetingTypeFilterToJSON(value?: TargetingTypeFilter): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'targeting_types': value.targetingTypes === undefined ? undefined : (value.targetingTypes as Array<any>).map(AdsAnalyticsTargetingTypeToJSON),
    };
}

