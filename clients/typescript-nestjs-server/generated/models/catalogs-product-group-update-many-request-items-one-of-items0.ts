import { CatalogsProductGroupFiltersRequest } from './catalogs-product-group-filters-request';


export interface CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 { 
  description?: string | null;
  filters?: CatalogsProductGroupFiltersRequest;
  /**
   * boolean indicator of whether the product group is being featured or not
   * @deprecated
   */
  is_featured?: boolean;
  name?: string;
  /**
   * ID of the product group.
   */
  id: string;
}

