goog.provide('API.Client.SSIOAccountResponse');

/**
 * @record
 */
API.Client.SSIOAccountResponse = function() {}

/**
 * Advertiser eligible to create order lines
 * @type {!boolean}
 * @export
 */
API.Client.SSIOAccountResponse.prototype.eligible;

/**
 * Advertiser eligible to update order lines
 * @type {!boolean}
 * @export
 */
API.Client.SSIOAccountResponse.prototype.canEdit;

/**
 * An array of Salesforce account information that includes address, io terms, etc.
 * @type {!Array<!API.Client.SSIOAccountItem>}
 * @export
 */
API.Client.SSIOAccountResponse.prototype.billtoInfos;

/**
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountResponse.prototype.currency;

/**
 * @type {!Array<!API.Client.SSIOAccountPMPName>}
 * @export
 */
API.Client.SSIOAccountResponse.prototype.pmpNames;

/**
 * Error indicator from Salesforce which could be \"No Error\"
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountResponse.prototype.error;

