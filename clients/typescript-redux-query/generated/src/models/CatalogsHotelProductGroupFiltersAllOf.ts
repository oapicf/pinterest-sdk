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
} from './';

/**
 * 
 * @export
 * @interface CatalogsHotelProductGroupFiltersAllOf
 */
export interface CatalogsHotelProductGroupFiltersAllOf  {
    /**
     * 
     * @type {Array<CatalogsHotelProductGroupFilterKeys>}
     * @memberof CatalogsHotelProductGroupFiltersAllOf
     */
    allOf: Array<CatalogsHotelProductGroupFilterKeys>;
}

export function CatalogsHotelProductGroupFiltersAllOfFromJSON(json: any): CatalogsHotelProductGroupFiltersAllOf {
    return {
        'allOf': (json['all_of'] as Array<any>).map(CatalogsHotelProductGroupFilterKeysFromJSON),
    };
}

export function CatalogsHotelProductGroupFiltersAllOfToJSON(value?: CatalogsHotelProductGroupFiltersAllOf): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'all_of': (value.allOf as Array<any>).map(CatalogsHotelProductGroupFilterKeysToJSON),
    };
}


