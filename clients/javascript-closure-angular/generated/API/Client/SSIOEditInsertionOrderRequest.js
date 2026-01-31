goog.provide('API.Client.SSIOEditInsertionOrderRequest');

/**
 * @record
 */
API.Client.SSIOEditInsertionOrderRequest = function() {}

/**
 * URL link for agency
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.agencyLink;

/**
 * The billing contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.billingContactEmail;

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
 * If Budget order line, the budget amount.
 * @type {!number}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.budgetAmount;

/**
 * End date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.endDate;

/**
 * The media contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.mediaContactEmail;

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
 * The po number
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.poNumber;

/**
 * Starting date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.startDate;

/**
 * The email of user submitting the insertion order
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.userEmail;

/**
 * Ads manager OrderLineId
 * @type {!string}
 * @export
 */
API.Client.SSIOEditInsertionOrderRequest.prototype.adsManagerOrderLineId;

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

