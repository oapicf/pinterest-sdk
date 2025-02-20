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
    CatalogsCreativeAssetsProductGroupFilterKeys,
    CatalogsCreativeAssetsProductGroupFilterKeysFromJSON,
    CatalogsCreativeAssetsProductGroupFilterKeysToJSON,
} from './';

/**
 * 
 * @export
 * @interface CatalogsCreativeAssetsProductGroupFiltersAnyOf
 */
export interface CatalogsCreativeAssetsProductGroupFiltersAnyOf  {
    /**
     * 
     * @type {Array<CatalogsCreativeAssetsProductGroupFilterKeys>}
     * @memberof CatalogsCreativeAssetsProductGroupFiltersAnyOf
     */
    anyOf: Array<CatalogsCreativeAssetsProductGroupFilterKeys>;
}

export function CatalogsCreativeAssetsProductGroupFiltersAnyOfFromJSON(json: any): CatalogsCreativeAssetsProductGroupFiltersAnyOf {
    return {
        'anyOf': (json['any_of'] as Array<any>).map(CatalogsCreativeAssetsProductGroupFilterKeysFromJSON),
    };
}

export function CatalogsCreativeAssetsProductGroupFiltersAnyOfToJSON(value?: CatalogsCreativeAssetsProductGroupFiltersAnyOf): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'any_of': (value.anyOf as Array<any>).map(CatalogsCreativeAssetsProductGroupFilterKeysToJSON),
    };
}


