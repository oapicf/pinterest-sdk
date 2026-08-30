goog.provide('API.Client.LabelUpdateItem');

/**
 * @record
 */
API.Client.LabelUpdateItem = function() {}

/**
 * Label ID.
 * @type {!string}
 * @export
 */
API.Client.LabelUpdateItem.prototype.id;

/**
 * @type {!API.Client.LabelStatus}
 * @export
 */
API.Client.LabelUpdateItem.prototype.status;

/**
 * Label name. 100-character limit.
 * @type {!string}
 * @export
 */
API.Client.LabelUpdateItem.prototype.value;

