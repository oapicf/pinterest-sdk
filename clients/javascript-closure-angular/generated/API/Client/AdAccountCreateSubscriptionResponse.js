goog.provide('API.Client.AdAccountCreateSubscriptionResponse');

/**
 * @record
 */
API.Client.AdAccountCreateSubscriptionResponse = function() {}

/**
 * The Ad Account ID that this lead form belongs to.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionResponse.prototype.adAccountId;

/**
 * API version.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionResponse.prototype.apiVersion;

/**
 * Subscription creation time. Unix timestamp in milliseconds.
 * @type {!number}
 * @export
 */
API.Client.AdAccountCreateSubscriptionResponse.prototype.createdTime;

/**
 * Lead data encryption algorithm.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionResponse.prototype.cryptographicAlgorithm;

/**
 * Base64 encoded key for client to decrypt lead data.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionResponse.prototype.cryptographicKey;

/**
 * Subscription ID.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionResponse.prototype.id;

/**
 * Lead form ID.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionResponse.prototype.leadFormId;

/**
 * User account used to subscribe lead data.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionResponse.prototype.userAccountId;

/**
 * Standard HTTPS webhook URL.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionResponse.prototype.webhookUrl;

