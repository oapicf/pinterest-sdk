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

import type { CatalogsCreativeAssetsProductGroupProductCounts } from './CatalogsCreativeAssetsProductGroupProductCounts';
import {
    instanceOfCatalogsCreativeAssetsProductGroupProductCounts,
    CatalogsCreativeAssetsProductGroupProductCountsFromJSON,
    CatalogsCreativeAssetsProductGroupProductCountsFromJSONTyped,
    CatalogsCreativeAssetsProductGroupProductCountsToJSON,
} from './CatalogsCreativeAssetsProductGroupProductCounts';
import type { CatalogsHotelProductGroupProductCounts } from './CatalogsHotelProductGroupProductCounts';
import {
    instanceOfCatalogsHotelProductGroupProductCounts,
    CatalogsHotelProductGroupProductCountsFromJSON,
    CatalogsHotelProductGroupProductCountsFromJSONTyped,
    CatalogsHotelProductGroupProductCountsToJSON,
} from './CatalogsHotelProductGroupProductCounts';
import type { CatalogsRetailProductGroupProductCounts } from './CatalogsRetailProductGroupProductCounts';
import {
    instanceOfCatalogsRetailProductGroupProductCounts,
    CatalogsRetailProductGroupProductCountsFromJSON,
    CatalogsRetailProductGroupProductCountsFromJSONTyped,
    CatalogsRetailProductGroupProductCountsToJSON,
} from './CatalogsRetailProductGroupProductCounts';

/**
 * @type CatalogsProductGroupProductCountsVertical
 * Product counts for a CatalogsProductGroup
 * @export
 */
export type CatalogsProductGroupProductCountsVertical = { catalogType: 'CREATIVE_ASSETS' } & CatalogsCreativeAssetsProductGroupProductCounts | { catalogType: 'HOTEL' } & CatalogsHotelProductGroupProductCounts | { catalogType: 'RETAIL' } & CatalogsRetailProductGroupProductCounts;

export function CatalogsProductGroupProductCountsVerticalFromJSON(json: any): CatalogsProductGroupProductCountsVertical {
    return CatalogsProductGroupProductCountsVerticalFromJSONTyped(json, false);
}

export function CatalogsProductGroupProductCountsVerticalFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsProductGroupProductCountsVertical {
    if (json == null) {
        return json;
    }
    switch (json['catalog_type']) {
        case 'CREATIVE_ASSETS':
            return Object.assign({}, CatalogsCreativeAssetsProductGroupProductCountsFromJSONTyped(json, true), { catalogType: 'CREATIVE_ASSETS' } as const);
        case 'HOTEL':
            return Object.assign({}, CatalogsHotelProductGroupProductCountsFromJSONTyped(json, true), { catalogType: 'HOTEL' } as const);
        case 'RETAIL':
            return Object.assign({}, CatalogsRetailProductGroupProductCountsFromJSONTyped(json, true), { catalogType: 'RETAIL' } as const);
        default:
            throw new Error(`No variant of CatalogsProductGroupProductCountsVertical exists with 'catalogType=${json['catalogType']}'`);
    }
}

export function CatalogsProductGroupProductCountsVerticalToJSON(value?: CatalogsProductGroupProductCountsVertical | null): any {
    if (value == null) {
        return value;
    }
    switch (value['catalogType']) {
        case 'CREATIVE_ASSETS':
            return CatalogsCreativeAssetsProductGroupProductCountsToJSON(value);
        case 'HOTEL':
            return CatalogsHotelProductGroupProductCountsToJSON(value);
        case 'RETAIL':
            return CatalogsRetailProductGroupProductCountsToJSON(value);
        default:
            throw new Error(`No variant of CatalogsProductGroupProductCountsVertical exists with 'catalogType=${value['catalogType']}'`);
    }

}

