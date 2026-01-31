goog.provide('API.Client.LabelUpdateRequest_labels_inner');

/**
 * @record
 */
API.Client.LabelUpdateRequestLabelsInner = function() {}

/**
 * Label ID.
 * @type {!string}
 * @export
 */
API.Client.LabelUpdateRequestLabelsInner.prototype.id;

/**
 * @type {!API.Client.LabelStatus}
 * @export
 */
API.Client.LabelUpdateRequestLabelsInner.prototype.status;

/**
 * Label name. 100-character limit.
 * @type {!string}
 * @export
 */
API.Client.LabelUpdateRequestLabelsInner.prototype.value;

