import { CatalogsCreativeAssetsProductGroupFilters } from './catalogs-creative-assets-product-group-filters';


/**
 * Request object for creating a creative assets product group.
 */
export interface CatalogsCreativeAssetsProductGroupCreateRequest { 
  /**
   * Catalog ID pertaining to the product group.
   */
  catalog_id: string;
  catalog_type: CatalogsCreativeAssetsProductGroupCreateRequest.CatalogTypeEnum;
  description?: string | null;
  filters: CatalogsCreativeAssetsProductGroupFilters;
  name: string;
}
export namespace CatalogsCreativeAssetsProductGroupCreateRequest {
  export const CatalogTypeEnum = {
    CreativeAssets: 'CREATIVE_ASSETS'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


