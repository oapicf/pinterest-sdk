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
import { ItemAttributesRequest } from './itemAttributesRequest';
import { ItemCreateBatchRecord } from './itemCreateBatchRecord';
import { ItemDeleteBatchRecord } from './itemDeleteBatchRecord';
import { ItemDeleteDiscontinuedBatchRecord } from './itemDeleteDiscontinuedBatchRecord';
import { ItemUpdateBatchRecord } from './itemUpdateBatchRecord';
import { ItemUpsertBatchRecord } from './itemUpsertBatchRecord';
import { UpdateMaskFieldType } from './updateMaskFieldType';


/**
 * Object describing an item batch record
 */
/**
 * @type ItemBatchRecord
 * Object describing an item batch record
 * @export
 */
export type ItemBatchRecord = ItemCreateBatchRecord | ItemDeleteBatchRecord | ItemDeleteDiscontinuedBatchRecord | ItemUpdateBatchRecord | ItemUpsertBatchRecord;

