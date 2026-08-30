import { CatalogsHotelFilterValuesMap } from './catalogs-hotel-filter-values-map';


export interface CatalogsHotelAvailableFilterValues { 
  catalog_type: CatalogsHotelAvailableFilterValues.CatalogTypeEnum;
  filter_values: CatalogsHotelFilterValuesMap;
}
export namespace CatalogsHotelAvailableFilterValues {
  export const CatalogTypeEnum = {
    Hotel: 'HOTEL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


