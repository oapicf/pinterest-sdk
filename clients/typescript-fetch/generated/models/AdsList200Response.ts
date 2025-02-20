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
import type { AdResponse } from './AdResponse';
import {
    AdResponseFromJSON,
    AdResponseFromJSONTyped,
    AdResponseToJSON,
    AdResponseToJSONTyped,
} from './AdResponse';

/**
 * 
 * @export
 * @interface AdsList200Response
 */
export interface AdsList200Response {
    /**
     * 
     * @type {Array<AdResponse>}
     * @memberof AdsList200Response
     */
    items: Array<AdResponse>;
    /**
     * 
     * @type {string}
     * @memberof AdsList200Response
     */
    bookmark?: string | null;
}

/**
 * Check if a given object implements the AdsList200Response interface.
 */
export function instanceOfAdsList200Response(value: object): value is AdsList200Response {
    if (!('items' in value) || value['items'] === undefined) return false;
    return true;
}

export function AdsList200ResponseFromJSON(json: any): AdsList200Response {
    return AdsList200ResponseFromJSONTyped(json, false);
}

export function AdsList200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): AdsList200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'items': ((json['items'] as Array<any>).map(AdResponseFromJSON)),
        'bookmark': json['bookmark'] == null ? undefined : json['bookmark'],
    };
}

  export function AdsList200ResponseToJSON(json: any): AdsList200Response {
      return AdsList200ResponseToJSONTyped(json, false);
  }

  export function AdsList200ResponseToJSONTyped(value?: AdsList200Response | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'items': ((value['items'] as Array<any>).map(AdResponseToJSON)),
        'bookmark': value['bookmark'],
    };
}

