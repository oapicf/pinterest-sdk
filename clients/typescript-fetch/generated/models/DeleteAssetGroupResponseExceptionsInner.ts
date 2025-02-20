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
 * @interface DeleteAssetGroupResponseExceptionsInner
 */
export interface DeleteAssetGroupResponseExceptionsInner {
    /**
     * Error code associated with the error deleting asset group.
     * @type {number}
     * @memberof DeleteAssetGroupResponseExceptionsInner
     */
    code?: number;
    /**
     * Error message associated with the error deleting asset group.
     * @type {string}
     * @memberof DeleteAssetGroupResponseExceptionsInner
     */
    message?: string;
    /**
     * Asset group id of the exception.
     * @type {string}
     * @memberof DeleteAssetGroupResponseExceptionsInner
     */
    assetGroupId?: string;
}

/**
 * Check if a given object implements the DeleteAssetGroupResponseExceptionsInner interface.
 */
export function instanceOfDeleteAssetGroupResponseExceptionsInner(value: object): value is DeleteAssetGroupResponseExceptionsInner {
    return true;
}

export function DeleteAssetGroupResponseExceptionsInnerFromJSON(json: any): DeleteAssetGroupResponseExceptionsInner {
    return DeleteAssetGroupResponseExceptionsInnerFromJSONTyped(json, false);
}

export function DeleteAssetGroupResponseExceptionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): DeleteAssetGroupResponseExceptionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'code': json['code'] == null ? undefined : json['code'],
        'message': json['message'] == null ? undefined : json['message'],
        'assetGroupId': json['asset_group_id'] == null ? undefined : json['asset_group_id'],
    };
}

  export function DeleteAssetGroupResponseExceptionsInnerToJSON(json: any): DeleteAssetGroupResponseExceptionsInner {
      return DeleteAssetGroupResponseExceptionsInnerToJSONTyped(json, false);
  }

  export function DeleteAssetGroupResponseExceptionsInnerToJSONTyped(value?: DeleteAssetGroupResponseExceptionsInner | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'code': value['code'],
        'message': value['message'],
        'asset_group_id': value['assetGroupId'],
    };
}

