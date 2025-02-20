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

import type {
    BatchOperation,
    CatalogsItemsRequestLanguage,
    Country,
    ItemDeleteBatchRecord,
} from './';

/**
 * Request object to delete catalogs items
 * @export
 * @interface CatalogsItemsDeleteBatchRequest
 */
export interface CatalogsItemsDeleteBatchRequest {
    /**
     * @type {Country}
     * @memberof CatalogsItemsDeleteBatchRequest
     */
    country: Country;
    /**
     * @type {CatalogsItemsRequestLanguage}
     * @memberof CatalogsItemsDeleteBatchRequest
     */
    language: CatalogsItemsRequestLanguage;
    /**
     * @type {BatchOperation}
     * @memberof CatalogsItemsDeleteBatchRequest
     */
    operation: BatchOperation;
    /**
     * Array with catalogs items
     * @type {Array<ItemDeleteBatchRecord>}
     * @memberof CatalogsItemsDeleteBatchRequest
     */
    items: Array<ItemDeleteBatchRecord>;
}


