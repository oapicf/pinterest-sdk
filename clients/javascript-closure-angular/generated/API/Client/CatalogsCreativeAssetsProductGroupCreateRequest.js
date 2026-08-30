goog.provide('API.Client.CatalogsCreativeAssetsProductGroupCreateRequest');

/**
 * Request object for creating a creative assets product group.
 * @record
 */
API.Client.CatalogsCreativeAssetsProductGroupCreateRequest = function() {}

/**
 * Catalog ID pertaining to the product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupCreateRequest.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupCreateRequest.prototype.catalogType;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupCreateRequest.prototype.description;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupCreateRequest.prototype.filters;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupCreateRequest.prototype.name;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsProductGroupCreateRequest.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
