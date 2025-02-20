/**
 * Pinterest REST API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CatalogsLocale } from './catalogsLocale';
import { Country } from './country';
import { CatalogsProductGroupFiltersRequest } from './catalogsProductGroupFiltersRequest';


/**
 * Request object for creating a product group.
 */
export interface CatalogsRetailProductGroupCreateRequest { 
    /**
     * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
     */
    catalog_type: CatalogsRetailProductGroupCreateRequest.CatalogTypeEnum;
    name: string;
    description?: string | null;
    filters: CatalogsProductGroupFiltersRequest;
    /**
     * Catalog id pertaining to the retail product group.
     */
    catalog_id: string;
    country: Country;
    locale: CatalogsLocale;
}
export namespace CatalogsRetailProductGroupCreateRequest {
    export type CatalogTypeEnum = 'RETAIL';
    export const CatalogTypeEnum = {
        Retail: 'RETAIL' as CatalogTypeEnum
    };
}


