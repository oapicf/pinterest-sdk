goog.provide('API.Client.CatalogsRetailProductGroupProductCounts');

/**
 * Product counts for a Retail CatalogsProductGroup
 * @record
 */
API.Client.CatalogsRetailProductGroupProductCounts = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroupProductCounts.prototype.catalogType;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsRetailProductGroupProductCounts.prototype.inStock;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsRetailProductGroupProductCounts.prototype.outOfStock;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsRetailProductGroupProductCounts.prototype.preorder;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsRetailProductGroupProductCounts.prototype.total;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsRetailProductGroupProductCounts.prototype.videos;

/** @enum {string} */
API.Client.CatalogsRetailProductGroupProductCounts.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
