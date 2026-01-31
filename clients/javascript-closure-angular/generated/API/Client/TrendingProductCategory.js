goog.provide('API.Client.TrendingProductCategory');

/**
 * Trending shopping product category
 * @record
 */
API.Client.TrendingProductCategory = function() {}

/**
 * Engagement type
 * @type {!API.Client.ProductCategoriesEngagementType}
 * @export
 */
API.Client.TrendingProductCategory.prototype.engagementType;

/**
 * Month-over-month change percentage
 * @type {!number}
 * @export
 */
API.Client.TrendingProductCategory.prototype.pctChangeMom;

/**
 * Relative volume percentage
 * @type {!number}
 * @export
 */
API.Client.TrendingProductCategory.prototype.percentRelativeVolume;

/**
 * Product Category Name
 * @type {!string}
 * @export
 */
API.Client.TrendingProductCategory.prototype.productCategory;

/**
 * Vertical name associated with the product category
 * @type {!Array<!API.Client.VerticalProductCategory>}
 * @export
 */
API.Client.TrendingProductCategory.prototype.verticals;

