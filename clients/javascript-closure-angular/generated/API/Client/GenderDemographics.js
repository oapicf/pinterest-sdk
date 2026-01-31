goog.provide('API.Client.GenderDemographics');

/**
 * Gender demographic distribution
 * @record
 */
API.Client.GenderDemographics = function() {}

/**
 * Percentage of female users
 * @type {!number}
 * @export
 */
API.Client.GenderDemographics.prototype.female;

/**
 * Percentage of male users
 * @type {!number}
 * @export
 */
API.Client.GenderDemographics.prototype.male;

/**
 * Percentage of users with unspecified gender
 * @type {!number}
 * @export
 */
API.Client.GenderDemographics.prototype.unspecified;

