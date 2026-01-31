goog.provide('API.Client.SSIOAccountResponse');

/**
 * @record
 */
API.Client.SSIOAccountResponse = function() {}

/**
 * An array of Salesforce account information that includes address, io terms, etc.
 * @type {!Array<!API.Client.SSIOAccountItem>}
 * @export
 */
API.Client.SSIOAccountResponse.prototype.billtoInfos;

/**
 * Advertiser eligible to update order lines
 * @type {!boolean}
 * @export
 */
API.Client.SSIOAccountResponse.prototype.canEdit;

/**
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountResponse.prototype.currency;

/**
 * Advertiser eligible to create order lines
 * @type {!boolean}
 * @export
 */
API.Client.SSIOAccountResponse.prototype.eligible;

/**
 * Error indicator from Salesforce which could be \"No Error\"
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountResponse.prototype.error;

/**
 * @type {!Array<!API.Client.SSIOAccountPMPName>}
 * @export
 */
API.Client.SSIOAccountResponse.prototype.pmpNames;

