goog.provide('API.Client.CatalogsCreativeAssetsProductGroup');

/**
 * @record
 */
API.Client.CatalogsCreativeAssetsProductGroup = function() {}

/**
 * Catalog id pertaining to the creative assets product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroup.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroup.prototype.catalogType;

/**
 * Unix timestamp in seconds of when catalog product group was created.
 * @type {!number}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroup.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroup.prototype.description;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroup.prototype.filters;

/**
 * ID of the creative assets product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroup.prototype.id;

/**
 * Name of creative assets product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroup.prototype.name;

/**
 * Unix timestamp in seconds of last time catalog product group was updated.
 * @type {!number}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroup.prototype.updatedAt;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsProductGroup.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
