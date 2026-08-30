goog.provide('API.Client.TrendingTopic');

/**
 * Individual trending topic within an interest category
 * @record
 */
API.Client.TrendingTopic = function() {}

/**
 * Description of the trending topic
 * @type {!string}
 * @export
 */
API.Client.TrendingTopic.prototype.description;

/**
 * Unique identifier for the trending topic
 * @type {!string}
 * @export
 */
API.Client.TrendingTopic.prototype.id;

/**
 * Month-over-month growth percentage
 * @type {!number}
 * @export
 */
API.Client.TrendingTopic.prototype.percentGrowthMom;

/**
 * Array of pin images related to this trend (up to 6)
 * @type {!Array<!API.Client.TrendingPin>}
 * @export
 */
API.Client.TrendingTopic.prototype.pins;

/**
 * List of related interest categories
 * @type {!Array<!string>}
 * @export
 */
API.Client.TrendingTopic.prototype.relatedInterests;

/**
 * List of related search terms
 * @type {!Array<!string>}
 * @export
 */
API.Client.TrendingTopic.prototype.relatedSearches;

/**
 * Time series data showing trend values over time, with dates as keys and values as numeric
 * @type {!Object<!string, number>}
 * @export
 */
API.Client.TrendingTopic.prototype.timeSeries;

/**
 * Title of the trending topic
 * @type {!string}
 * @export
 */
API.Client.TrendingTopic.prototype.title;

