goog.provide('API.Client.SSIOOrderLine');

/**
 * A Salesforce SSIO order line.
 * @record
 */
API.Client.SSIOOrderLine = function() {}

/**
 * The SFDC id for the terms
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.acceptedTermsId;

/**
 * The UTC timestamp (to the nearest second) when terms were accepted.
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.acceptedTermsTime;

/**
 * Ads manager order line id
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.adsManagerOrderLineId;

/**
 * Agency link
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.agencyLink;

/**
 * Bill-to company name
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.billToCompanyName;

/**
 * Billing contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.billingContactEmail;

/**
 * Billing contact first name
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.billingContactFirstname;

/**
 * Billing contact last name
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.billingContactLastname;

/**
 * If budget order line, the budget amount.
 * @type {!number}
 * @export
 */
API.Client.SSIOOrderLine.prototype.budgetAmount;

/**
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.SSIOOrderLine.prototype.currencyInfo;

/**
 * End date of the order line.
 * @type {!API.Client.date}
 * @export
 */
API.Client.SSIOOrderLine.prototype.endDate;

/**
 * If ongoing (perpetual) order line, the estimated monthly spend.
 * @type {!number}
 * @export
 */
API.Client.SSIOOrderLine.prototype.estimatedMonthlySpend;

/**
 * Last modified date.
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.lastModifiedDateTime;

/**
 * Billing media email
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.mediaContactEmail;

/**
 * Billing media contact first name
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.mediaContactFirstname;

/**
 * Billing media contact last name
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.mediaContactLastname;

/**
 * The order name
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.orderName;

/**
 * The pin order id associated with the order line in SFDC
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.pinOrderId;

/**
 * The Pinterest marketing partner name
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.pmpName;

/**
 * The PO number
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.poNumber;

/**
 * Order line id in SFDC
 * @type {!string}
 * @export
 */
API.Client.SSIOOrderLine.prototype.salesforceOrderLineId;

/**
 * Start date of the order line.
 * @type {!API.Client.date}
 * @export
 */
API.Client.SSIOOrderLine.prototype.startDate;

