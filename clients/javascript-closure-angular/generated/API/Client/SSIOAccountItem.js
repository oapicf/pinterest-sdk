goog.provide('API.Client.SSIOAccountItem');

/**
 * Salesforce account item with billing and terms information.
 * @record
 */
API.Client.SSIOAccountItem = function() {}

/**
 * Address information that is associated with this account.
 * @type {!Array<!API.Client.SSIOAccountAddress>}
 * @export
 */
API.Client.SSIOAccountItem.prototype.addresses;

/**
 * Salesforce id for billto_info
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.id;

/**
 * Salesforce text for IO Terms and Conditions
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.ioTerms;

/**
 * Salesforce id for IO Terms and Conditions
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.ioTermsId;

/**
 * Insertion Order Type - Pinterest Paper or Agency Paper
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.ioType;

/**
 * Salesforce text for Rest of the World Terms and Conditions
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.rowTerms;

/**
 * Salesforce id for Rest of the World Terms and Conditions
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.rowTermsId;

/**
 * Salesforce text for US Terms and Conditions
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.usTerms;

/**
 * Salesforce id for US Terms and Conditions
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.usTermsId;

