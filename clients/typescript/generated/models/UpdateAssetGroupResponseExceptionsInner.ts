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

import { HttpFile } from '../http/http';

export class UpdateAssetGroupResponseExceptionsInner {
    /**
    * Error code associated with the error editing asset group.
    */
    'code'?: number;
    /**
    * Error message associated with the error editing asset group.
    */
    'message'?: string;
    /**
    * Asset group id of the exception.
    */
    'assetGroupId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "code",
            "baseName": "code",
            "type": "number",
            "format": ""
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string",
            "format": ""
        },
        {
            "name": "assetGroupId",
            "baseName": "asset_group_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return UpdateAssetGroupResponseExceptionsInner.attributeTypeMap;
    }

    public constructor() {
    }
}
