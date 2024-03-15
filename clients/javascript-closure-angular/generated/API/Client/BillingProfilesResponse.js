goog.provide('API.Client.BillingProfilesResponse');

/**
 * @record
 */
API.Client.BillingProfilesResponse = function() {}

/**
 * Billing ID.
 * @type {!string}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.id;

/**
 * Type of the card.
 * @type {!string}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.cardType;

/**
 * Status of the billing.
 * @type {!string}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.status;

/**
 * Advertiser ID of the billing.
 * @type {!string}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.advertiserId;

/**
 * Brand of the payment method.
 * @type {!string}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.paymentMethodBrand;

/** @enum {string} */
API.Client.BillingProfilesResponse.CardTypeEnum = { 
  UNKNOWN: 'UNKNOWN',
  VISA: 'VISA',
  MASTERCARD: 'MASTERCARD',
  AMERICAN_EXPRESS: 'AMERICAN_EXPRESS',
  DISCOVER: 'DISCOVER',
  ELO: 'ELO',
}
/** @enum {string} */
API.Client.BillingProfilesResponse.StatusEnum = { 
  UNSPECIFIED: 'UNSPECIFIED',
  VALID: 'VALID',
  INVALID: 'INVALID',
  PENDING: 'PENDING',
  DELETED: 'DELETED',
  SECONDARY: 'SECONDARY',
  PENDING_SECONDARY: 'PENDING_SECONDARY',
}
/** @enum {string} */
API.Client.BillingProfilesResponse.PaymentMethodBrandEnum = { 
  UNKNOWN: 'UNKNOWN',
  VISA: 'VISA',
  MASTERCARD: 'MASTERCARD',
  AMERICAN_EXPRESS: 'AMERICAN_EXPRESS',
  DISCOVER: 'DISCOVER',
  SOFORT: 'SOFORT',
  DINERS_CLUB: 'DINERS_CLUB',
  ELO: 'ELO',
  CARTE_BANCAIRE: 'CARTE_BANCAIRE',
}
