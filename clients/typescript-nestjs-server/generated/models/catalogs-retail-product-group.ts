import { CatalogsProductGroupStatus } from './catalogs-product-group-status';
import { CatalogsProductGroupType } from './catalogs-product-group-type';
import { CatalogsProductGroupFilters } from './catalogs-product-group-filters';


export interface CatalogsRetailProductGroup { 
  /**
   * Catalog ID pertaining to the product group.
   */
  catalog_id: string;
  catalog_type: CatalogsRetailProductGroup.CatalogTypeEnum;
  country?: string | null;
  /**
   * Unix timestamp in seconds of when catalog product group was created.
   */
  created_at?: number;
  description?: string | null;
  /**
   * id of the catalogs feed belonging to this catalog product group
   */
  feed_id: string | null;
  filters: CatalogsProductGroupFilters;
  /**
   * ID of the catalog product group.
   */
  id: string;
  /**
   * boolean indicator of whether the product group is being featured or not
   * @deprecated
   */
  is_featured?: boolean;
  locale?: string | null;
  /**
   * Name of catalog product group
   */
  name?: string;
  status?: CatalogsProductGroupStatus;
  type: CatalogsProductGroupType;
  /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   */
  updated_at?: number;
}
export namespace CatalogsRetailProductGroup {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


