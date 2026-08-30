import { CatalogsHotelProductGroupFilters } from './catalogs-hotel-product-group-filters';


/**
 * Request object for updating a hotel product group.
 */
export interface CatalogsHotelProductGroupUpdateRequest { 
  catalog_type?: CatalogsHotelProductGroupUpdateRequest.CatalogTypeEnum;
  description?: string | null;
  filters?: CatalogsHotelProductGroupFilters;
  /**
   * Name of catalog product group
   */
  name?: string;
}
export namespace CatalogsHotelProductGroupUpdateRequest {
  export const CatalogTypeEnum = {
    Hotel: 'HOTEL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


