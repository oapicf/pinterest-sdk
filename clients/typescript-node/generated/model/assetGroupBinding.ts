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

import { RequestFile } from './models';
import { BusinessAccessUserSummary } from './businessAccessUserSummary';

export class AssetGroupBinding {
    /**
    * Asset Group ID.
    */
    'id'?: string;
    /**
    * Asset Group name
    */
    'assetGroupName'?: string | null;
    /**
    * Asset group description
    */
    'assetGroupDescription'?: string | null;
    /**
    * Asset group types
    */
    'assetGroupTypes'?: Array<string>;
    /**
    * A list of ad account IDs under the asset group
    */
    'adAccountsIds'?: Array<string> | null;
    /**
    * A list of profile IDs under asset group
    */
    'profilesIds'?: Array<string> | null;
    /**
    * The creation time of the asset group
    */
    'createdTime'?: number | null;
    /**
    * The last update time of the asset group
    */
    'updatedTime'?: number | null;
    /**
    * The data of the business that owns the asset group.
    */
    'owner'?: BusinessAccessUserSummary | null;
    /**
    * The data of the user that created the asset group.
    */
    'createdBy'?: BusinessAccessUserSummary | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "assetGroupName",
            "baseName": "asset_group_name",
            "type": "string"
        },
        {
            "name": "assetGroupDescription",
            "baseName": "asset_group_description",
            "type": "string"
        },
        {
            "name": "assetGroupTypes",
            "baseName": "asset_group_types",
            "type": "Array<string>"
        },
        {
            "name": "adAccountsIds",
            "baseName": "ad_accounts_ids",
            "type": "Array<string>"
        },
        {
            "name": "profilesIds",
            "baseName": "profiles_ids",
            "type": "Array<string>"
        },
        {
            "name": "createdTime",
            "baseName": "created_time",
            "type": "number"
        },
        {
            "name": "updatedTime",
            "baseName": "updated_time",
            "type": "number"
        },
        {
            "name": "owner",
            "baseName": "owner",
            "type": "BusinessAccessUserSummary"
        },
        {
            "name": "createdBy",
            "baseName": "created_by",
            "type": "BusinessAccessUserSummary"
        }    ];

    static getAttributeTypeMap() {
        return AssetGroupBinding.attributeTypeMap;
    }
}

