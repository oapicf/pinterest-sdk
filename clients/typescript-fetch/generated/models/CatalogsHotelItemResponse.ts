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
import type { Pin } from './Pin';
import {
    PinFromJSON,
    PinFromJSONTyped,
    PinToJSON,
    PinToJSONTyped,
} from './Pin';
import type { CatalogsHotelAttributes } from './CatalogsHotelAttributes';
import {
    CatalogsHotelAttributesFromJSON,
    CatalogsHotelAttributesFromJSONTyped,
    CatalogsHotelAttributesToJSON,
    CatalogsHotelAttributesToJSONTyped,
} from './CatalogsHotelAttributes';
import type { CatalogsType } from './CatalogsType';
import {
    CatalogsTypeFromJSON,
    CatalogsTypeFromJSONTyped,
    CatalogsTypeToJSON,
    CatalogsTypeToJSONTyped,
} from './CatalogsType';

/**
 * Object describing a hotel record
 * @export
 * @interface CatalogsHotelItemResponse
 */
export interface CatalogsHotelItemResponse {
    /**
     * 
     * @type {CatalogsType}
     * @memberof CatalogsHotelItemResponse
     */
    catalogType: CatalogsType;
    /**
     * The catalog hotel id in the merchant namespace
     * @type {string}
     * @memberof CatalogsHotelItemResponse
     */
    hotelId?: string;
    /**
     * The pins mapped to the item
     * @type {Array<Pin>}
     * @memberof CatalogsHotelItemResponse
     */
    pins?: Array<Pin> | null;
    /**
     * 
     * @type {CatalogsHotelAttributes}
     * @memberof CatalogsHotelItemResponse
     */
    attributes?: CatalogsHotelAttributes;
}



/**
 * Check if a given object implements the CatalogsHotelItemResponse interface.
 */
export function instanceOfCatalogsHotelItemResponse(value: object): value is CatalogsHotelItemResponse {
    if (!('catalogType' in value) || value['catalogType'] === undefined) return false;
    return true;
}

export function CatalogsHotelItemResponseFromJSON(json: any): CatalogsHotelItemResponse {
    return CatalogsHotelItemResponseFromJSONTyped(json, false);
}

export function CatalogsHotelItemResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsHotelItemResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'catalogType': CatalogsTypeFromJSON(json['catalog_type']),
        'hotelId': json['hotel_id'] == null ? undefined : json['hotel_id'],
        'pins': json['pins'] == null ? undefined : ((json['pins'] as Array<any>).map(PinFromJSON)),
        'attributes': json['attributes'] == null ? undefined : CatalogsHotelAttributesFromJSON(json['attributes']),
    };
}

  export function CatalogsHotelItemResponseToJSON(json: any): CatalogsHotelItemResponse {
      return CatalogsHotelItemResponseToJSONTyped(json, false);
  }

  export function CatalogsHotelItemResponseToJSONTyped(value?: CatalogsHotelItemResponse | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'catalog_type': CatalogsTypeToJSON(value['catalogType']),
        'hotel_id': value['hotelId'],
        'pins': value['pins'] == null ? undefined : ((value['pins'] as Array<any>).map(PinToJSON)),
        'attributes': CatalogsHotelAttributesToJSON(value['attributes']),
    };
}

