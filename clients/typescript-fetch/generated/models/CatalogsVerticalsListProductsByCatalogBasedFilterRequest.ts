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

import type { CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest } from './CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest';
import {
    instanceOfCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest,
    CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestFromJSON,
    CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestFromJSONTyped,
    CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestToJSON,
} from './CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest';
import type { CatalogsHotelListProductsByCatalogBasedFilterRequest } from './CatalogsHotelListProductsByCatalogBasedFilterRequest';
import {
    instanceOfCatalogsHotelListProductsByCatalogBasedFilterRequest,
    CatalogsHotelListProductsByCatalogBasedFilterRequestFromJSON,
    CatalogsHotelListProductsByCatalogBasedFilterRequestFromJSONTyped,
    CatalogsHotelListProductsByCatalogBasedFilterRequestToJSON,
} from './CatalogsHotelListProductsByCatalogBasedFilterRequest';
import type { CatalogsRetailListProductsByCatalogBasedFilterRequest } from './CatalogsRetailListProductsByCatalogBasedFilterRequest';
import {
    instanceOfCatalogsRetailListProductsByCatalogBasedFilterRequest,
    CatalogsRetailListProductsByCatalogBasedFilterRequestFromJSON,
    CatalogsRetailListProductsByCatalogBasedFilterRequestFromJSONTyped,
    CatalogsRetailListProductsByCatalogBasedFilterRequestToJSON,
} from './CatalogsRetailListProductsByCatalogBasedFilterRequest';

/**
 * @type CatalogsVerticalsListProductsByCatalogBasedFilterRequest
 * Request object to list products for a given catalog_id and product group filter.
 * @export
 */
export type CatalogsVerticalsListProductsByCatalogBasedFilterRequest = { catalogType: 'CREATIVE_ASSETS' } & CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest | { catalogType: 'HOTEL' } & CatalogsHotelListProductsByCatalogBasedFilterRequest | { catalogType: 'RETAIL' } & CatalogsRetailListProductsByCatalogBasedFilterRequest;

export function CatalogsVerticalsListProductsByCatalogBasedFilterRequestFromJSON(json: any): CatalogsVerticalsListProductsByCatalogBasedFilterRequest {
    return CatalogsVerticalsListProductsByCatalogBasedFilterRequestFromJSONTyped(json, false);
}

export function CatalogsVerticalsListProductsByCatalogBasedFilterRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsVerticalsListProductsByCatalogBasedFilterRequest {
    if (json == null) {
        return json;
    }
    switch (json['catalog_type']) {
        case 'CREATIVE_ASSETS':
            return Object.assign({}, CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestFromJSONTyped(json, true), { catalogType: 'CREATIVE_ASSETS' } as const);
        case 'HOTEL':
            return Object.assign({}, CatalogsHotelListProductsByCatalogBasedFilterRequestFromJSONTyped(json, true), { catalogType: 'HOTEL' } as const);
        case 'RETAIL':
            return Object.assign({}, CatalogsRetailListProductsByCatalogBasedFilterRequestFromJSONTyped(json, true), { catalogType: 'RETAIL' } as const);
        default:
            throw new Error(`No variant of CatalogsVerticalsListProductsByCatalogBasedFilterRequest exists with 'catalogType=${json['catalogType']}'`);
    }
}

export function CatalogsVerticalsListProductsByCatalogBasedFilterRequestToJSON(value?: CatalogsVerticalsListProductsByCatalogBasedFilterRequest | null): any {
    if (value == null) {
        return value;
    }
    switch (value['catalogType']) {
        case 'CREATIVE_ASSETS':
            return CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestToJSON(value);
        case 'HOTEL':
            return CatalogsHotelListProductsByCatalogBasedFilterRequestToJSON(value);
        case 'RETAIL':
            return CatalogsRetailListProductsByCatalogBasedFilterRequestToJSON(value);
        default:
            throw new Error(`No variant of CatalogsVerticalsListProductsByCatalogBasedFilterRequest exists with 'catalogType=${value['catalogType']}'`);
    }

}

