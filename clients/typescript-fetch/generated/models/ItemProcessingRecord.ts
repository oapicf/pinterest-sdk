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
import type { ItemValidationEvent } from './ItemValidationEvent';
import {
    ItemValidationEventFromJSON,
    ItemValidationEventFromJSONTyped,
    ItemValidationEventToJSON,
    ItemValidationEventToJSONTyped,
} from './ItemValidationEvent';
import type { ItemProcessingStatus } from './ItemProcessingStatus';
import {
    ItemProcessingStatusFromJSON,
    ItemProcessingStatusFromJSONTyped,
    ItemProcessingStatusToJSON,
    ItemProcessingStatusToJSONTyped,
} from './ItemProcessingStatus';

/**
 * Object describing an item processing record
 * @export
 * @interface ItemProcessingRecord
 */
export interface ItemProcessingRecord {
    /**
     * The catalog item id in the merchant namespace
     * @type {string}
     * @memberof ItemProcessingRecord
     */
    itemId?: string;
    /**
     * Array with the validation errors for the item processing record.
     * A non empty errors list causes the item processing to fail.
     * @type {Array<ItemValidationEvent>}
     * @memberof ItemProcessingRecord
     */
    errors?: Array<ItemValidationEvent>;
    /**
     * Array with the validation warnings for the item processing record
     * @type {Array<ItemValidationEvent>}
     * @memberof ItemProcessingRecord
     */
    warnings?: Array<ItemValidationEvent>;
    /**
     * 
     * @type {ItemProcessingStatus}
     * @memberof ItemProcessingRecord
     */
    status?: ItemProcessingStatus;
}



/**
 * Check if a given object implements the ItemProcessingRecord interface.
 */
export function instanceOfItemProcessingRecord(value: object): value is ItemProcessingRecord {
    return true;
}

export function ItemProcessingRecordFromJSON(json: any): ItemProcessingRecord {
    return ItemProcessingRecordFromJSONTyped(json, false);
}

export function ItemProcessingRecordFromJSONTyped(json: any, ignoreDiscriminator: boolean): ItemProcessingRecord {
    if (json == null) {
        return json;
    }
    return {
        
        'itemId': json['item_id'] == null ? undefined : json['item_id'],
        'errors': json['errors'] == null ? undefined : ((json['errors'] as Array<any>).map(ItemValidationEventFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(ItemValidationEventFromJSON)),
        'status': json['status'] == null ? undefined : ItemProcessingStatusFromJSON(json['status']),
    };
}

  export function ItemProcessingRecordToJSON(json: any): ItemProcessingRecord {
      return ItemProcessingRecordToJSONTyped(json, false);
  }

  export function ItemProcessingRecordToJSONTyped(value?: ItemProcessingRecord | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'item_id': value['itemId'],
        'errors': value['errors'] == null ? undefined : ((value['errors'] as Array<any>).map(ItemValidationEventToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(ItemValidationEventToJSON)),
        'status': ItemProcessingStatusToJSON(value['status']),
    };
}

