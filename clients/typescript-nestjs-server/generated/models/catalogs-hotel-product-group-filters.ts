import { CatalogsHotelProductGroupFiltersAllOf } from './catalogs-hotel-product-group-filters-all-of';
import { CatalogsHotelProductGroupFiltersAnyOf } from './catalogs-hotel-product-group-filters-any-of';
import { CatalogsHotelProductGroupFilterKeys } from './catalogs-hotel-product-group-filter-keys';


/**
 * Object holding a group of filters for a hotel product group
 */
export interface CatalogsHotelProductGroupFilters { 
  any_of: Array<CatalogsHotelProductGroupFilterKeys>;
  all_of: Array<CatalogsHotelProductGroupFilterKeys>;
}

