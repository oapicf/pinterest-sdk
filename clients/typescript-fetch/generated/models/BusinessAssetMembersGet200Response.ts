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
import type { UserSingleAssetBinding } from './UserSingleAssetBinding';
import {
    UserSingleAssetBindingFromJSON,
    UserSingleAssetBindingFromJSONTyped,
    UserSingleAssetBindingToJSON,
    UserSingleAssetBindingToJSONTyped,
} from './UserSingleAssetBinding';

/**
 * 
 * @export
 * @interface BusinessAssetMembersGet200Response
 */
export interface BusinessAssetMembersGet200Response {
    /**
     * List of members with permissions to the asset.
     * @type {Array<UserSingleAssetBinding>}
     * @memberof BusinessAssetMembersGet200Response
     */
    items: Array<UserSingleAssetBinding>;
    /**
     * 
     * @type {string}
     * @memberof BusinessAssetMembersGet200Response
     */
    bookmark?: string | null;
}

/**
 * Check if a given object implements the BusinessAssetMembersGet200Response interface.
 */
export function instanceOfBusinessAssetMembersGet200Response(value: object): value is BusinessAssetMembersGet200Response {
    if (!('items' in value) || value['items'] === undefined) return false;
    return true;
}

export function BusinessAssetMembersGet200ResponseFromJSON(json: any): BusinessAssetMembersGet200Response {
    return BusinessAssetMembersGet200ResponseFromJSONTyped(json, false);
}

export function BusinessAssetMembersGet200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): BusinessAssetMembersGet200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'items': ((json['items'] as Array<any>).map(UserSingleAssetBindingFromJSON)),
        'bookmark': json['bookmark'] == null ? undefined : json['bookmark'],
    };
}

  export function BusinessAssetMembersGet200ResponseToJSON(json: any): BusinessAssetMembersGet200Response {
      return BusinessAssetMembersGet200ResponseToJSONTyped(json, false);
  }

  export function BusinessAssetMembersGet200ResponseToJSONTyped(value?: BusinessAssetMembersGet200Response | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'items': ((value['items'] as Array<any>).map(UserSingleAssetBindingToJSON)),
        'bookmark': value['bookmark'],
    };
}

