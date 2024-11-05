goog.provide('API.Client.CatalogsCreativeAssetsProductGroupProductCounts');

/**
 * Product counts for a Creative Assets CatalogsProductGroup
 * @record
 */
API.Client.CatalogsCreativeAssetsProductGroupProductCounts = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupProductCounts.prototype.catalogType;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupProductCounts.prototype.total;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductGroupProductCounts.prototype.videos;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsProductGroupProductCounts.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
