import { CatalogsCreativeAssetsProductMetadata } from './catalogs-creative-assets-product-metadata';
import { Pin } from './pin';


export interface CatalogsCreativeAssetsProduct { 
  catalog_type: CatalogsCreativeAssetsProduct.CatalogTypeEnum;
  metadata: CatalogsCreativeAssetsProductMetadata;
  pin: Pin;
}
export namespace CatalogsCreativeAssetsProduct {
  export const CatalogTypeEnum = {
    CreativeAssets: 'CREATIVE_ASSETS'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


