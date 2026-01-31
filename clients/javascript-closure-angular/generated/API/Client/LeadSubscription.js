goog.provide('API.Client.LeadSubscription');

/**
 * @record
 */
API.Client.LeadSubscription = function() {}

/**
 * The Ad Account ID that this lead form belongs to.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscription.prototype.adAccountId;

/**
 * API version.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscription.prototype.apiVersion;

/**
 * Subscription creation time. Unix timestamp in milliseconds.
 * @type {!number}
 * @export
 */
API.Client.LeadSubscription.prototype.createdTime;

/**
 * Lead data encryption algorithm.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscription.prototype.cryptographicAlgorithm;

/**
 * Base64 encoded key for client to decrypt lead data.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscription.prototype.cryptographicKey;

/**
 * Subscription ID.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscription.prototype.id;

/**
 * Lead form ID.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscription.prototype.leadFormId;

/**
 * User account used to subscribe lead data.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscription.prototype.userAccountId;

/**
 * Standard HTTPS webhook URL.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscription.prototype.webhookUrl;

