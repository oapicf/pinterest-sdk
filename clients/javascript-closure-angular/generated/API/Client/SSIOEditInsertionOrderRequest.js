goog.provide('API.Client.SSIOEditInsertionOrderRequest');

/**
 * @record
 */
API.Client.SSIOEditInsertionOrderRequest = function() {}

/**
 * Starting date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.startDate;

/**
 * End date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.endDate;

/**
 * The po number
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.poNumber;

/**
 * If Budget order line, the budget amount.
 * @type {!number}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.budgetAmount;

/**
 * The billing contact first name
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.billingContactFirstname;

/**
 * The billing contact last name
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.billingContactLastname;

/**
 * The billing contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.billingContactEmail;

/**
 * The media contact first name
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.mediaContactFirstname;

/**
 * The media contact last name
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.mediaContactLastname;

/**
 * The media contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.mediaContactEmail;

/**
 * URL link for agency
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.agencyLink;

/**
 * The email of user submitting the insertion order
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.userEmail;

/**
 * LineId in the Oracle DB
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.oracleLineId;

/**
 * OrderId in SFDC
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.salesforceOrderId;

/**
 * OrderLineId in SFDC
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.salesforceOrderLineId;

/**
 * Ads manager OrderLineId
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.adsManagerOrderLineId;

