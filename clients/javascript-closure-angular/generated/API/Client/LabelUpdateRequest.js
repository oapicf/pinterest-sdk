goog.provide('API.Client.LabelUpdateRequest');

/**
 * @record
 */
API.Client.LabelUpdateRequest = function() {}

/**
 * Labels that you are applying to the campaign.
 * @type {!Array<!API.Client.LabelUpdateItem>}
 * @export
 */
API.Client.LabelUpdateRequest.prototype.labels;

