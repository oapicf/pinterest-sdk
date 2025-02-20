/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { AssetGroupBinding } from '../models/AssetGroupBinding';
import { HttpFile } from '../http/http';

/**
* An object containing the permissions a business has on the asset.
*/
export class GetBusinessAssetsResponse {
    /**
    * Unique identifier of a business asset.
    */
    'assetId'?: string;
    /**
    * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
    */
    'assetType'?: string;
    'assetGroupInfo'?: AssetGroupBinding;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "assetId",
            "baseName": "asset_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "assetType",
            "baseName": "asset_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "assetGroupInfo",
            "baseName": "asset_group_info",
            "type": "AssetGroupBinding",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return GetBusinessAssetsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}
