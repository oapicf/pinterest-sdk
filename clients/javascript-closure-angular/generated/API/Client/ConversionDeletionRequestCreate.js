goog.provide('API.Client.ConversionDeletionRequestCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.ConversionDeletionRequestCreate = function() {}

/**
 * Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
 * @type {!API.Client.ConversionDeletionRequestTargets}
 * @export
 */
API.Client.ConversionDeletionRequestCreate.prototype.deletionTargets;

