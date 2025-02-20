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
 * 
 * @export
 * @interface BusinessMemberAssetsSummaryProfilesInner
 */
export interface BusinessMemberAssetsSummaryProfilesInner {
    /**
     * Unique identifier of a business profile.
     * @type {string}
     * @memberof BusinessMemberAssetsSummaryProfilesInner
     */
    id?: string;
    /**
     * Permission levels member or partner has on an asset.
     * @type {Array<string>}
     * @memberof BusinessMemberAssetsSummaryProfilesInner
     */
    permissions?: Array<string>;
}

/**
 * Check if a given object implements the BusinessMemberAssetsSummaryProfilesInner interface.
 */
export function instanceOfBusinessMemberAssetsSummaryProfilesInner(value: object): value is BusinessMemberAssetsSummaryProfilesInner {
    return true;
}

export function BusinessMemberAssetsSummaryProfilesInnerFromJSON(json: any): BusinessMemberAssetsSummaryProfilesInner {
    return BusinessMemberAssetsSummaryProfilesInnerFromJSONTyped(json, false);
}

export function BusinessMemberAssetsSummaryProfilesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BusinessMemberAssetsSummaryProfilesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
        'permissions': json['permissions'] == null ? undefined : json['permissions'],
    };
}

  export function BusinessMemberAssetsSummaryProfilesInnerToJSON(json: any): BusinessMemberAssetsSummaryProfilesInner {
      return BusinessMemberAssetsSummaryProfilesInnerToJSONTyped(json, false);
  }

  export function BusinessMemberAssetsSummaryProfilesInnerToJSONTyped(value?: BusinessMemberAssetsSummaryProfilesInner | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'id': value['id'],
        'permissions': value['permissions'],
    };
}

