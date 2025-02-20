// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    UpdatableItemAttributes,
    UpdatableItemAttributesFromJSON,
    UpdatableItemAttributesToJSON,
    UpdateMaskFieldType,
    UpdateMaskFieldTypeFromJSON,
    UpdateMaskFieldTypeToJSON,
} from './';

/**
 * Object describing an item batch record to update items
 * @export
 * @interface ItemUpdateBatchRecord
 */
export interface ItemUpdateBatchRecord  {
    /**
     * The catalog item id in the merchant namespace
     * @type {string}
     * @memberof ItemUpdateBatchRecord
     */
    itemId?: string;
    /**
     * 
     * @type {UpdatableItemAttributes}
     * @memberof ItemUpdateBatchRecord
     */
    attributes?: UpdatableItemAttributes;
    /**
     * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
     * @type {Array<UpdateMaskFieldType>}
     * @memberof ItemUpdateBatchRecord
     */
    updateMask?: Array<UpdateMaskFieldType>;
}

export function ItemUpdateBatchRecordFromJSON(json: any): ItemUpdateBatchRecord {
    return {
        'itemId': !exists(json, 'item_id') ? undefined : json['item_id'],
        'attributes': !exists(json, 'attributes') ? undefined : UpdatableItemAttributesFromJSON(json['attributes']),
        'updateMask': !exists(json, 'update_mask') ? undefined : (json['update_mask'] as Array<any>).map(UpdateMaskFieldTypeFromJSON),
    };
}

export function ItemUpdateBatchRecordToJSON(value?: ItemUpdateBatchRecord): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'item_id': value.itemId,
        'attributes': UpdatableItemAttributesToJSON(value.attributes),
        'update_mask': value.updateMask === undefined ? undefined : (value.updateMask as Array<any>).map(UpdateMaskFieldTypeToJSON),
    };
}


