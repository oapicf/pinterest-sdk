import { CatalogsLocale } from './catalogs-locale';
import { Country } from './country';
import { CatalogsProductGroupFiltersRequest } from './catalogs-product-group-filters-request';


/**
 * Request object for creating a product group.
 */
export interface CatalogsRetailProductGroupCreateRequest { 
  /**
   * Catalog ID pertaining to the product group.
   */
  catalog_id: string;
  /**
   * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
   */
  catalog_type: CatalogsRetailProductGroupCreateRequest.CatalogTypeEnum;
  country?: Country;
  description?: string | null;
  filters: CatalogsProductGroupFiltersRequest;
  locale?: CatalogsLocale;
  name: string;
}
export namespace CatalogsRetailProductGroupCreateRequest {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


