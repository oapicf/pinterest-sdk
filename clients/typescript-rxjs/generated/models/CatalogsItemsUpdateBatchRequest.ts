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

import type {
    BatchOperation,
    Country,
    ItemUpdateBatchRecord,
    Language,
} from './';

/**
 * Request object to update catalogs items
 * @export
 * @interface CatalogsItemsUpdateBatchRequest
 */
export interface CatalogsItemsUpdateBatchRequest {
    /**
     * @type {Country}
     * @memberof CatalogsItemsUpdateBatchRequest
     */
    country: Country;
    /**
     * @type {Language}
     * @memberof CatalogsItemsUpdateBatchRequest
     */
    language: Language;
    /**
     * @type {BatchOperation}
     * @memberof CatalogsItemsUpdateBatchRequest
     */
    operation: BatchOperation;
    /**
     * Array with catalogs items
     * @type {Array<ItemUpdateBatchRecord>}
     * @memberof CatalogsItemsUpdateBatchRequest
     */
    items: Array<ItemUpdateBatchRecord>;
}

