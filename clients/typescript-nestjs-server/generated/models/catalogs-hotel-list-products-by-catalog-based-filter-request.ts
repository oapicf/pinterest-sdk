import { CatalogsHotelProductGroupFilters } from './catalogs-hotel-product-group-filters';


/**
 * Request object to list products for a given hotel catalog_id and product group filter.
 */
export interface CatalogsHotelListProductsByCatalogBasedFilterRequest { 
  /**
   * Catalog ID pertaining to the product group.
   */
  catalog_id: string;
  catalog_type: CatalogsHotelListProductsByCatalogBasedFilterRequest.CatalogTypeEnum;
  filters: CatalogsHotelProductGroupFilters;
}
export namespace CatalogsHotelListProductsByCatalogBasedFilterRequest {
  export const CatalogTypeEnum = {
    Hotel: 'HOTEL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


