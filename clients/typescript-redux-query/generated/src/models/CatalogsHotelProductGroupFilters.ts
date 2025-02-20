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
    CatalogsHotelProductGroupFilterKeys,
    CatalogsHotelProductGroupFilterKeysFromJSON,
    CatalogsHotelProductGroupFilterKeysToJSON,
    CatalogsHotelProductGroupFiltersAllOf,
    CatalogsHotelProductGroupFiltersAllOfFromJSON,
    CatalogsHotelProductGroupFiltersAllOfToJSON,
    CatalogsHotelProductGroupFiltersAnyOf,
    CatalogsHotelProductGroupFiltersAnyOfFromJSON,
    CatalogsHotelProductGroupFiltersAnyOfToJSON,
} from './';

/**
 * Object holding a group of filters for a hotel product group
 * @export
 * @interface CatalogsHotelProductGroupFilters
 */
export interface CatalogsHotelProductGroupFilters  {
    /**
     * 
     * @type {Array<CatalogsHotelProductGroupFilterKeys>}
     * @memberof CatalogsHotelProductGroupFilters
     */
    anyOf: Array<CatalogsHotelProductGroupFilterKeys>;
    /**
     * 
     * @type {Array<CatalogsHotelProductGroupFilterKeys>}
     * @memberof CatalogsHotelProductGroupFilters
     */
    allOf: Array<CatalogsHotelProductGroupFilterKeys>;
}

export function CatalogsHotelProductGroupFiltersFromJSON(json: any): CatalogsHotelProductGroupFilters {
    return {
        'anyOf': (json['any_of'] as Array<any>).map(CatalogsHotelProductGroupFilterKeysFromJSON),
        'allOf': (json['all_of'] as Array<any>).map(CatalogsHotelProductGroupFilterKeysFromJSON),
    };
}

export function CatalogsHotelProductGroupFiltersToJSON(value?: CatalogsHotelProductGroupFilters): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'any_of': (value.anyOf as Array<any>).map(CatalogsHotelProductGroupFilterKeysToJSON),
        'all_of': (value.allOf as Array<any>).map(CatalogsHotelProductGroupFilterKeysToJSON),
    };
}


