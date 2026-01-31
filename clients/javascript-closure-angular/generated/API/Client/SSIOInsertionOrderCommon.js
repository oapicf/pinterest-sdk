goog.provide('API.Client.SSIOInsertionOrderCommon');

/**
 * @record
 */
API.Client.SSIOInsertionOrderCommon = function() {}

/**
 * URL link for agency
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.agencyLink;

/**
 * The billing contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.billingContactEmail;

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
 * If Budget order line, the budget amount.
 * @type {!number}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.budgetAmount;

/**
 * End date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.endDate;

/**
 * The media contact email
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.mediaContactEmail;

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
 * The po number
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.poNumber;

/**
 * Starting date of time period. Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.startDate;

/**
 * The email of user submitting the insertion order
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderCommon.prototype.userEmail;

