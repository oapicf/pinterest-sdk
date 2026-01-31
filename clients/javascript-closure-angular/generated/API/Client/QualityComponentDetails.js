goog.provide('API.Client.QualityComponentDetails');

/**
 * Metrics for a specific event type within a quality component.
 * @record
 */
API.Client.QualityComponentDetails = function() {}

/**
 * Coverage percentage for this event type.
 * @type {!number}
 * @export
 */
API.Client.QualityComponentDetails.prototype.coverage;

/**
 * List of issues detected for this event type, if any.
 * @type {!Array<!API.Client.QualityComponentIssue>}
 * @export
 */
API.Client.QualityComponentDetails.prototype.issues;

/**
 * Overlap percentage for this event type. Only populated for external_event_id
 * @type {!number}
 * @export
 */
API.Client.QualityComponentDetails.prototype.overlap;

