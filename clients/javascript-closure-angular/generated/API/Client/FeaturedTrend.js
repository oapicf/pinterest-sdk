goog.provide('API.Client.FeaturedTrend');

/**
 * Featured trending topics for a specific interest and market
 * @record
 */
API.Client.FeaturedTrend = function() {}

/**
 * The main interest category
 * @type {!API.Client.InterestsEnum}
 * @export
 */
API.Client.FeaturedTrend.prototype.interest;

/**
 * Market code (e.g., 'US', 'UK', etc.)
 * @type {!API.Client.ProductCategoryRegion}
 * @export
 */
API.Client.FeaturedTrend.prototype.market;

/**
 * List of trending topics within this interest category
 * @type {!Array<!API.Client.TrendingTopic>}
 * @export
 */
API.Client.FeaturedTrend.prototype.trends;

