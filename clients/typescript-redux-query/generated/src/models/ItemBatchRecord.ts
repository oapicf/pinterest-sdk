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

import {
    ItemCreateBatchRecord,
    ItemCreateBatchRecordFromJSON,
    ItemCreateBatchRecordToJSON,
    ItemDeleteBatchRecord,
    ItemDeleteBatchRecordFromJSON,
    ItemDeleteBatchRecordToJSON,
    ItemDeleteDiscontinuedBatchRecord,
    ItemDeleteDiscontinuedBatchRecordFromJSON,
    ItemDeleteDiscontinuedBatchRecordToJSON,
    ItemUpdateBatchRecord,
    ItemUpdateBatchRecordFromJSON,
    ItemUpdateBatchRecordToJSON,
    ItemUpsertBatchRecord,
    ItemUpsertBatchRecordFromJSON,
    ItemUpsertBatchRecordToJSON,
} from './';

/**
 * @type ItemBatchRecord
 * Object describing an item batch record
 * @export
 */
export type ItemBatchRecord = ItemCreateBatchRecord | ItemDeleteBatchRecord | ItemDeleteDiscontinuedBatchRecord | ItemUpdateBatchRecord | ItemUpsertBatchRecord;

