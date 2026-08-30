goog.provide('API.Client.LeadSubscriptionPostParams');

/**
 * @record
 */
API.Client.LeadSubscriptionPostParams = function() {}

/**
 * The Ad Account ID that this lead form belongs to.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParams.prototype.adAccountId;

/**
 * API version.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParams.prototype.apiVersion;

/**
 * Subscription creation time. Unix timestamp in milliseconds.
 * @type {!number}
 * @export
 */
API.Client.LeadSubscriptionPostParams.prototype.createdTime;

/**
 * Lead data encryption algorithm.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParams.prototype.cryptographicAlgorithm;

/**
 * Base64 encoded key for client to decrypt lead data.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParams.prototype.cryptographicKey;

/**
 * Subscription ID.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParams.prototype.id;

/**
 * Lead form ID.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParams.prototype.leadFormId;

/**
 * User account used to subscribe lead data.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParams.prototype.userAccountId;

/**
 * Standard HTTPS webhook URL.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParams.prototype.webhookUrl;

/**
 * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParams.prototype.partnerAccessToken;

/**
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 * @type {!API.Client.PartnerMetadata}
 * @export
 */
API.Client.LeadSubscriptionPostParams.prototype.partnerMetadata;

/**
 * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParams.prototype.partnerRefreshToken;

