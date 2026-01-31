goog.provide('API.Client.AmazonConnectRequest');

/**
 * Request containing OTP and Amazon storefront info called by Amazon
 * @record
 */
API.Client.AmazonConnectRequest = function() {}

/**
 * The Amazon storefront id
 * @type {!string}
 * @export
 */
API.Client.AmazonConnectRequest.prototype.amazonStorefrontId;

/**
 * The Amazon storefront name
 * @type {!string}
 * @export
 */
API.Client.AmazonConnectRequest.prototype.amazonStorefrontName;

/**
 * The Amazon storefront url
 * @type {!string}
 * @export
 */
API.Client.AmazonConnectRequest.prototype.amazonStorefrontUrl;

/**
 * The Amazon user id
 * @type {!string}
 * @export
 */
API.Client.AmazonConnectRequest.prototype.amazonUserId;

/**
 * The Amazon account linking status
 * @type {!boolean}
 * @export
 */
API.Client.AmazonConnectRequest.prototype.isAmazonAccountLinked;

/**
 * The one time passcode for Pinterest-initiated linking requests
 * @type {!string}
 * @export
 */
API.Client.AmazonConnectRequest.prototype.oneTimePasscode;

/**
 * The Pinterest user id for Amazon-initiated linking requests
 * @type {!string}
 * @export
 */
API.Client.AmazonConnectRequest.prototype.pinterestUserId;

