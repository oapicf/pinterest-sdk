// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
} from './';

/**
 * 
 * @export
 * @interface CatalogsHotelProductGroupFiltersAnyOf
 */
export interface CatalogsHotelProductGroupFiltersAnyOf  {
    /**
     * 
     * @type {Array<CatalogsHotelProductGroupFilterKeys>}
     * @memberof CatalogsHotelProductGroupFiltersAnyOf
     */
    anyOf: Array<CatalogsHotelProductGroupFilterKeys>;
}

export function CatalogsHotelProductGroupFiltersAnyOfFromJSON(json: any): CatalogsHotelProductGroupFiltersAnyOf {
    return {
        'anyOf': (json['any_of'] as Array<any>).map(CatalogsHotelProductGroupFilterKeysFromJSON),
    };
}

export function CatalogsHotelProductGroupFiltersAnyOfToJSON(value?: CatalogsHotelProductGroupFiltersAnyOf): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'any_of': (value.anyOf as Array<any>).map(CatalogsHotelProductGroupFilterKeysToJSON),
    };
}

