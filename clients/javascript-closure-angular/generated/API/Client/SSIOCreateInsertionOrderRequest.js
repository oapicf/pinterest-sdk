goog.provide('API.Client.SSIOCreateInsertionOrderRequest');

/**
 * @record
 */
API.Client.SSIOCreateInsertionOrderRequest = function() {}

/**
 * Starting date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.startDate;

/**
 * End date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.endDate;

/**
 * The po number
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.poNumber;

/**
 * If Budget order line, the budget amount.
 * @type {!number}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.budgetAmount;

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
 * The billing contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.billingContactEmail;

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
 * The media contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.mediaContactEmail;

/**
 * URL link for agency
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.agencyLink;

/**
 * The email of user submitting the insertion order
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.userEmail;

/**
 * The UTC timestamp (to the nearest sec) of when terms were accepted
 * @type {!number}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.acceptedTermsTime;

/**
 * The pmp id
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.pmpId;

/**
 * The order name
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.orderName;

/**
 * Type can be Budget or Perpetual
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.orderLineType;

/**
 * The SFDC id for the terms
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.acceptedTermsId;

/**
 * The bill-to company id
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.billtoCompanyId;

/**
 * The bill-to business address id
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.billtoBusinessAddressId;

/**
 * The bill-to billing address id
 * @type {!string}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.billtoBillingAddressId;

/**
 * If Ongoing (perpetual) order line, the estimated monthly spend
 * @type {!number}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.estimatedMonthlySpend;

/**
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.SSIOCreateInsertionOrderRequest.prototype.currencyInfo;

/** @enum {string} */
API.Client.SSIOCreateInsertionOrderRequest.OrderLineTypeEnum = { 
  BUDGET: 'BUDGET',
  PERPETUALS: 'PERPETUALS',
}
