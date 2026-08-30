import { CatalogsCreativeAssetsProductGroupFilterKeys } from './catalogs-creative-assets-product-group-filter-keys';
import { CatalogsCreativeAssetsProductGroupFiltersAnyOf } from './catalogs-creative-assets-product-group-filters-any-of';
import { CatalogsCreativeAssetsProductGroupFiltersAllOf } from './catalogs-creative-assets-product-group-filters-all-of';


/**
 * Object holding a group of filters for a creative assets product group
 */
export interface CatalogsCreativeAssetsProductGroupFilters { 
  any_of: Array<CatalogsCreativeAssetsProductGroupFilterKeys>;
  all_of: Array<CatalogsCreativeAssetsProductGroupFilterKeys>;
}

