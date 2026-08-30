import { CatalogsProductGroupFilterKeys } from './catalogs-product-group-filter-keys';
import { CatalogsProductGroupFiltersAnyOf } from './catalogs-product-group-filters-any-of';
import { CatalogsProductGroupFiltersAllOf } from './catalogs-product-group-filters-all-of';


/**
 * Object holding a group of filters for a catalog product group
 */
export interface CatalogsProductGroupFilters { 
  any_of: Array<CatalogsProductGroupFilterKeys>;
  all_of: Array<CatalogsProductGroupFilterKeys>;
}

