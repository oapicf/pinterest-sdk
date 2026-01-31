goog.provide('API.Client.CampaignBidOptionsUpdate');

/**
 * Object describing an update to the campaign level bid multipliers.
 * @record
 */
API.Client.CampaignBidOptionsUpdate = function() {}

/**
 * @type {!API.Client.AppTypeMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsUpdate.prototype.appTypeMultipliers;

/**
 * @type {!API.Client.CampaignAudienceMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsUpdate.prototype.audienceMultipliers;

/**
 * @type {!API.Client.PlacementMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsUpdate.prototype.placementMultipliers;

/**
 * List of fields to update, only the fields in the list will be updated.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CampaignBidOptionsUpdate.prototype.updateMask;

/** @enum {string} */
API.Client.CampaignBidOptionsUpdate.Array&lt;!UpdateMaskEnum&gt; = { 
  AUDIENCE: 'AUDIENCE',
  APP_TYPE: 'APP_TYPE',
  PLACEMENT: 'PLACEMENT',
  GENDER: 'GENDER',
  AGE_BUCKET: 'AGE_BUCKET',
}
