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
    CatalogsProductGroupFilterKeys,
    CatalogsProductGroupFilterKeysFromJSON,
    CatalogsProductGroupFilterKeysToJSON,
    CatalogsProductGroupFiltersRequestAnyOf,
    CatalogsProductGroupFiltersRequestAnyOfFromJSON,
    CatalogsProductGroupFiltersRequestAnyOfToJSON,
    CatalogsProductGroupFiltersRequestAnyOf1,
    CatalogsProductGroupFiltersRequestAnyOf1FromJSON,
    CatalogsProductGroupFiltersRequestAnyOf1ToJSON,
} from './';

/**
 * Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 * @export
 * @interface CatalogsProductGroupFiltersRequest
 */
export interface CatalogsProductGroupFiltersRequest  {
    /**
     * 
     * @type {Array<CatalogsProductGroupFilterKeys>}
     * @memberof CatalogsProductGroupFiltersRequest
     */
    anyOf: Array<CatalogsProductGroupFilterKeys>;
    /**
     * 
     * @type {Array<CatalogsProductGroupFilterKeys>}
     * @memberof CatalogsProductGroupFiltersRequest
     */
    allOf: Array<CatalogsProductGroupFilterKeys>;
}

export function CatalogsProductGroupFiltersRequestFromJSON(json: any): CatalogsProductGroupFiltersRequest {
    return {
        'anyOf': (json['any_of'] as Array<any>).map(CatalogsProductGroupFilterKeysFromJSON),
        'allOf': (json['all_of'] as Array<any>).map(CatalogsProductGroupFilterKeysFromJSON),
    };
}

export function CatalogsProductGroupFiltersRequestToJSON(value?: CatalogsProductGroupFiltersRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'any_of': (value.anyOf as Array<any>).map(CatalogsProductGroupFilterKeysToJSON),
        'all_of': (value.allOf as Array<any>).map(CatalogsProductGroupFilterKeysToJSON),
    };
}

