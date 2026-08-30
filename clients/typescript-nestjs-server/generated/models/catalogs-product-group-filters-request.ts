import { CatalogsProductGroupFiltersRequestAnyOfItems1 } from './catalogs-product-group-filters-request-any-of-items1';
import { CatalogsProductGroupFiltersRequestAnyOfItems0 } from './catalogs-product-group-filters-request-any-of-items0';
import { CatalogsProductGroupFilterKeys } from './catalogs-product-group-filter-keys';


/**
 * Object holding a group of filters for request on catalog product group.  This is a distinct schema. It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 */
export interface CatalogsProductGroupFiltersRequest { 
  any_of: Array<CatalogsProductGroupFilterKeys>;
  all_of: Array<CatalogsProductGroupFilterKeys>;
}

