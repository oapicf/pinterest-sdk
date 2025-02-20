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

import { ItemResponse } from '../models/ItemResponse';
import { HttpFile } from '../http/http';

/**
* Response object of catalogs items
*/
export class CatalogsItems {
    /**
    * Array with catalogs items
    */
    'items'?: Array<ItemResponse>;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "items",
            "baseName": "items",
            "type": "Array<ItemResponse>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CatalogsItems.attributeTypeMap;
    }

    public constructor() {
    }
}
