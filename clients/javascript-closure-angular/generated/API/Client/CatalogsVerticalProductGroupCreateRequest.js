goog.provide('API.Client.CatalogsVerticalProductGroupCreateRequest');

/**
 * Request object for creating a catalog based product group.
 * @record
 */
API.Client.CatalogsVerticalProductGroupCreateRequest = function() {}

/**
 * Catalog id pertaining to the creative assets product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupCreateRequest.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupCreateRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsVerticalProductGroupCreateRequest.prototype.country;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupCreateRequest.prototype.description;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsVerticalProductGroupCreateRequest.prototype.filters;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.CatalogsVerticalProductGroupCreateRequest.prototype.locale;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupCreateRequest.prototype.name;

/** @enum {string} */
API.Client.CatalogsVerticalProductGroupCreateRequest.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
