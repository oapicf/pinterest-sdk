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

import { CatalogsUpdatableCreativeAssetsAttributes } from '../models/CatalogsUpdatableCreativeAssetsAttributes';
import { HttpFile } from '../http/http';

/**
* A creative assets item to be updated.
*/
export class CatalogsUpdateCreativeAssetsItem {
    /**
    * The catalog creative assets item id in the merchant namespace
    */
    'creativeAssetsId': string;
    'operation': CatalogsUpdateCreativeAssetsItemOperationEnum;
    'attributes': CatalogsUpdatableCreativeAssetsAttributes;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "creativeAssetsId",
            "baseName": "creative_assets_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "CatalogsUpdateCreativeAssetsItemOperationEnum",
            "format": ""
        },
        {
            "name": "attributes",
            "baseName": "attributes",
            "type": "CatalogsUpdatableCreativeAssetsAttributes",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CatalogsUpdateCreativeAssetsItem.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum CatalogsUpdateCreativeAssetsItemOperationEnum {
    Update = 'UPDATE'
}

