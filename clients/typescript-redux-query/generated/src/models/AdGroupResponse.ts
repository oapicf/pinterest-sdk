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

import {
    ActionType,
    ActionTypeFromJSON,
    ActionTypeToJSON,
    AdGroupSummaryStatus,
    AdGroupSummaryStatusFromJSON,
    AdGroupSummaryStatusToJSON,
    BudgetType,
    BudgetTypeFromJSON,
    BudgetTypeToJSON,
    EntityStatus,
    EntityStatusFromJSON,
    EntityStatusToJSON,
    OptimizationGoalMetadata,
    OptimizationGoalMetadataFromJSON,
    OptimizationGoalMetadataToJSON,
    PacingDeliveryType,
    PacingDeliveryTypeFromJSON,
    PacingDeliveryTypeToJSON,
    PlacementGroupType,
    PlacementGroupTypeFromJSON,
    PlacementGroupTypeToJSON,
    TargetingSpec,
    TargetingSpecFromJSON,
    TargetingSpecToJSON,
    TrackingUrls,
    TrackingUrlsFromJSON,
    TrackingUrlsToJSON,
} from './';

/**
 * @type AdGroupResponse
 * @export
 */
export interface AdGroupResponse extends AdGroupCommon {
}

export function AdGroupResponseFromJSON(json: any): AdGroupResponse {
    return {
        ...AdGroupCommonFromJSON(json),
    };
}

export function AdGroupResponseToJSON(value?: AdGroupResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...AdGroupCommonToJSON(value),
    };
}
