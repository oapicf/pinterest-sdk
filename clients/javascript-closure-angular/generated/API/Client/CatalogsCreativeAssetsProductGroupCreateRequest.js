goog.provide('API.Client.CatalogsCreativeAssetsProductGroupCreateRequest');

/**
 * Request object for creating a creative assets product group.
 * @record
 */
API.Client.CatalogsCreativeAssetsProductGroupCreateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupCreateRequest.prototype.catalogType;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupCreateRequest.prototype.name;

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
 * Catalog id pertaining to the creative assets product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupCreateRequest.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsProductGroupCreateRequest.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
