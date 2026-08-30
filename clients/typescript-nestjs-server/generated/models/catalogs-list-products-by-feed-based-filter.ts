import { CatalogsProductGroupFilters } from './catalogs-product-group-filters';


/**
 * Request object to list products for a given feed_id and product group filter.
 */
export interface CatalogsListProductsByFeedBasedFilter { 
  /**
   * Catalog Feed id pertaining to the catalog product group filter.
   */
  feed_id: string;
  filters: CatalogsProductGroupFilters;
}

