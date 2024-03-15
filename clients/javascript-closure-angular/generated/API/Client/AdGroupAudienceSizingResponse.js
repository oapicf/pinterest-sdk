goog.provide('API.Client.AdGroupAudienceSizingResponse');

/**
 * @record
 */
API.Client.AdGroupAudienceSizingResponse = function() {}

/**
 * The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
 * @type {!number}
 * @export
 */
API.Client.AdGroupAudienceSizingResponse.prototype.audienceSizeLowerBound;

/**
 * The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
 * @type {!number}
 * @export
 */
API.Client.AdGroupAudienceSizingResponse.prototype.audienceSizeUpperBound;

