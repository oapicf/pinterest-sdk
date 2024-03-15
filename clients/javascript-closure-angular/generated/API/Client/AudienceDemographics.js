goog.provide('API.Client.AudienceDemographics');

/**
 * Audience demographics
 * @record
 */
API.Client.AudienceDemographics = function() {}

/**
 * Ages distribution.
 * @type {!Array<!API.Client.AudienceDemographicValue>}
 * @export
 */
API.Client.AudienceDemographics.prototype.ages;

/**
 * Gender distribution.
 * @type {!Array<!API.Client.AudienceDemographicValue>}
 * @export
 */
API.Client.AudienceDemographics.prototype.genders;

/**
 * Device usage distribution.
 * @type {!Array<!API.Client.AudienceDemographicValue>}
 * @export
 */
API.Client.AudienceDemographics.prototype.devices;

/**
 * Geographic metro area distribution.
 * @type {!Array<!API.Client.AudienceDemographicValue>}
 * @export
 */
API.Client.AudienceDemographics.prototype.metros;

/**
 * Country area distribution.
 * @type {!Array<!API.Client.AudienceDemographicValue>}
 * @export
 */
API.Client.AudienceDemographics.prototype.countries;

