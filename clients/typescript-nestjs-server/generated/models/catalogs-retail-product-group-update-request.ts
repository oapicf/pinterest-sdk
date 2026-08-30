import { CatalogsLocale } from './catalogs-locale';
import { Country } from './country';
import { CatalogsProductGroupFiltersRequest } from './catalogs-product-group-filters-request';


/**
 * Request object for updating a retail product group.
 */
export interface CatalogsRetailProductGroupUpdateRequest { 
  /**
   * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
   */
  catalog_type?: CatalogsRetailProductGroupUpdateRequest.CatalogTypeEnum;
  country?: Country;
  description?: string | null;
  filters?: CatalogsProductGroupFiltersRequest;
  locale?: CatalogsLocale;
  /**
   * Name of catalog product group
   */
  name?: string;
}
export namespace CatalogsRetailProductGroupUpdateRequest {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


