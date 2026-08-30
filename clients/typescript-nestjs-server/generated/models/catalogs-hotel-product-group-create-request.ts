import { CatalogsHotelProductGroupFilters } from './catalogs-hotel-product-group-filters';


/**
 * Request object for creating a hotel product group.
 */
export interface CatalogsHotelProductGroupCreateRequest { 
  /**
   * Catalog ID pertaining to the product group.
   */
  catalog_id: string;
  catalog_type: CatalogsHotelProductGroupCreateRequest.CatalogTypeEnum;
  description?: string | null;
  filters: CatalogsHotelProductGroupFilters;
  name: string;
}
export namespace CatalogsHotelProductGroupCreateRequest {
  export const CatalogTypeEnum = {
    Hotel: 'HOTEL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


