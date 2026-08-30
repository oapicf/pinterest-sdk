goog.provide('API.Client.LeadsExportsCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.LeadsExportsCreate = function() {}

/**
 * ID for the ad collecting leads.
 * @type {!string}
 * @export
 */
API.Client.LeadsExportsCreate.prototype.adId;

/**
 * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
 * @type {!string}
 * @export
 */
API.Client.LeadsExportsCreate.prototype.endDate;

/**
 * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
 * @type {!string}
 * @export
 */
API.Client.LeadsExportsCreate.prototype.startDate;

