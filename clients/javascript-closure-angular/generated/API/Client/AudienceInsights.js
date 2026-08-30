goog.provide('API.Client.AudienceInsights');

/**
 * Audience interests and demographics.
 * @record
 */
API.Client.AudienceInsights = function() {}

/**
 * Category interest distribution
 * @type {!Array<!API.Client.AudienceCategory>}
 * @export
 */
API.Client.AudienceInsights.prototype.categories;

/**
 * Generation date
 * @type {!string}
 * @export
 */
API.Client.AudienceInsights.prototype.date;

/**
 * @type {!API.Client.AudienceDemographics}
 * @export
 */
API.Client.AudienceInsights.prototype.demographics;

/**
 * Population count.
 * @type {!number}
 * @export
 */
API.Client.AudienceInsights.prototype.size;

/**
 * Indicates whether the audience size has been rounded up to the next highest upper boundary.
 * @type {!boolean}
 * @export
 */
API.Client.AudienceInsights.prototype.sizeIsUpperBound;

/**
 * @type {!API.Client.AudienceInsightType}
 * @export
 */
API.Client.AudienceInsights.prototype.type;

