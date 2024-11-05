goog.provide('API.Client.CatalogsCreativeAssetsProductGroupUpdateRequest');

/**
 * Request object for updating a creative assets product group.
 * @record
 */
API.Client.CatalogsCreativeAssetsProductGroupUpdateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupUpdateRequest.prototype.catalogType;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupUpdateRequest.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupUpdateRequest.prototype.description;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupUpdateRequest.prototype.filters;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsProductGroupUpdateRequest.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
