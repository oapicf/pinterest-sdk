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
import type { UserBusinessRoleBinding } from './UserBusinessRoleBinding';
import {
    UserBusinessRoleBindingFromJSON,
    UserBusinessRoleBindingFromJSONTyped,
    UserBusinessRoleBindingToJSON,
    UserBusinessRoleBindingToJSONTyped,
} from './UserBusinessRoleBinding';

/**
 * 
 * @export
 * @interface GetBusinessEmployers200Response
 */
export interface GetBusinessEmployers200Response {
    /**
     * List of employers.
     * @type {Array<UserBusinessRoleBinding>}
     * @memberof GetBusinessEmployers200Response
     */
    items: Array<UserBusinessRoleBinding>;
    /**
     * 
     * @type {string}
     * @memberof GetBusinessEmployers200Response
     */
    bookmark?: string | null;
}

/**
 * Check if a given object implements the GetBusinessEmployers200Response interface.
 */
export function instanceOfGetBusinessEmployers200Response(value: object): value is GetBusinessEmployers200Response {
    if (!('items' in value) || value['items'] === undefined) return false;
    return true;
}

export function GetBusinessEmployers200ResponseFromJSON(json: any): GetBusinessEmployers200Response {
    return GetBusinessEmployers200ResponseFromJSONTyped(json, false);
}

export function GetBusinessEmployers200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetBusinessEmployers200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'items': ((json['items'] as Array<any>).map(UserBusinessRoleBindingFromJSON)),
        'bookmark': json['bookmark'] == null ? undefined : json['bookmark'],
    };
}

  export function GetBusinessEmployers200ResponseToJSON(json: any): GetBusinessEmployers200Response {
      return GetBusinessEmployers200ResponseToJSONTyped(json, false);
  }

  export function GetBusinessEmployers200ResponseToJSONTyped(value?: GetBusinessEmployers200Response | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'items': ((value['items'] as Array<any>).map(UserBusinessRoleBindingToJSON)),
        'bookmark': value['bookmark'],
    };
}

