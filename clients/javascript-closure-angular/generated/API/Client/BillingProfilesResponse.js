goog.provide('API.Client.BillingProfilesResponse');

/**
 * @record
 */
API.Client.BillingProfilesResponse = function() {}

/**
 * Advertiser ID of the billing.
 * @type {!string}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.advertiserId;

/**
 * Billing type of the advertiser
 * @type {!API.Client.BillingType}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.billingType;

/**
 * Type of the card.
 * @type {!API.Client.BillingProfileCardType}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.cardType;

/**
 * Billing ID.
 * @type {!string}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.id;

/**
 * Brand of the payment method.
 * @type {!API.Client.BillingProfilePaymentMethodBrand}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.paymentMethodBrand;

/**
 * Status of the billing.
 * @type {!API.Client.BillingProfileStatus}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.status;

