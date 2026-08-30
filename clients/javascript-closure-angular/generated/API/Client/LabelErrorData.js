goog.provide('API.Client.LabelErrorData');

/**
 * @record
 */
API.Client.LabelErrorData = function() {}

/**
 * Label ID.
 * @type {!string}
 * @export
 */
API.Client.LabelErrorData.prototype.id;

/**
 * @type {!API.Client.NullableLabelType}
 * @export
 */
API.Client.LabelErrorData.prototype.labelType;

/**
 * @type {!API.Client.NullableLabelStatus}
 * @export
 */
API.Client.LabelErrorData.prototype.status;

/**
 * Label name. 100-character limit.
 * @type {!string}
 * @export
 */
API.Client.LabelErrorData.prototype.value;

