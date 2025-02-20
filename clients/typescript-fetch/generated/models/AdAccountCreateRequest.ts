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
import type { Country } from './Country';
import {
    CountryFromJSON,
    CountryFromJSONTyped,
    CountryToJSON,
    CountryToJSONTyped,
} from './Country';

/**
 * 
 * @export
 * @interface AdAccountCreateRequest
 */
export interface AdAccountCreateRequest {
    /**
     * 
     * @type {Country}
     * @memberof AdAccountCreateRequest
     */
    country?: Country;
    /**
     * Ad Account name.
     * @type {string}
     * @memberof AdAccountCreateRequest
     */
    name?: string;
    /**
     * Advertiser's owning user ID.
     * @type {string}
     * @memberof AdAccountCreateRequest
     */
    ownerUserId?: string;
}



/**
 * Check if a given object implements the AdAccountCreateRequest interface.
 */
export function instanceOfAdAccountCreateRequest(value: object): value is AdAccountCreateRequest {
    return true;
}

export function AdAccountCreateRequestFromJSON(json: any): AdAccountCreateRequest {
    return AdAccountCreateRequestFromJSONTyped(json, false);
}

export function AdAccountCreateRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): AdAccountCreateRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'country': json['country'] == null ? undefined : CountryFromJSON(json['country']),
        'name': json['name'] == null ? undefined : json['name'],
        'ownerUserId': json['owner_user_id'] == null ? undefined : json['owner_user_id'],
    };
}

  export function AdAccountCreateRequestToJSON(json: any): AdAccountCreateRequest {
      return AdAccountCreateRequestToJSONTyped(json, false);
  }

  export function AdAccountCreateRequestToJSONTyped(value?: AdAccountCreateRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'country': CountryToJSON(value['country']),
        'name': value['name'],
        'owner_user_id': value['ownerUserId'],
    };
}

