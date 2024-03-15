goog.provide('API.Client.ConversionEventResponse');

/**
 * @record
 */
API.Client.ConversionEventResponse = function() {}

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
 * Id of the ad account.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventResponse.prototype.adAccountId;

/**
 * Creation date in epoch format.
 * @type {!number}
 * @export
 */
API.Client.ConversionEventResponse.prototype.createdTime;

