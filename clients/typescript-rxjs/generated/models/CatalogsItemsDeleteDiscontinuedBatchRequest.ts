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
    ItemDeleteDiscontinuedBatchRecord,
} from './';

/**
 * Request object to discontinue catalogs items
 * @export
 * @interface CatalogsItemsDeleteDiscontinuedBatchRequest
 */
export interface CatalogsItemsDeleteDiscontinuedBatchRequest {
    /**
     * @type {Country}
     * @memberof CatalogsItemsDeleteDiscontinuedBatchRequest
     */
    country: Country;
    /**
     * @type {CatalogsItemsRequestLanguage}
     * @memberof CatalogsItemsDeleteDiscontinuedBatchRequest
     */
    language: CatalogsItemsRequestLanguage;
    /**
     * @type {BatchOperation}
     * @memberof CatalogsItemsDeleteDiscontinuedBatchRequest
     */
    operation: BatchOperation;
    /**
     * Array with catalogs items
     * @type {Array<ItemDeleteDiscontinuedBatchRecord>}
     * @memberof CatalogsItemsDeleteDiscontinuedBatchRequest
     */
    items: Array<ItemDeleteDiscontinuedBatchRecord>;
}


