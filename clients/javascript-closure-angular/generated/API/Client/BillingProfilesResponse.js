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
 * @type {!string}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.billingType;

/**
 * Type of the card.
 * @type {!string}
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
 * @type {!string}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.paymentMethodBrand;

/**
 * Status of the billing.
 * @type {!string}
 * @export
 */
API.Client.BillingProfilesResponse.prototype.status;

/** @enum {string} */
API.Client.BillingProfilesResponse.BillingTypeEnum = { 
  CREDIT_CARD: 'CREDIT_CARD',
  INVOICE: 'INVOICE',
  INTERNAL: 'INTERNAL',
  RECURRING: 'RECURRING',
  PREPAID: 'PREPAID',
}
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
