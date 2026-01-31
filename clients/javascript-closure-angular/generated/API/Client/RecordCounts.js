goog.provide('API.Client.RecordCounts');

/**
 * Record processing counts
 * @record
 */
API.Client.RecordCounts = function() {}

/**
 * Number of invalid records processed
 * @type {!number}
 * @export
 */
API.Client.RecordCounts.prototype.invalid;

/**
 * Number of records processed
 * @type {!number}
 * @export
 */
API.Client.RecordCounts.prototype.processed;

/**
 * Number of valid records processed
 * @type {!number}
 * @export
 */
API.Client.RecordCounts.prototype.valid;

