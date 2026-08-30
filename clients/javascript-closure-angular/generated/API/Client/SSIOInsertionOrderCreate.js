goog.provide('API.Client.SSIOInsertionOrderCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.SSIOInsertionOrderCreate = function() {}

/**
 * The SFDC id for the terms
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.acceptedTermsId;

/**
 * The UTC timestamp (to the nearest sec) of when terms were accepted
 * @type {!number}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.acceptedTermsTime;

/**
 * URL link for agency
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.agencyLink;

/**
 * The billing contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.billingContactEmail;

/**
 * The billing contact first name
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.billingContactFirstname;

/**
 * The billing contact last name
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.billingContactLastname;

/**
 * The bill-to billing address id
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.billtoBillingAddressId;

/**
 * The bill-to business address id
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.billtoBusinessAddressId;

/**
 * The bill-to company id
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.billtoCompanyId;

/**
 * If Budget order line, the budget amount.
 * @type {!number}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.budgetAmount;

/**
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.currencyInfo;

/**
 * End date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.endDate;

/**
 * If Ongoing (perpetual) order line, the estimated monthly spend
 * @type {!number}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.estimatedMonthlySpend;

/**
 * The media contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.mediaContactEmail;

/**
 * The media contact first name
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.mediaContactFirstname;

/**
 * The media contact last name
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.mediaContactLastname;

/**
 * Type can be Budget or Perpetual
 * @type {!API.Client.SSIOOrderLineType}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.orderLineType;

/**
 * The order name
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.orderName;

/**
 * The pmp id
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.pmpId;

/**
 * The po number
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.poNumber;

/**
 * Starting date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.startDate;

/**
 * The email of user submitting the insertion order
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCreate.prototype.userEmail;

