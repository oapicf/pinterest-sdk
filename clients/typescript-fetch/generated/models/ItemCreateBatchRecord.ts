/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { ItemAttributesRequest } from './ItemAttributesRequest';
import {
    ItemAttributesRequestFromJSON,
    ItemAttributesRequestFromJSONTyped,
    ItemAttributesRequestToJSON,
    ItemAttributesRequestToJSONTyped,
} from './ItemAttributesRequest';

/**
 * Object describing an item batch record to create items
 * @export
 * @interface ItemCreateBatchRecord
 */
export interface ItemCreateBatchRecord {
    /**
     * The catalog item id in the merchant namespace
     * @type {string}
     * @memberof ItemCreateBatchRecord
     */
    itemId?: string;
    /**
     * 
     * @type {ItemAttributesRequest}
     * @memberof ItemCreateBatchRecord
     */
    attributes?: ItemAttributesRequest;
}

/**
 * Check if a given object implements the ItemCreateBatchRecord interface.
 */
export function instanceOfItemCreateBatchRecord(value: object): value is ItemCreateBatchRecord {
    return true;
}

export function ItemCreateBatchRecordFromJSON(json: any): ItemCreateBatchRecord {
    return ItemCreateBatchRecordFromJSONTyped(json, false);
}

export function ItemCreateBatchRecordFromJSONTyped(json: any, ignoreDiscriminator: boolean): ItemCreateBatchRecord {
    if (json == null) {
        return json;
    }
    return {
        
        'itemId': json['item_id'] == null ? undefined : json['item_id'],
        'attributes': json['attributes'] == null ? undefined : ItemAttributesRequestFromJSON(json['attributes']),
    };
}

  export function ItemCreateBatchRecordToJSON(json: any): ItemCreateBatchRecord {
      return ItemCreateBatchRecordToJSONTyped(json, false);
  }

  export function ItemCreateBatchRecordToJSONTyped(value?: ItemCreateBatchRecord | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'item_id': value['itemId'],
        'attributes': ItemAttributesRequestToJSON(value['attributes']),
    };
}

