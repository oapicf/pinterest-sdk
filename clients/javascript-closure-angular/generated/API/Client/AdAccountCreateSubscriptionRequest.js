goog.provide('API.Client.AdAccountCreateSubscriptionRequest');

/**
 * @record
 */
API.Client.AdAccountCreateSubscriptionRequest = function() {}

/**
 * Standard HTTPS webhook URL.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionRequest.prototype.webhookUrl;

/**
 * Lead form ID.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionRequest.prototype.leadFormId;

/**
 * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionRequest.prototype.partnerAccessToken;

/**
 * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionRequest.prototype.partnerRefreshToken;

/**
 * @type {!API.Client.AdAccountCreateSubscriptionRequest_partner_metadata}
 * @export
 */
API.Client.AdAccountCreateSubscriptionRequest.prototype.partnerMetadata;

