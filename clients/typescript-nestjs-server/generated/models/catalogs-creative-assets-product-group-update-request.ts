import { CatalogsCreativeAssetsProductGroupFilters } from './catalogs-creative-assets-product-group-filters';


/**
 * Request object for updating a creative assets product group.
 */
export interface CatalogsCreativeAssetsProductGroupUpdateRequest { 
  catalog_type?: CatalogsCreativeAssetsProductGroupUpdateRequest.CatalogTypeEnum;
  description?: string | null;
  filters?: CatalogsCreativeAssetsProductGroupFilters;
  /**
   * Name of catalog product group
   */
  name?: string;
}
export namespace CatalogsCreativeAssetsProductGroupUpdateRequest {
  export const CatalogTypeEnum = {
    CreativeAssets: 'CREATIVE_ASSETS'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


