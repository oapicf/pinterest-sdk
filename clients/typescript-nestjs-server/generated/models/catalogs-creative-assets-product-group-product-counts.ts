

/**
 * Product counts for a Creative Assets CatalogsProductGroup
 */
export interface CatalogsCreativeAssetsProductGroupProductCounts { 
  app_links: number;
  catalog_type: CatalogsCreativeAssetsProductGroupProductCounts.CatalogTypeEnum;
  images: number;
  total: number;
  videos: number;
}
export namespace CatalogsCreativeAssetsProductGroupProductCounts {
  export const CatalogTypeEnum = {
    CreativeAssets: 'CREATIVE_ASSETS'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


