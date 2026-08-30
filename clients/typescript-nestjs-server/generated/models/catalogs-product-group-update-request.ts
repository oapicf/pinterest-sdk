import { CatalogsProductGroupFiltersRequest } from './catalogs-product-group-filters-request';


/**
 * Request object for updating a product group.
 */
export interface CatalogsProductGroupUpdateRequest { 
  description?: string | null;
  filters?: CatalogsProductGroupFiltersRequest;
  /**
   * boolean indicator of whether the product group is being featured or not
   * @deprecated
   */
  is_featured?: boolean;
  name?: string;
}

