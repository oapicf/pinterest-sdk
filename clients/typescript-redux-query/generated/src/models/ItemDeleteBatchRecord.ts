// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * Object describing an item batch record to delete items
 * @export
 * @interface ItemDeleteBatchRecord
 */
export interface ItemDeleteBatchRecord  {
    /**
     * The catalog item id in the merchant namespace
     * @type {string}
     * @memberof ItemDeleteBatchRecord
     */
    itemId?: string;
}

export function ItemDeleteBatchRecordFromJSON(json: any): ItemDeleteBatchRecord {
    return {
        'itemId': !exists(json, 'item_id') ? undefined : json['item_id'],
    };
}

export function ItemDeleteBatchRecordToJSON(value?: ItemDeleteBatchRecord): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'item_id': value.itemId,
    };
}

