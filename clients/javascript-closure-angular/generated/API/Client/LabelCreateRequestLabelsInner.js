goog.provide('API.Client.LabelCreateRequest_labels_inner');

/**
 * @record
 */
API.Client.LabelCreateRequestLabelsInner = function() {}

/**
 * @type {!API.Client.LabelType}
 * @export
 */
API.Client.LabelCreateRequestLabelsInner.prototype.labelType;

/**
 * Label name. 100-character limit.
 * @type {!string}
 * @export
 */
API.Client.LabelCreateRequestLabelsInner.prototype.value;

