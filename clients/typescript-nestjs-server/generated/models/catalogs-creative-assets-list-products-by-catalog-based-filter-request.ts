import { CatalogsCreativeAssetsProductGroupFilters } from './catalogs-creative-assets-product-group-filters';


/**
 * Request object to list products for a given creative assets catalog_id and product group filter.
 */
export interface CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest { 
  /**
   * Catalog ID pertaining to the product group.
   */
  catalog_id: string;
  catalog_type: CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.CatalogTypeEnum;
  filters: CatalogsCreativeAssetsProductGroupFilters;
}
export namespace CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest {
  export const CatalogTypeEnum = {
    CreativeAssets: 'CREATIVE_ASSETS'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


