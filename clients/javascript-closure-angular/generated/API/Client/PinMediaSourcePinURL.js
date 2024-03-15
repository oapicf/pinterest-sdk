goog.provide('API.Client.PinMediaSourcePinURL');

/**
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 * @record
 */
API.Client.PinMediaSourcePinURL = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourcePinURL.prototype.sourceType;

/**
 * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
 * @type {!boolean}
 * @export
 */
API.Client.PinMediaSourcePinURL.prototype.isAffiliateLink;

/** @enum {string} */
API.Client.PinMediaSourcePinURL.SourceTypeEnum = { 
  pin_url: 'pin_url',
}
