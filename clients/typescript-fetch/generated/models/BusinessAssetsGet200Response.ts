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
import type { GetBusinessAssetsResponse } from './GetBusinessAssetsResponse';
import {
    GetBusinessAssetsResponseFromJSON,
    GetBusinessAssetsResponseFromJSONTyped,
    GetBusinessAssetsResponseToJSON,
    GetBusinessAssetsResponseToJSONTyped,
} from './GetBusinessAssetsResponse';

/**
 * 
 * @export
 * @interface BusinessAssetsGet200Response
 */
export interface BusinessAssetsGet200Response {
    /**
     * List of assets the requesting business has access to.
     * @type {Array<GetBusinessAssetsResponse>}
     * @memberof BusinessAssetsGet200Response
     */
    items: Array<GetBusinessAssetsResponse>;
    /**
     * 
     * @type {string}
     * @memberof BusinessAssetsGet200Response
     */
    bookmark?: string | null;
}

/**
 * Check if a given object implements the BusinessAssetsGet200Response interface.
 */
export function instanceOfBusinessAssetsGet200Response(value: object): value is BusinessAssetsGet200Response {
    if (!('items' in value) || value['items'] === undefined) return false;
    return true;
}

export function BusinessAssetsGet200ResponseFromJSON(json: any): BusinessAssetsGet200Response {
    return BusinessAssetsGet200ResponseFromJSONTyped(json, false);
}

export function BusinessAssetsGet200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): BusinessAssetsGet200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'items': ((json['items'] as Array<any>).map(GetBusinessAssetsResponseFromJSON)),
        'bookmark': json['bookmark'] == null ? undefined : json['bookmark'],
    };
}

  export function BusinessAssetsGet200ResponseToJSON(json: any): BusinessAssetsGet200Response {
      return BusinessAssetsGet200ResponseToJSONTyped(json, false);
  }

  export function BusinessAssetsGet200ResponseToJSONTyped(value?: BusinessAssetsGet200Response | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'items': ((value['items'] as Array<any>).map(GetBusinessAssetsResponseToJSON)),
        'bookmark': value['bookmark'],
    };
}

