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
 * Set status to `ARCHIVED` to remove the label from the parent entity.
 * @type {!string}
 * @export
 */
API.Client.LabelBulkUpdateRequest.prototype.status;

/**
 * </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.
 * @type {!string}
 * @export
 */
API.Client.LabelBulkUpdateRequest.prototype.value;

/** @enum {string} */
API.Client.LabelBulkUpdateRequest.StatusEnum = { 
  ARCHIVED: 'ARCHIVED',
}
