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
import type { UpdateAssetGroupBodyAssetGroupsToUpdateInner } from './UpdateAssetGroupBodyAssetGroupsToUpdateInner';
import {
    UpdateAssetGroupBodyAssetGroupsToUpdateInnerFromJSON,
    UpdateAssetGroupBodyAssetGroupsToUpdateInnerFromJSONTyped,
    UpdateAssetGroupBodyAssetGroupsToUpdateInnerToJSON,
    UpdateAssetGroupBodyAssetGroupsToUpdateInnerToJSONTyped,
} from './UpdateAssetGroupBodyAssetGroupsToUpdateInner';

/**
 * 
 * @export
 * @interface UpdateAssetGroupBody
 */
export interface UpdateAssetGroupBody {
    /**
     * A list of asset groups and the data that will be used to update them.
     * @type {Array<UpdateAssetGroupBodyAssetGroupsToUpdateInner>}
     * @memberof UpdateAssetGroupBody
     */
    assetGroupsToUpdate?: Array<UpdateAssetGroupBodyAssetGroupsToUpdateInner>;
}

/**
 * Check if a given object implements the UpdateAssetGroupBody interface.
 */
export function instanceOfUpdateAssetGroupBody(value: object): value is UpdateAssetGroupBody {
    return true;
}

export function UpdateAssetGroupBodyFromJSON(json: any): UpdateAssetGroupBody {
    return UpdateAssetGroupBodyFromJSONTyped(json, false);
}

export function UpdateAssetGroupBodyFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateAssetGroupBody {
    if (json == null) {
        return json;
    }
    return {
        
        'assetGroupsToUpdate': json['asset_groups_to_update'] == null ? undefined : ((json['asset_groups_to_update'] as Array<any>).map(UpdateAssetGroupBodyAssetGroupsToUpdateInnerFromJSON)),
    };
}

  export function UpdateAssetGroupBodyToJSON(json: any): UpdateAssetGroupBody {
      return UpdateAssetGroupBodyToJSONTyped(json, false);
  }

  export function UpdateAssetGroupBodyToJSONTyped(value?: UpdateAssetGroupBody | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'asset_groups_to_update': value['assetGroupsToUpdate'] == null ? undefined : ((value['assetGroupsToUpdate'] as Array<any>).map(UpdateAssetGroupBodyAssetGroupsToUpdateInnerToJSON)),
    };
}

