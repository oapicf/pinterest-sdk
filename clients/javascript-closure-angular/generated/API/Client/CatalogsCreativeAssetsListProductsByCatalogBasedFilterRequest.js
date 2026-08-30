goog.provide('API.Client.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest');

/**
 * Request object to list products for a given creative assets catalog_id and product group filter.
 * @record
 */
API.Client.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest = function() {}

/**
 * Catalog ID pertaining to the product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.prototype.filters;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
