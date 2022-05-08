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

import * as models from './models';

/**
 * Request object of catalogs items batch
 */
export interface CatalogsItemsBatchRequest {
    country?: models.Country;

    language?: models.Language;

    operation?: models.BatchOperation;

    /**
     * Array with catalogs items
     */
    items?: Array<models.ItemBatchRecord>;

}