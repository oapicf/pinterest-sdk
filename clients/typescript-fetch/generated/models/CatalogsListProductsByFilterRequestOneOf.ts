/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { CatalogsProductGroupFilters } from './CatalogsProductGroupFilters';
import {
    CatalogsProductGroupFiltersFromJSON,
    CatalogsProductGroupFiltersFromJSONTyped,
    CatalogsProductGroupFiltersToJSON,
} from './CatalogsProductGroupFilters';

/**
 * Request object to list products for a given feed_id and product group filter.
 * @export
 * @interface CatalogsListProductsByFilterRequestOneOf
 */
export interface CatalogsListProductsByFilterRequestOneOf {
    /**
     * Catalog Feed id pertaining to the catalog product group filter.
     * @type {string}
     * @memberof CatalogsListProductsByFilterRequestOneOf
     */
    feedId: string;
    /**
     * 
     * @type {CatalogsProductGroupFilters}
     * @memberof CatalogsListProductsByFilterRequestOneOf
     */
    filters: CatalogsProductGroupFilters;
}

/**
 * Check if a given object implements the CatalogsListProductsByFilterRequestOneOf interface.
 */
export function instanceOfCatalogsListProductsByFilterRequestOneOf(value: object): boolean {
    if (!('feedId' in value)) return false;
    if (!('filters' in value)) return false;
    return true;
}

export function CatalogsListProductsByFilterRequestOneOfFromJSON(json: any): CatalogsListProductsByFilterRequestOneOf {
    return CatalogsListProductsByFilterRequestOneOfFromJSONTyped(json, false);
}

export function CatalogsListProductsByFilterRequestOneOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsListProductsByFilterRequestOneOf {
    if (json == null) {
        return json;
    }
    return {
        
        'feedId': json['feed_id'],
        'filters': CatalogsProductGroupFiltersFromJSON(json['filters']),
    };
}

export function CatalogsListProductsByFilterRequestOneOfToJSON(value?: CatalogsListProductsByFilterRequestOneOf | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'feed_id': value['feedId'],
        'filters': CatalogsProductGroupFiltersToJSON(value['filters']),
    };
}
