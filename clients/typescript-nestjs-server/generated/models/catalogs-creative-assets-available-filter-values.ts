import { CatalogsCreativeAssetsFilterValuesMap } from './catalogs-creative-assets-filter-values-map';


export interface CatalogsCreativeAssetsAvailableFilterValues { 
  catalog_type: CatalogsCreativeAssetsAvailableFilterValues.CatalogTypeEnum;
  filter_values: CatalogsCreativeAssetsFilterValuesMap;
}
export namespace CatalogsCreativeAssetsAvailableFilterValues {
  export const CatalogTypeEnum = {
    CreativeAssets: 'CREATIVE_ASSETS'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


