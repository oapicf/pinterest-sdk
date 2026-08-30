goog.provide('API.Client.LabelCreateItem');

/**
 * @record
 */
API.Client.LabelCreateItem = function() {}

/**
 * @type {!API.Client.LabelType}
 * @export
 */
API.Client.LabelCreateItem.prototype.labelType;

/**
 * Label name. 100-character limit.
 * @type {!string}
 * @export
 */
API.Client.LabelCreateItem.prototype.value;

