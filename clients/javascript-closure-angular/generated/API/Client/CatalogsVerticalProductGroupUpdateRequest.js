goog.provide('API.Client.CatalogsVerticalProductGroupUpdateRequest');

/**
 * Request object for updating a catalog based product group.
 * @record
 */
API.Client.CatalogsVerticalProductGroupUpdateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupUpdateRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsVerticalProductGroupUpdateRequest.prototype.country;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupUpdateRequest.prototype.description;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsVerticalProductGroupUpdateRequest.prototype.filters;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.CatalogsVerticalProductGroupUpdateRequest.prototype.locale;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupUpdateRequest.prototype.name;

/** @enum {string} */
API.Client.CatalogsVerticalProductGroupUpdateRequest.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
