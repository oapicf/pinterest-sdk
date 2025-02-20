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
import type { TargetingSpecAppType } from './TargetingSpecAppType';
import {
    TargetingSpecAppTypeFromJSON,
    TargetingSpecAppTypeFromJSONTyped,
    TargetingSpecAppTypeToJSON,
    TargetingSpecAppTypeToJSONTyped,
} from './TargetingSpecAppType';

/**
 * This represents a mapping from app type targeting criteria to a bid price adjustment.
 * 
 * Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 * @export
 * @interface AppTypeMultipliers
 */
export interface AppTypeMultipliers {
    [key: string]: number | any;
    /**
     * 
     * @type {TargetingSpecAppType}
     * @memberof AppTypeMultipliers
     */
    aPPTYPE?: TargetingSpecAppType;
}



/**
 * Check if a given object implements the AppTypeMultipliers interface.
 */
export function instanceOfAppTypeMultipliers(value: object): value is AppTypeMultipliers {
    return true;
}

export function AppTypeMultipliersFromJSON(json: any): AppTypeMultipliers {
    return AppTypeMultipliersFromJSONTyped(json, false);
}

export function AppTypeMultipliersFromJSONTyped(json: any, ignoreDiscriminator: boolean): AppTypeMultipliers {
    if (json == null) {
        return json;
    }
    return {
        
            ...json,
        'aPPTYPE': json['APP_TYPE'] == null ? undefined : TargetingSpecAppTypeFromJSON(json['APP_TYPE']),
    };
}

  export function AppTypeMultipliersToJSON(json: any): AppTypeMultipliers {
      return AppTypeMultipliersToJSONTyped(json, false);
  }

  export function AppTypeMultipliersToJSONTyped(value?: AppTypeMultipliers | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
            ...value,
        'APP_TYPE': TargetingSpecAppTypeToJSON(value['aPPTYPE']),
    };
}

