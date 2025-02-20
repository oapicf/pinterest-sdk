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
    CatalogsLocale,
    CatalogsProductGroupFiltersRequest,
    Country,
} from './';

/**
 * Request object for creating a product group.
 * @export
 * @interface CatalogsRetailProductGroupCreateRequest
 */
export interface CatalogsRetailProductGroupCreateRequest {
    /**
     * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
     * @type {string}
     * @memberof CatalogsRetailProductGroupCreateRequest
     */
    catalog_type: CatalogsRetailProductGroupCreateRequestCatalogTypeEnum;
    /**
     * @type {string}
     * @memberof CatalogsRetailProductGroupCreateRequest
     */
    name: string;
    /**
     * @type {string}
     * @memberof CatalogsRetailProductGroupCreateRequest
     */
    description?: string | null;
    /**
     * @type {CatalogsProductGroupFiltersRequest}
     * @memberof CatalogsRetailProductGroupCreateRequest
     */
    filters: CatalogsProductGroupFiltersRequest;
    /**
     * Catalog id pertaining to the retail product group.
     * @type {string}
     * @memberof CatalogsRetailProductGroupCreateRequest
     */
    catalog_id: string;
    /**
     * @type {Country}
     * @memberof CatalogsRetailProductGroupCreateRequest
     */
    country: Country;
    /**
     * @type {CatalogsLocale}
     * @memberof CatalogsRetailProductGroupCreateRequest
     */
    locale: CatalogsLocale;
}

/**
 * @export
 * @enum {string}
 */
export enum CatalogsRetailProductGroupCreateRequestCatalogTypeEnum {
    Retail = 'RETAIL'
}

