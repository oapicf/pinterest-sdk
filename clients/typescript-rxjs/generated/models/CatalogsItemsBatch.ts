// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import {
    BatchOperationStatus,
    ItemProcessingRecord,
} from './';

/**
 * Object describing the catalogs items batch
 * @export
 * @interface CatalogsItemsBatch
 */
export interface CatalogsItemsBatch {
    /**
     * Array with the catalogs items processing records part of the catalogs items batch
     * @type {Array<ItemProcessingRecord>}
     * @memberof CatalogsItemsBatch
     */
    items?: Array<ItemProcessingRecord>;
    /**
     * Id of the catalogs items batch
     * @type {string}
     * @memberof CatalogsItemsBatch
     */
    batch_id?: string;
    /**
     * Time of the batch creation: YYYY-MM-DD\'T\'hh:mm:ssTZD
     * @type {string}
     * @memberof CatalogsItemsBatch
     */
    readonly created_time?: string;
    /**
     * Time of the batch completion: YYYY-MM-DD\'T\'hh:mm:ssTZD
     * @type {string}
     * @memberof CatalogsItemsBatch
     */
    readonly completed_time?: string | null;
    /**
     * @type {BatchOperationStatus}
     * @memberof CatalogsItemsBatch
     */
    status?: BatchOperationStatus;
}