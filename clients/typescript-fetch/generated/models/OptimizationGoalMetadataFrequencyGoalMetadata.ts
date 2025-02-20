/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface OptimizationGoalMetadataFrequencyGoalMetadata
 */
export interface OptimizationGoalMetadataFrequencyGoalMetadata {
    /**
     * 
     * @type {number}
     * @memberof OptimizationGoalMetadataFrequencyGoalMetadata
     */
    frequency?: number;
    /**
     * User entity counts time range
     * @type {string}
     * @memberof OptimizationGoalMetadataFrequencyGoalMetadata
     */
    timerange?: OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum;
}


/**
 * @export
 */
export const OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum = {
    ThirtyDay: 'THIRTY_DAY',
    Day: 'DAY',
    SevenDay: 'SEVEN_DAY',
    TwentyMinute: 'TWENTY_MINUTE',
    TenMinute: 'TEN_MINUTE',
    TwentyFourHour: 'TWENTY_FOUR_HOUR'
} as const;
export type OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum = typeof OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum[keyof typeof OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum];


/**
 * Check if a given object implements the OptimizationGoalMetadataFrequencyGoalMetadata interface.
 */
export function instanceOfOptimizationGoalMetadataFrequencyGoalMetadata(value: object): value is OptimizationGoalMetadataFrequencyGoalMetadata {
    return true;
}

export function OptimizationGoalMetadataFrequencyGoalMetadataFromJSON(json: any): OptimizationGoalMetadataFrequencyGoalMetadata {
    return OptimizationGoalMetadataFrequencyGoalMetadataFromJSONTyped(json, false);
}

export function OptimizationGoalMetadataFrequencyGoalMetadataFromJSONTyped(json: any, ignoreDiscriminator: boolean): OptimizationGoalMetadataFrequencyGoalMetadata {
    if (json == null) {
        return json;
    }
    return {
        
        'frequency': json['frequency'] == null ? undefined : json['frequency'],
        'timerange': json['timerange'] == null ? undefined : json['timerange'],
    };
}

  export function OptimizationGoalMetadataFrequencyGoalMetadataToJSON(json: any): OptimizationGoalMetadataFrequencyGoalMetadata {
      return OptimizationGoalMetadataFrequencyGoalMetadataToJSONTyped(json, false);
  }

  export function OptimizationGoalMetadataFrequencyGoalMetadataToJSONTyped(value?: OptimizationGoalMetadataFrequencyGoalMetadata | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'frequency': value['frequency'],
        'timerange': value['timerange'],
    };
}

