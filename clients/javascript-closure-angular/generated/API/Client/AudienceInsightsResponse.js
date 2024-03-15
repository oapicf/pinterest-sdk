goog.provide('API.Client.AudienceInsightsResponse');

/**
 * Audience interests and demographics.
 * @record
 */
API.Client.AudienceInsightsResponse = function() {}

/**
 * Category interest distribution
 * @type {!Array<!API.Client.AudienceCategory>}
 * @export
 */
API.Client.AudienceInsightsResponse.prototype.categories;

/**
 * @type {!API.Client.AudienceDemographics}
 * @export
 */
API.Client.AudienceInsightsResponse.prototype.demographics;

/**
 * @type {!API.Client.AudienceInsightType}
 * @export
 */
API.Client.AudienceInsightsResponse.prototype.type;

/**
 * Generation date
 * @type {!string}
 * @export
 */
API.Client.AudienceInsightsResponse.prototype.date;

/**
 * Population count.
 * @type {!number}
 * @export
 */
API.Client.AudienceInsightsResponse.prototype.size;

/**
 * Indicates whether the audience size has been rounded up to the next highest upper boundary.
 * @type {!boolean}
 * @export
 */
API.Client.AudienceInsightsResponse.prototype.sizeIsUpperBound;

