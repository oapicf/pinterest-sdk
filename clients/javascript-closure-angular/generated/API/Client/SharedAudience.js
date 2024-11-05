goog.provide('API.Client.SharedAudience');

/**
 * @record
 */
API.Client.SharedAudience = function() {}

/**
 * Unique identifier of an audience
 * @type {!string}
 * @export
 */
API.Client.SharedAudience.prototype.audienceId;

/**
 * @type {!API.Client.OperationType}
 * @export
 */
API.Client.SharedAudience.prototype.operationType;

/**
 * List of ad account IDs to share with or revoke from.
 * @type {!Array<!string>}
 * @export
 */
API.Client.SharedAudience.prototype.recipientAccountIds;

