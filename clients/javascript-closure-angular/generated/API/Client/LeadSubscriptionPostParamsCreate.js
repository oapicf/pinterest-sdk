goog.provide('API.Client.LeadSubscriptionPostParamsCreate');

/**
 * @record
 */
API.Client.LeadSubscriptionPostParamsCreate = function() {}

/**
 * Lead form ID.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParamsCreate.prototype.leadFormId;

/**
 * Standard HTTPS webhook URL.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParamsCreate.prototype.webhookUrl;

/**
 * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParamsCreate.prototype.partnerAccessToken;

/**
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 * @type {!API.Client.PartnerMetadata}
 * @export
 */
API.Client.LeadSubscriptionPostParamsCreate.prototype.partnerMetadata;

/**
 * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
 * @type {!string}
 * @export
 */
API.Client.LeadSubscriptionPostParamsCreate.prototype.partnerRefreshToken;

