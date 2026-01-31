goog.provide('API.Client.SSIOCreateInsertionOrderRequest');

/**
 * @record
 */
API.Client.SSIOCreateInsertionOrderRequest = function() {}

/**
 * URL link for agency
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.agencyLink;

/**
 * The billing contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.billingContactEmail;

/**
 * The billing contact first name
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.billingContactFirstname;

/**
 * The billing contact last name
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.billingContactLastname;

/**
 * If Budget order line, the budget amount.
 * @type {!number}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.budgetAmount;

/**
 * End date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.endDate;

/**
 * The media contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.mediaContactEmail;

/**
 * The media contact first name
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.mediaContactFirstname;

/**
 * The media contact last name
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.mediaContactLastname;

/**
 * The po number
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.poNumber;

/**
 * Starting date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.startDate;

/**
 * The email of user submitting the insertion order
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.userEmail;

/**
 * The SFDC id for the terms
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.acceptedTermsId;

/**
 * The UTC timestamp (to the nearest sec) of when terms were accepted
 * @type {!number}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.acceptedTermsTime;

/**
 * The bill-to billing address id
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.billtoBillingAddressId;

/**
 * The bill-to business address id
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.billtoBusinessAddressId;

/**
 * The bill-to company id
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.billtoCompanyId;

/**
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.currencyInfo;

/**
 * If Ongoing (perpetual) order line, the estimated monthly spend
 * @type {!number}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.estimatedMonthlySpend;

/**
 * Type can be Budget or Perpetual
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.orderLineType;

/**
 * The order name
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.orderName;

/**
 * The pmp id
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.pmpId;

/** @enum {string} */
API.Client.SSIOCreateInsertionOrderRequest.OrderLineTypeEnum = { 
  BUDGET: 'BUDGET',
  PERPETUALS: 'PERPETUALS',
}
