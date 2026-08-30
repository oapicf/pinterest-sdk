import { CatalogsHotelProductGroupFilters } from './catalogs-hotel-product-group-filters';
import { CatalogsHotelProductGroupType } from './catalogs-hotel-product-group-type';


export interface CatalogsHotelProductGroup { 
  /**
   * Catalog ID pertaining to the product group.
   */
  catalog_id: string;
  catalog_type: CatalogsHotelProductGroup.CatalogTypeEnum;
  /**
   * Unix timestamp in seconds of when catalog product group was created.
   */
  created_at?: number;
  description?: string | null;
  filters: CatalogsHotelProductGroupFilters;
  /**
   * ID of the catalog product group.
   */
  id: string;
  /**
   * Name of catalog product group
   */
  name?: string;
  type: CatalogsHotelProductGroupType;
  /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   */
  updated_at?: number;
}
export namespace CatalogsHotelProductGroup {
  export const CatalogTypeEnum = {
    Hotel: 'HOTEL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


