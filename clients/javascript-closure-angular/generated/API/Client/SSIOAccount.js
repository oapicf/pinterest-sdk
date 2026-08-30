goog.provide('API.Client.SSIOAccount');

/**
 * Salesforce account details including bill-to information.
 * @record
 */
API.Client.SSIOAccount = function() {}

/**
 * An array of Salesforce account information that includes address, io terms, etc.
 * @type {!Array<!API.Client.SSIOAccountItem>}
 * @export
 */
API.Client.SSIOAccount.prototype.billtoInfos;

/**
 * Advertiser eligible to update order lines
 * @type {!boolean}
 * @export
 */
API.Client.SSIOAccount.prototype.canEdit;

/**
 * @type {!string}
 * @export
 */
API.Client.SSIOAccount.prototype.currency;

/**
 * Advertiser eligible to create order lines
 * @type {!boolean}
 * @export
 */
API.Client.SSIOAccount.prototype.eligible;

/**
 * Error indicator from Salesforce which could be \"No Error\"
 * @type {!string}
 * @export
 */
API.Client.SSIOAccount.prototype.error;

/**
 * @type {!Array<!API.Client.SSIOAccountPMPName>}
 * @export
 */
API.Client.SSIOAccount.prototype.pmpNames;

