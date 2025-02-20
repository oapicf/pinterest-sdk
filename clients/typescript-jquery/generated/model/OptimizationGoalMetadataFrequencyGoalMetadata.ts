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

export interface OptimizationGoalMetadataFrequencyGoalMetadata {
    frequency?: number;

    /**
     * User entity counts time range
     */
    timerange?: OptimizationGoalMetadataFrequencyGoalMetadata.TimerangeEnum;

}
export namespace OptimizationGoalMetadataFrequencyGoalMetadata {
    export enum TimerangeEnum {
        ThirtyDay = <any> 'THIRTY_DAY',
        Day = <any> 'DAY',
        SevenDay = <any> 'SEVEN_DAY',
        TwentyMinute = <any> 'TWENTY_MINUTE',
        TenMinute = <any> 'TEN_MINUTE',
        TwentyFourHour = <any> 'TWENTY_FOUR_HOUR'
    }
}
