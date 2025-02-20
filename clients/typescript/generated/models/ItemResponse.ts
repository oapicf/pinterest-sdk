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

import { CatalogsCreativeAssetsAttributes } from '../models/CatalogsCreativeAssetsAttributes';
import { CatalogsType } from '../models/CatalogsType';
import { ItemResponseAnyOf } from '../models/ItemResponseAnyOf';
import { ItemResponseAnyOf1 } from '../models/ItemResponseAnyOf1';
import { ItemValidationEvent } from '../models/ItemValidationEvent';
import { Pin } from '../models/Pin';
import { HttpFile } from '../http/http';

/**
* Object describing an item record
*/
export class ItemResponse {
    'catalogType': CatalogsType;
    /**
    * The catalog item id in the merchant namespace
    */
    'itemId'?: string;
    /**
    * Array with the errors for the item id requested
    */
    'errors'?: Array<ItemValidationEvent>;
    /**
    * The catalog hotel id in the merchant namespace
    */
    'hotelId'?: string;
    /**
    * The catalog creative assets id in the merchant namespace
    */
    'creativeAssetsId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "catalogType",
            "baseName": "catalog_type",
            "type": "CatalogsType",
            "format": ""
        },
        {
            "name": "itemId",
            "baseName": "item_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "errors",
            "baseName": "errors",
            "type": "Array<ItemValidationEvent>",
            "format": ""
        },
        {
            "name": "hotelId",
            "baseName": "hotel_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "creativeAssetsId",
            "baseName": "creative_assets_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ItemResponse.attributeTypeMap;
    }

    public constructor() {
    }
}


