goog.provide('API.Client.Label');

/**
 * @record
 */
API.Client.Label = function() {}

/**
 * Label ID.
 * @type {!string}
 * @export
 */
API.Client.Label.prototype.id;

/**
 * @type {!API.Client.NullableLabelType}
 * @export
 */
API.Client.Label.prototype.labelType;

/**
 * @type {!API.Client.NullableLabelStatus}
 * @export
 */
API.Client.Label.prototype.status;

/**
 * Label name. 100-character limit.
 * @type {!string}
 * @export
 */
API.Client.Label.prototype.value;

