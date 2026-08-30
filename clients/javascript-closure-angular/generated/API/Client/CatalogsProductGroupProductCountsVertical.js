goog.provide('API.Client.CatalogsProductGroupProductCountsVertical');

/**
 * Product counts for a CatalogsProductGroup
 * @record
 */
API.Client.CatalogsProductGroupProductCountsVertical = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupProductCountsVertical.prototype.catalogType;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupProductCountsVertical.prototype.inStock;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupProductCountsVertical.prototype.outOfStock;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupProductCountsVertical.prototype.preorder;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupProductCountsVertical.prototype.total;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupProductCountsVertical.prototype.videos;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupProductCountsVertical.prototype.appLinks;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupProductCountsVertical.prototype.images;

/** @enum {string} */
API.Client.CatalogsProductGroupProductCountsVertical.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
