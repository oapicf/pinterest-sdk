/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { ItemAttributes } from '../models/ItemAttributes';
import { HttpFile } from '../http/http';

/**
* An item to be upserted
*/
export class CatalogsUpsertRetailItem {
    /**
    * The catalog item id in the merchant namespace
    */
    'itemId': string;
    'operation': CatalogsUpsertRetailItemOperationEnum;
    'attributes': ItemAttributes;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "itemId",
            "baseName": "item_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "CatalogsUpsertRetailItemOperationEnum",
            "format": ""
        },
        {
            "name": "attributes",
            "baseName": "attributes",
            "type": "ItemAttributes",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CatalogsUpsertRetailItem.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum CatalogsUpsertRetailItemOperationEnum {
    Create = 'CREATE',
    Update = 'UPDATE',
    Upsert = 'UPSERT',
    Delete = 'DELETE'
}
