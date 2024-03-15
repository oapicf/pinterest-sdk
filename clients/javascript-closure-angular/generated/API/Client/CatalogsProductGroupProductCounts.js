goog.provide('API.Client.CatalogsProductGroupProductCounts');

/**
 * Product counts for a CatalogsProductGroup
 * @record
 */
API.Client.CatalogsProductGroupProductCounts = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupProductCounts.prototype.inStock;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupProductCounts.prototype.outOfStock;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupProductCounts.prototype.preorder;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupProductCounts.prototype.total;

