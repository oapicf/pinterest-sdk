goog.provide('API.Client.TargetingTemplateAudienceSizing');

/**
 * Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.
 * @record
 */
API.Client.TargetingTemplateAudienceSizing = function() {}

/**
 * @type {!API.Client.TargetingTemplateAudienceSizingReachEstimate}
 * @export
 */
API.Client.TargetingTemplateAudienceSizing.prototype.reachEstimate;

