goog.provide('API.Client.LabelBulkCreateRequest');

/**
 * @record
 */
API.Client.LabelBulkCreateRequest = function() {}

/**
 * Labels that you are applying to the campaign.
 * @type {!Array<!API.Client.LabelCreateItem>}
 * @export
 */
API.Client.LabelBulkCreateRequest.prototype.labels;

/**
 * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
 * @type {!string}
 * @export
 */
API.Client.LabelBulkCreateRequest.prototype.parentId;

