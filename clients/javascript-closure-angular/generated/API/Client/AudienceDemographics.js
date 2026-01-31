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
 * Country area distribution.
 * @type {!Array<!API.Client.AudienceDemographicValue>}
 * @export
 */
API.Client.AudienceDemographics.prototype.countries;

/**
 * Device usage distribution.
 * @type {!Array<!API.Client.AudienceDemographicValue>}
 * @export
 */
API.Client.AudienceDemographics.prototype.devices;

/**
 * Gender distribution.
 * @type {!Array<!API.Client.AudienceDemographicValue>}
 * @export
 */
API.Client.AudienceDemographics.prototype.genders;

/**
 * Geographic metro area distribution.
 * @type {!Array<!API.Client.AudienceDemographicValue>}
 * @export
 */
API.Client.AudienceDemographics.prototype.metros;

