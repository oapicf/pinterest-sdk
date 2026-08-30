goog.provide('API.Client.ConversionEventResponse');

/**
 * @record
 */
API.Client.ConversionEventResponse = function() {}

/**
 * Id of the ad account.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventResponse.prototype.adAccountId;

/**
 * @type {!API.Client.ConversionTagType}
 * @export
 */
API.Client.ConversionEventResponse.prototype.conversionEvent;

/**
 * Id of the tag.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventResponse.prototype.conversionTagId;

/**
 * Creation date in epoch format.
 * @type {!number}
 * @export
 */
API.Client.ConversionEventResponse.prototype.createdTime;

/**
 * For advertiser-defined events, the reporting event label shown in optimization UIs.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventResponse.prototype.reportingConversionEvent;

