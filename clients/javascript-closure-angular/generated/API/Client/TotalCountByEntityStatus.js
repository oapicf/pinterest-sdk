goog.provide('API.Client.TotalCountByEntityStatus');

/**
 * Breakdown of asset counts by entity status.
 * @record
 */
API.Client.TotalCountByEntityStatus = function() {}

/**
 * Count of ACTIVE assets
 * @type {!number}
 * @export
 */
API.Client.TotalCountByEntityStatus.prototype.ACTIVE;

/**
 * Count of ARCHIVED assets
 * @type {!number}
 * @export
 */
API.Client.TotalCountByEntityStatus.prototype.ARCHIVED;

/**
 * Count of PAUSED assets
 * @type {!number}
 * @export
 */
API.Client.TotalCountByEntityStatus.prototype.PAUSED;

