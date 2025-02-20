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
/**
 * Metadata of the member/partner that has access to the asset.
 * @export
 * @interface BusinessAccessUserSummary
 */
export interface BusinessAccessUserSummary {
    /**
     * Email of the business member/partner.
     * @type {string}
     * @memberof BusinessAccessUserSummary
     */
    email?: string | null;
    /**
     * Unique identifier of the business member/partner.
     * @type {string}
     * @memberof BusinessAccessUserSummary
     */
    id?: string | null;
    /**
     * Username of the business member/partner.
     * @type {string}
     * @memberof BusinessAccessUserSummary
     */
    username?: string | null;
}

/**
 * Check if a given object implements the BusinessAccessUserSummary interface.
 */
export function instanceOfBusinessAccessUserSummary(value: object): value is BusinessAccessUserSummary {
    return true;
}

export function BusinessAccessUserSummaryFromJSON(json: any): BusinessAccessUserSummary {
    return BusinessAccessUserSummaryFromJSONTyped(json, false);
}

export function BusinessAccessUserSummaryFromJSONTyped(json: any, ignoreDiscriminator: boolean): BusinessAccessUserSummary {
    if (json == null) {
        return json;
    }
    return {
        
        'email': json['email'] == null ? undefined : json['email'],
        'id': json['id'] == null ? undefined : json['id'],
        'username': json['username'] == null ? undefined : json['username'],
    };
}

  export function BusinessAccessUserSummaryToJSON(json: any): BusinessAccessUserSummary {
      return BusinessAccessUserSummaryToJSONTyped(json, false);
  }

  export function BusinessAccessUserSummaryToJSONTyped(value?: BusinessAccessUserSummary | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'email': value['email'],
        'id': value['id'],
        'username': value['username'],
    };
}

