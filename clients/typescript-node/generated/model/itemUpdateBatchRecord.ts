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
import { UpdatableItemAttributes } from './updatableItemAttributes';
import { UpdateMaskFieldType } from './updateMaskFieldType';

/**
* Object describing an item batch record to update items
*/
export class ItemUpdateBatchRecord {
    /**
    * The catalog item id in the merchant namespace
    */
    'itemId'?: string;
    'attributes'?: UpdatableItemAttributes;
    /**
    * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
    */
    'updateMask'?: Array<UpdateMaskFieldType> | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "itemId",
            "baseName": "item_id",
            "type": "string"
        },
        {
            "name": "attributes",
            "baseName": "attributes",
            "type": "UpdatableItemAttributes"
        },
        {
            "name": "updateMask",
            "baseName": "update_mask",
            "type": "Array<UpdateMaskFieldType>"
        }    ];

    static getAttributeTypeMap() {
        return ItemUpdateBatchRecord.attributeTypeMap;
    }
}

