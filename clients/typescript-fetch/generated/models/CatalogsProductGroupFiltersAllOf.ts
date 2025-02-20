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
import type { CatalogsProductGroupFilterKeys } from './CatalogsProductGroupFilterKeys';
import {
    CatalogsProductGroupFilterKeysFromJSON,
    CatalogsProductGroupFilterKeysFromJSONTyped,
    CatalogsProductGroupFilterKeysToJSON,
    CatalogsProductGroupFilterKeysToJSONTyped,
} from './CatalogsProductGroupFilterKeys';

/**
 * 
 * @export
 * @interface CatalogsProductGroupFiltersAllOf
 */
export interface CatalogsProductGroupFiltersAllOf {
    /**
     * 
     * @type {Array<CatalogsProductGroupFilterKeys>}
     * @memberof CatalogsProductGroupFiltersAllOf
     */
    allOf: Array<CatalogsProductGroupFilterKeys>;
}

/**
 * Check if a given object implements the CatalogsProductGroupFiltersAllOf interface.
 */
export function instanceOfCatalogsProductGroupFiltersAllOf(value: object): value is CatalogsProductGroupFiltersAllOf {
    if (!('allOf' in value) || value['allOf'] === undefined) return false;
    return true;
}

export function CatalogsProductGroupFiltersAllOfFromJSON(json: any): CatalogsProductGroupFiltersAllOf {
    return CatalogsProductGroupFiltersAllOfFromJSONTyped(json, false);
}

export function CatalogsProductGroupFiltersAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsProductGroupFiltersAllOf {
    if (json == null) {
        return json;
    }
    return {
        
        'allOf': ((json['all_of'] as Array<any>).map(CatalogsProductGroupFilterKeysFromJSON)),
    };
}

  export function CatalogsProductGroupFiltersAllOfToJSON(json: any): CatalogsProductGroupFiltersAllOf {
      return CatalogsProductGroupFiltersAllOfToJSONTyped(json, false);
  }

  export function CatalogsProductGroupFiltersAllOfToJSONTyped(value?: CatalogsProductGroupFiltersAllOf | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'all_of': ((value['allOf'] as Array<any>).map(CatalogsProductGroupFilterKeysToJSON)),
    };
}

