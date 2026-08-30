import { CatalogsProductGroupFiltersRequest } from './catalogs-product-group-filters-request';


/**
 * Request object for creating a product group.
 */
export interface CatalogsProductGroupCreateRequest { 
  description?: string | null;
  /**
   * Catalog Feed id pertaining to the catalog product group.
   */
  feed_id: string;
  filters: CatalogsProductGroupFiltersRequest;
  /**
   * boolean indicator of whether the product group is being featured or not
   * @deprecated
   */
  is_featured?: boolean;
  name: string;
}

