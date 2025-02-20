/**
 * Pinterest REST API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CatalogsHotelProductGroupFilters } from './catalogsHotelProductGroupFilters';


/**
 * Request object to list products for a given hotel catalog_id and product group filter.
 */
export interface CatalogsHotelListProductsByCatalogBasedFilterRequest { 
    catalog_type: CatalogsHotelListProductsByCatalogBasedFilterRequest.CatalogTypeEnum;
    /**
     * Catalog id pertaining to the hotel product group.
     */
    catalog_id: string;
    filters: CatalogsHotelProductGroupFilters;
}
export namespace CatalogsHotelListProductsByCatalogBasedFilterRequest {
    export type CatalogTypeEnum = 'HOTEL';
    export const CatalogTypeEnum = {
        Hotel: 'HOTEL' as CatalogTypeEnum
    };
}


