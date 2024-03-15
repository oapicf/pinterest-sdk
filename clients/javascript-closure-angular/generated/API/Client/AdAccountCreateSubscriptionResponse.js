goog.provide('API.Client.AdAccountCreateSubscriptionResponse');

/**
 * @record
 */
API.Client.AdAccountCreateSubscriptionResponse = function() {}

/**
 * Subscription ID.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionResponse.prototype.id;

/**
 * Base64 encoded key for client to decrypt lead data.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionResponse.prototype.cryptographicKey;

/**
 * Lead data encryption algorithm.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionResponse.prototype.cryptographicAlgorithm;

/**
 * Subscription creation time. Unix timestamp in milliseconds.
 * @type {!number}
 * @export
 */
API.Client.AdAccountCreateSubscriptionResponse.prototype.createdTime;

