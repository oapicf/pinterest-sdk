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
 * 
 * @export
 * @interface UpdateAssetGroupResponseExceptionsInner
 */
export interface UpdateAssetGroupResponseExceptionsInner  {
    /**
     * Error code associated with the error editing asset group.
     * @type {number}
     * @memberof UpdateAssetGroupResponseExceptionsInner
     */
    code?: number;
    /**
     * Error message associated with the error editing asset group.
     * @type {string}
     * @memberof UpdateAssetGroupResponseExceptionsInner
     */
    message?: string;
    /**
     * Asset group id of the exception.
     * @type {string}
     * @memberof UpdateAssetGroupResponseExceptionsInner
     */
    assetGroupId?: string;
}

export function UpdateAssetGroupResponseExceptionsInnerFromJSON(json: any): UpdateAssetGroupResponseExceptionsInner {
    return {
        'code': !exists(json, 'code') ? undefined : json['code'],
        'message': !exists(json, 'message') ? undefined : json['message'],
        'assetGroupId': !exists(json, 'asset_group_id') ? undefined : json['asset_group_id'],
    };
}

export function UpdateAssetGroupResponseExceptionsInnerToJSON(value?: UpdateAssetGroupResponseExceptionsInner): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'code': value.code,
        'message': value.message,
        'asset_group_id': value.assetGroupId,
    };
}


