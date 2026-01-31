goog.provide('API.Client.LabelCreateRequest');

/**
 * @record
 */
API.Client.LabelCreateRequest = function() {}

/**
 * Labels that you are applying to the campaign.
 * @type {!Array<!API.Client.LabelCreateRequest_labels_inner>}
 * @export
 */
API.Client.LabelCreateRequest.prototype.labels;

/**
 * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
 * @type {!string}
 * @export
 */
API.Client.LabelCreateRequest.prototype.parentId;

