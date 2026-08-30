goog.provide('API.Client.AdGroupAudienceSizing');

/**
 * @record
 */
API.Client.AdGroupAudienceSizing = function() {}

/**
 * The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
 * @type {!number}
 * @export
 */
API.Client.AdGroupAudienceSizing.prototype.audienceSizeLowerBound;

/**
 * The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
 * @type {!number}
 * @export
 */
API.Client.AdGroupAudienceSizing.prototype.audienceSizeUpperBound;

