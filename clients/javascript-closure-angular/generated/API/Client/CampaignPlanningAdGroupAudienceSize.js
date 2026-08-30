goog.provide('API.Client.CampaignPlanningAdGroupAudienceSize');

/**
 * Range audience size for an ad group.
 * @record
 */
API.Client.CampaignPlanningAdGroupAudienceSize = function() {}

/**
 * Lower bound of the audience size estimate.
 * @type {!number}
 * @export
 */
API.Client.CampaignPlanningAdGroupAudienceSize.prototype.countLower;

/**
 * Upper bound of the audience size estimate.
 * @type {!number}
 * @export
 */
API.Client.CampaignPlanningAdGroupAudienceSize.prototype.countUpper;

