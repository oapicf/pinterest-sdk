goog.provide('API.Client.AudienceDemographicValue');

/**
 * Demographic detail for a single audience demographic
 * @record
 */
API.Client.AudienceDemographicValue = function() {}

/**
 * Unique key for demographic item
 * @type {!string}
 * @export
 */
API.Client.AudienceDemographicValue.prototype.key;

/**
 * Display name for demographic
 * @type {!string}
 * @export
 */
API.Client.AudienceDemographicValue.prototype.name;

/**
 * Value of demographic item as a percent of total audience
 * @type {!number}
 * @export
 */
API.Client.AudienceDemographicValue.prototype.ratio;

