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
    CatalogsHotelBatchItem,
    CatalogsItemsRequestLanguage,
    Country,
} from './';

/**
 * Request object to update catalogs hotel items
 * @export
 * @interface CatalogsHotelBatchRequest
 */
export interface CatalogsHotelBatchRequest {
    /**
     * @type {string}
     * @memberof CatalogsHotelBatchRequest
     */
    catalog_type: CatalogsHotelBatchRequestCatalogTypeEnum;
    /**
     * @type {Country}
     * @memberof CatalogsHotelBatchRequest
     */
    country: Country;
    /**
     * @type {CatalogsItemsRequestLanguage}
     * @memberof CatalogsHotelBatchRequest
     */
    language: CatalogsItemsRequestLanguage;
    /**
     * Array with catalogs item operations
     * @type {Array<CatalogsHotelBatchItem>}
     * @memberof CatalogsHotelBatchRequest
     */
    items: Array<CatalogsHotelBatchItem>;
    /**
     * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
     * @type {string}
     * @memberof CatalogsHotelBatchRequest
     */
    catalog_id?: string;
}

/**
 * @export
 * @enum {string}
 */
export enum CatalogsHotelBatchRequestCatalogTypeEnum {
    Hotel = 'HOTEL'
}

