goog.provide('API.Client.BusinessSharedAudience');

/**
 * @record
 */
API.Client.BusinessSharedAudience = function() {}

/**
 * Unique identifier of an audience
 * @type {!string}
 * @export
 */
API.Client.BusinessSharedAudience.prototype.audienceId;

/**
 * @type {!API.Client.OperationType}
 * @export
 */
API.Client.BusinessSharedAudience.prototype.operationType;

/**
 * List of business IDs to share with or revoke from.
 * @type {!Array<!string>}
 * @export
 */
API.Client.BusinessSharedAudience.prototype.recipientBusinessIds;

