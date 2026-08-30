import { CatalogsCreativeAssetsProductGroupFilters } from './catalogs-creative-assets-product-group-filters';


export interface CatalogsCreativeAssetsProductGroup { 
  /**
   * Catalog ID pertaining to the product group.
   */
  catalog_id: string;
  catalog_type: CatalogsCreativeAssetsProductGroup.CatalogTypeEnum;
  /**
   * Unix timestamp in seconds of when catalog product group was created.
   */
  created_at?: number;
  description?: string | null;
  filters: CatalogsCreativeAssetsProductGroupFilters;
  /**
   * ID of the catalog product group.
   */
  id: string;
  /**
   * Name of catalog product group
   */
  name?: string;
  /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   */
  updated_at?: number;
}
export namespace CatalogsCreativeAssetsProductGroup {
  export const CatalogTypeEnum = {
    CreativeAssets: 'CREATIVE_ASSETS'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


