goog.provide('API.Client.ConversionDeletionRequestEPIKTargets');

/**
 * @record
 */
API.Client.ConversionDeletionRequestEPIKTargets = function() {}

/**
 * Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionDeletionRequestEPIKTargets.prototype.epiks;

