import { CatalogsRetailFilterValuesMap } from './catalogs-retail-filter-values-map';


export interface CatalogsRetailAvailableFilterValues { 
  catalog_type: CatalogsRetailAvailableFilterValues.CatalogTypeEnum;
  filter_values: CatalogsRetailFilterValuesMap;
}
export namespace CatalogsRetailAvailableFilterValues {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


