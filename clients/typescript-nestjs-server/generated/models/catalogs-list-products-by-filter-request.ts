import { CatalogsVerticalsListProductsByCatalogBasedFilterRequest } from './catalogs-verticals-list-products-by-catalog-based-filter-request';
import { CatalogsLocale } from './catalogs-locale';
import { CatalogsListProductsByFeedBasedFilter } from './catalogs-list-products-by-feed-based-filter';
import { Country } from './country';
import { CatalogsProductGroupFilters } from './catalogs-product-group-filters';


/**
 * Request object to list products for a given product group filter.
 */
/**
 * @type CatalogsListProductsByFilterRequest
 * Request object to list products for a given product group filter.
 * @export
 */
export type CatalogsListProductsByFilterRequest = CatalogsListProductsByFeedBasedFilter | CatalogsVerticalsListProductsByCatalogBasedFilterRequest;

