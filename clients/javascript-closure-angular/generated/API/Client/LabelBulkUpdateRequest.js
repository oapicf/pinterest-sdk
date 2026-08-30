goog.provide('API.Client.LabelBulkUpdateRequest');

/**
 * @record
 */
API.Client.LabelBulkUpdateRequest = function() {}

/**
 * Label ID.
 * @type {!string}
 * @export
 */
API.Client.LabelBulkUpdateRequest.prototype.id;

/**
 * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
 * @type {!string}
 * @export
 */
API.Client.LabelBulkUpdateRequest.prototype.parentId;

/**
 * @type {!API.Client.LabelStatusBulkUpdate}
 * @export
 */
API.Client.LabelBulkUpdateRequest.prototype.status;

