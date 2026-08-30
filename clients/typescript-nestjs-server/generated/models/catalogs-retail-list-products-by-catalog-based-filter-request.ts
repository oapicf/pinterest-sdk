import { CatalogsLocale } from './catalogs-locale';
import { Country } from './country';
import { CatalogsProductGroupFilters } from './catalogs-product-group-filters';


/**
 * Request object to list products for a given retail catalog_id and product group filter.
 */
export interface CatalogsRetailListProductsByCatalogBasedFilterRequest { 
  /**
   * Catalog ID pertaining to the product group.
   */
  catalog_id: string;
  /**
   * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
   */
  catalog_type: CatalogsRetailListProductsByCatalogBasedFilterRequest.CatalogTypeEnum;
  country: Country;
  filters: CatalogsProductGroupFilters;
  locale: CatalogsLocale;
}
export namespace CatalogsRetailListProductsByCatalogBasedFilterRequest {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


