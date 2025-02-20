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
    CatalogsProductGroupFilterKeys,
    CatalogsProductGroupFilterKeysFromJSON,
    CatalogsProductGroupFilterKeysToJSON,
    CatalogsProductGroupFiltersAllOf,
    CatalogsProductGroupFiltersAllOfFromJSON,
    CatalogsProductGroupFiltersAllOfToJSON,
    CatalogsProductGroupFiltersAnyOf,
    CatalogsProductGroupFiltersAnyOfFromJSON,
    CatalogsProductGroupFiltersAnyOfToJSON,
} from './';

/**
 * Object holding a group of filters for a catalog product group
 * @export
 * @interface CatalogsProductGroupFilters
 */
export interface CatalogsProductGroupFilters  {
    /**
     * 
     * @type {Array<CatalogsProductGroupFilterKeys>}
     * @memberof CatalogsProductGroupFilters
     */
    anyOf: Array<CatalogsProductGroupFilterKeys>;
    /**
     * 
     * @type {Array<CatalogsProductGroupFilterKeys>}
     * @memberof CatalogsProductGroupFilters
     */
    allOf: Array<CatalogsProductGroupFilterKeys>;
}

export function CatalogsProductGroupFiltersFromJSON(json: any): CatalogsProductGroupFilters {
    return {
        'anyOf': (json['any_of'] as Array<any>).map(CatalogsProductGroupFilterKeysFromJSON),
        'allOf': (json['all_of'] as Array<any>).map(CatalogsProductGroupFilterKeysFromJSON),
    };
}

export function CatalogsProductGroupFiltersToJSON(value?: CatalogsProductGroupFilters): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'any_of': (value.anyOf as Array<any>).map(CatalogsProductGroupFilterKeysToJSON),
        'all_of': (value.allOf as Array<any>).map(CatalogsProductGroupFilterKeysToJSON),
    };
}


