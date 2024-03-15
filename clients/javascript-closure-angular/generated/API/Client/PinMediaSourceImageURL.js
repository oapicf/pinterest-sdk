goog.provide('API.Client.PinMediaSourceImageURL');

/**
 * Image URL-based media source
 * @record
 */
API.Client.PinMediaSourceImageURL = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImageURL.prototype.sourceType;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImageURL.prototype.url;

/**
 * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 * @type {!boolean}
 * @export
 */
API.Client.PinMediaSourceImageURL.prototype.isStandard;

/** @enum {string} */
API.Client.PinMediaSourceImageURL.SourceTypeEnum = { 
  image_url: 'image_url',
}
