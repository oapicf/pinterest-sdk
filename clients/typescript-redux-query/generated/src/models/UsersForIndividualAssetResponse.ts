// tslint:disable
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

import { exists, mapValues } from '../runtime';
/**
 * An object containing the permissions a business member has on the asset.
 * @export
 * @interface UsersForIndividualAssetResponse
 */
export interface UsersForIndividualAssetResponse  {
    /**
     * Unique identifier of a business asset.
     * @type {string}
     * @memberof UsersForIndividualAssetResponse
     */
    assetId?: string;
    /**
     * Unique identifier of the business member with asset access.
     * @type {string}
     * @memberof UsersForIndividualAssetResponse
     */
    memberId?: string;
    /**
     * Permission levels member or partner has on an asset.
     * @type {Array<string>}
     * @memberof UsersForIndividualAssetResponse
     */
    permissions?: Array<string>;
}

export function UsersForIndividualAssetResponseFromJSON(json: any): UsersForIndividualAssetResponse {
    return {
        'assetId': !exists(json, 'asset_id') ? undefined : json['asset_id'],
        'memberId': !exists(json, 'member_id') ? undefined : json['member_id'],
        'permissions': !exists(json, 'permissions') ? undefined : json['permissions'],
    };
}

export function UsersForIndividualAssetResponseToJSON(value?: UsersForIndividualAssetResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'asset_id': value.assetId,
        'member_id': value.memberId,
        'permissions': value.permissions,
    };
}


