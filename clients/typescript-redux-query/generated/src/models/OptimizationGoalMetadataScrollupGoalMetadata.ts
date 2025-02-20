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
/**
 * 
 * @export
 * @interface OptimizationGoalMetadataScrollupGoalMetadata
 */
export interface OptimizationGoalMetadataScrollupGoalMetadata  {
    /**
     * 
     * @type {string}
     * @memberof OptimizationGoalMetadataScrollupGoalMetadata
     */
    scrollupGoalValueInMicroCurrency?: string;
}

export function OptimizationGoalMetadataScrollupGoalMetadataFromJSON(json: any): OptimizationGoalMetadataScrollupGoalMetadata {
    return {
        'scrollupGoalValueInMicroCurrency': !exists(json, 'scrollup_goal_value_in_micro_currency') ? undefined : json['scrollup_goal_value_in_micro_currency'],
    };
}

export function OptimizationGoalMetadataScrollupGoalMetadataToJSON(value?: OptimizationGoalMetadataScrollupGoalMetadata): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'scrollup_goal_value_in_micro_currency': value.scrollupGoalValueInMicroCurrency,
    };
}


