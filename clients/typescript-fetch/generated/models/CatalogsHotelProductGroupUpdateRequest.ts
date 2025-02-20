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

import { mapValues } from '../runtime';
import type { CatalogsHotelProductGroupFilters } from './CatalogsHotelProductGroupFilters';
import {
    CatalogsHotelProductGroupFiltersFromJSON,
    CatalogsHotelProductGroupFiltersFromJSONTyped,
    CatalogsHotelProductGroupFiltersToJSON,
    CatalogsHotelProductGroupFiltersToJSONTyped,
} from './CatalogsHotelProductGroupFilters';

/**
 * Request object for updating a hotel product group.
 * @export
 * @interface CatalogsHotelProductGroupUpdateRequest
 */
export interface CatalogsHotelProductGroupUpdateRequest {
    /**
     * 
     * @type {string}
     * @memberof CatalogsHotelProductGroupUpdateRequest
     */
    catalogType?: CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum;
    /**
     * 
     * @type {string}
     * @memberof CatalogsHotelProductGroupUpdateRequest
     */
    name?: string;
    /**
     * 
     * @type {string}
     * @memberof CatalogsHotelProductGroupUpdateRequest
     */
    description?: string | null;
    /**
     * 
     * @type {CatalogsHotelProductGroupFilters}
     * @memberof CatalogsHotelProductGroupUpdateRequest
     */
    filters?: CatalogsHotelProductGroupFilters;
}


/**
 * @export
 */
export const CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum = {
    Hotel: 'HOTEL'
} as const;
export type CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum = typeof CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum[keyof typeof CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum];


/**
 * Check if a given object implements the CatalogsHotelProductGroupUpdateRequest interface.
 */
export function instanceOfCatalogsHotelProductGroupUpdateRequest(value: object): value is CatalogsHotelProductGroupUpdateRequest {
    return true;
}

export function CatalogsHotelProductGroupUpdateRequestFromJSON(json: any): CatalogsHotelProductGroupUpdateRequest {
    return CatalogsHotelProductGroupUpdateRequestFromJSONTyped(json, false);
}

export function CatalogsHotelProductGroupUpdateRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsHotelProductGroupUpdateRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'catalogType': json['catalog_type'] == null ? undefined : json['catalog_type'],
        'name': json['name'] == null ? undefined : json['name'],
        'description': json['description'] == null ? undefined : json['description'],
        'filters': json['filters'] == null ? undefined : CatalogsHotelProductGroupFiltersFromJSON(json['filters']),
    };
}

  export function CatalogsHotelProductGroupUpdateRequestToJSON(json: any): CatalogsHotelProductGroupUpdateRequest {
      return CatalogsHotelProductGroupUpdateRequestToJSONTyped(json, false);
  }

  export function CatalogsHotelProductGroupUpdateRequestToJSONTyped(value?: CatalogsHotelProductGroupUpdateRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'catalog_type': value['catalogType'],
        'name': value['name'],
        'description': value['description'],
        'filters': CatalogsHotelProductGroupFiltersToJSON(value['filters']),
    };
}

