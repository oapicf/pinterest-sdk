goog.provide('API.Client.QualityComponentIssue');

/**
 * Details of an issue with a quality component.
 * @record
 */
API.Client.QualityComponentIssue = function() {}

/**
 * Unique identifier for the issue check.
 * @type {!string}
 * @export
 */
API.Client.QualityComponentIssue.prototype.id;

/**
 * Human-readable name of the issue.
 * @type {!string}
 * @export
 */
API.Client.QualityComponentIssue.prototype.name;

/**
 * Detailed reason for the issue.
 * @type {!string}
 * @export
 */
API.Client.QualityComponentIssue.prototype.reason;

