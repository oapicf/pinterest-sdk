goog.provide('API.Client.SSIOInsertionOrderCommon');

/**
 * @record
 */
API.Client.SSIOInsertionOrderCommon = function() {}

/**
 * Starting date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.startDate;

/**
 * End date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.endDate;

/**
 * The po number
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.poNumber;

/**
 * If Budget order line, the budget amount.
 * @type {!number}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.budgetAmount;

/**
 * The billing contact first name
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.billingContactFirstname;

/**
 * The billing contact last name
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.billingContactLastname;

/**
 * The billing contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.billingContactEmail;

/**
 * The media contact first name
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.mediaContactFirstname;

/**
 * The media contact last name
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.mediaContactLastname;

/**
 * The media contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.mediaContactEmail;

/**
 * URL link for agency
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.agencyLink;

/**
 * The email of user submitting the insertion order
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.userEmail;

