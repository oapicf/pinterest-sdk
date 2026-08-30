goog.provide('API.Client.ConversionDeletionRequestTargets');

/**
 * @record
 */
API.Client.ConversionDeletionRequestTargets = function() {}

/**
 * Array of plain text user emails.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionDeletionRequestTargets.prototype.userEmails;

/**
 * Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionDeletionRequestTargets.prototype.epiks;

