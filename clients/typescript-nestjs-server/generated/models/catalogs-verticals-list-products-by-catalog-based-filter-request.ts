import { CatalogsHotelListProductsByCatalogBasedFilterRequest } from './catalogs-hotel-list-products-by-catalog-based-filter-request';
import { CatalogsLocale } from './catalogs-locale';
import { Country } from './country';
import { CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest } from './catalogs-creative-assets-list-products-by-catalog-based-filter-request';
import { CatalogsRetailListProductsByCatalogBasedFilterRequest } from './catalogs-retail-list-products-by-catalog-based-filter-request';
import { CatalogsCreativeAssetsProductGroupFilters } from './catalogs-creative-assets-product-group-filters';


/**
 * Request object to list products for a given catalog_id and product group filter.
 */
/**
 * @type CatalogsVerticalsListProductsByCatalogBasedFilterRequest
 * Request object to list products for a given catalog_id and product group filter.
 * @export
 */
export type CatalogsVerticalsListProductsByCatalogBasedFilterRequest = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest | CatalogsHotelListProductsByCatalogBasedFilterRequest | CatalogsRetailListProductsByCatalogBasedFilterRequest;

