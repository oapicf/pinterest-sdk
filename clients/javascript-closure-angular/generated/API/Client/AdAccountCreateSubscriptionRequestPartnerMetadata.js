goog.provide('API.Client.AdAccountCreateSubscriptionRequest_partner_metadata');

/**
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 * @record
 */
API.Client.AdAccountCreateSubscriptionRequestPartnerMetadata = function() {}

/**
 * Text field value that uniquely identifies a subscriber.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateSubscriptionRequestPartnerMetadata.prototype.subscriberKey;

