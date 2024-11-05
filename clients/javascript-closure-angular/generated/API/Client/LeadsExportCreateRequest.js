goog.provide('API.Client.LeadsExportCreateRequest');

/**
 * @record
 */
API.Client.LeadsExportCreateRequest = function() {}

/**
 * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.LeadsExportCreateRequest.prototype.startDate;

/**
 * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.LeadsExportCreateRequest.prototype.endDate;

/**
 * ID for the ad collecting leads
 * @type {!string}
 * @export
 */
API.Client.LeadsExportCreateRequest.prototype.adId;

