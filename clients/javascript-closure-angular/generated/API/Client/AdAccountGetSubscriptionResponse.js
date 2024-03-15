goog.provide('API.Client.AdAccountGetSubscriptionResponse');

/**
 * @record
 */
API.Client.AdAccountGetSubscriptionResponse = function() {}

/**
 * Lead form ID.
 * @type {!string}
 * @export
 */
API.Client.AdAccountGetSubscriptionResponse.prototype.leadFormId;

/**
 * Standard HTTPS webhook URL.
 * @type {!string}
 * @export
 */
API.Client.AdAccountGetSubscriptionResponse.prototype.webhookUrl;

/**
 * Subscription ID.
 * @type {!string}
 * @export
 */
API.Client.AdAccountGetSubscriptionResponse.prototype.id;

/**
 * User account used to subscribe lead data.
 * @type {!string}
 * @export
 */
API.Client.AdAccountGetSubscriptionResponse.prototype.userAccountId;

/**
 * The Ad Account ID that this lead form belongs to.
 * @type {!string}
 * @export
 */
API.Client.AdAccountGetSubscriptionResponse.prototype.adAccountId;

/**
 * API version.
 * @type {!string}
 * @export
 */
API.Client.AdAccountGetSubscriptionResponse.prototype.apiVersion;

/**
 * Base64 encoded key for client to decrypt lead data.
 * @type {!string}
 * @export
 */
API.Client.AdAccountGetSubscriptionResponse.prototype.cryptographicKey;

/**
 * Lead data encryption algorithm.
 * @type {!string}
 * @export
 */
API.Client.AdAccountGetSubscriptionResponse.prototype.cryptographicAlgorithm;

/**
 * Lead form creation time. Unix timestamp in milliseconds.
 * @type {!number}
 * @export
 */
API.Client.AdAccountGetSubscriptionResponse.prototype.createdTime;

