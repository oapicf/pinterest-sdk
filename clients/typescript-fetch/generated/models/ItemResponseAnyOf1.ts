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

import type { CatalogsCreativeAssetsItemErrorResponse } from './CatalogsCreativeAssetsItemErrorResponse';
import {
    instanceOfCatalogsCreativeAssetsItemErrorResponse,
    CatalogsCreativeAssetsItemErrorResponseFromJSON,
    CatalogsCreativeAssetsItemErrorResponseFromJSONTyped,
    CatalogsCreativeAssetsItemErrorResponseToJSON,
} from './CatalogsCreativeAssetsItemErrorResponse';
import type { CatalogsHotelItemErrorResponse } from './CatalogsHotelItemErrorResponse';
import {
    instanceOfCatalogsHotelItemErrorResponse,
    CatalogsHotelItemErrorResponseFromJSON,
    CatalogsHotelItemErrorResponseFromJSONTyped,
    CatalogsHotelItemErrorResponseToJSON,
} from './CatalogsHotelItemErrorResponse';
import type { CatalogsRetailItemErrorResponse } from './CatalogsRetailItemErrorResponse';
import {
    instanceOfCatalogsRetailItemErrorResponse,
    CatalogsRetailItemErrorResponseFromJSON,
    CatalogsRetailItemErrorResponseFromJSONTyped,
    CatalogsRetailItemErrorResponseToJSON,
} from './CatalogsRetailItemErrorResponse';

/**
 * @type ItemResponseAnyOf1
 * 
 * @export
 */
export type ItemResponseAnyOf1 = { catalogType: 'CREATIVE_ASSETS' } & CatalogsCreativeAssetsItemErrorResponse | { catalogType: 'HOTEL' } & CatalogsHotelItemErrorResponse | { catalogType: 'RETAIL' } & CatalogsRetailItemErrorResponse;

export function ItemResponseAnyOf1FromJSON(json: any): ItemResponseAnyOf1 {
    return ItemResponseAnyOf1FromJSONTyped(json, false);
}

export function ItemResponseAnyOf1FromJSONTyped(json: any, ignoreDiscriminator: boolean): ItemResponseAnyOf1 {
    if (json == null) {
        return json;
    }
    switch (json['catalog_type']) {
        case 'CREATIVE_ASSETS':
            return Object.assign({}, CatalogsCreativeAssetsItemErrorResponseFromJSONTyped(json, true), { catalogType: 'CREATIVE_ASSETS' } as const);
        case 'HOTEL':
            return Object.assign({}, CatalogsHotelItemErrorResponseFromJSONTyped(json, true), { catalogType: 'HOTEL' } as const);
        case 'RETAIL':
            return Object.assign({}, CatalogsRetailItemErrorResponseFromJSONTyped(json, true), { catalogType: 'RETAIL' } as const);
        default:
            throw new Error(`No variant of ItemResponseAnyOf1 exists with 'catalogType=${json['catalogType']}'`);
    }
}

export function ItemResponseAnyOf1ToJSON(value?: ItemResponseAnyOf1 | null): any {
    if (value == null) {
        return value;
    }
    switch (value['catalogType']) {
        case 'CREATIVE_ASSETS':
            return CatalogsCreativeAssetsItemErrorResponseToJSON(value);
        case 'HOTEL':
            return CatalogsHotelItemErrorResponseToJSON(value);
        case 'RETAIL':
            return CatalogsRetailItemErrorResponseToJSON(value);
        default:
            throw new Error(`No variant of ItemResponseAnyOf1 exists with 'catalogType=${value['catalogType']}'`);
    }

}

