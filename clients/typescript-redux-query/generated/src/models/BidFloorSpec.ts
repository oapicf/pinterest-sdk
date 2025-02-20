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
    ActionType,
    ActionTypeFromJSON,
    ActionTypeToJSON,
    Country,
    CountryFromJSON,
    CountryToJSON,
    CreativeType,
    CreativeTypeFromJSON,
    CreativeTypeToJSON,
    Currency,
    CurrencyFromJSON,
    CurrencyToJSON,
    ObjectiveType,
    ObjectiveTypeFromJSON,
    ObjectiveTypeToJSON,
    OptimizationGoalMetadata,
    OptimizationGoalMetadataFromJSON,
    OptimizationGoalMetadataToJSON,
} from './';

/**
 * 
 * @export
 * @interface BidFloorSpec
 */
export interface BidFloorSpec  {
    /**
     * 
     * @type {Array<Country>}
     * @memberof BidFloorSpec
     */
    countries?: Array<Country>;
    /**
     * 
     * @type {Currency}
     * @memberof BidFloorSpec
     */
    currency: Currency;
    /**
     * 
     * @type {ObjectiveType}
     * @memberof BidFloorSpec
     */
    objectiveType?: ObjectiveType;
    /**
     * 
     * @type {ActionType}
     * @memberof BidFloorSpec
     */
    billableEvent: ActionType;
    /**
     * 
     * @type {OptimizationGoalMetadata}
     * @memberof BidFloorSpec
     */
    optimizationGoalMetadata?: OptimizationGoalMetadata;
    /**
     * 
     * @type {CreativeType}
     * @memberof BidFloorSpec
     */
    creativeType?: CreativeType;
}

export function BidFloorSpecFromJSON(json: any): BidFloorSpec {
    return {
        'countries': !exists(json, 'countries') ? undefined : (json['countries'] as Array<any>).map(CountryFromJSON),
        'currency': CurrencyFromJSON(json['currency']),
        'objectiveType': !exists(json, 'objective_type') ? undefined : ObjectiveTypeFromJSON(json['objective_type']),
        'billableEvent': ActionTypeFromJSON(json['billable_event']),
        'optimizationGoalMetadata': !exists(json, 'optimization_goal_metadata') ? undefined : OptimizationGoalMetadataFromJSON(json['optimization_goal_metadata']),
        'creativeType': !exists(json, 'creative_type') ? undefined : CreativeTypeFromJSON(json['creative_type']),
    };
}

export function BidFloorSpecToJSON(value?: BidFloorSpec): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'countries': value.countries === undefined ? undefined : (value.countries as Array<any>).map(CountryToJSON),
        'currency': CurrencyToJSON(value.currency),
        'objective_type': ObjectiveTypeToJSON(value.objectiveType),
        'billable_event': ActionTypeToJSON(value.billableEvent),
        'optimization_goal_metadata': OptimizationGoalMetadataToJSON(value.optimizationGoalMetadata),
        'creative_type': CreativeTypeToJSON(value.creativeType),
    };
}



