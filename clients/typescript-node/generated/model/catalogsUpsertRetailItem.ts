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
import { ItemAttributesRequest } from './itemAttributesRequest';

/**
* An item to be upserted
*/
export class CatalogsUpsertRetailItem {
    /**
    * The catalog item id in the merchant namespace
    */
    'itemId': string;
    'operation': CatalogsUpsertRetailItem.OperationEnum;
    'attributes': ItemAttributesRequest;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "itemId",
            "baseName": "item_id",
            "type": "string"
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "CatalogsUpsertRetailItem.OperationEnum"
        },
        {
            "name": "attributes",
            "baseName": "attributes",
            "type": "ItemAttributesRequest"
        }    ];

    static getAttributeTypeMap() {
        return CatalogsUpsertRetailItem.attributeTypeMap;
    }
}

export namespace CatalogsUpsertRetailItem {
    export enum OperationEnum {
        Upsert = <any> 'UPSERT'
    }
}
