goog.provide('API.Client.SSIOAccountItem');

/**
 * @record
 */
API.Client.SSIOAccountItem = function() {}

/**
 * Salesforce id for billto_info
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.id;

/**
 * Salesforce id for IO Terms and Conditions
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.ioTermsId;

/**
 * Salesforce text for IO Terms and Conditions
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.ioTerms;

/**
 * Salesforce id for US Terms and Conditions
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.usTermsId;

/**
 * Salesforce text for US Terms and Conditions
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.usTerms;

/**
 * Salesforce id for Rest of the World Terms and Conditions
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.rowTermsId;

/**
 * Salesforce text for Rest of the World Terms and Conditions
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.rowTerms;

/**
 * Insertion Order Type - Pinterest Paper or Agency Paper
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountItem.prototype.ioType;

/**
 * Address information that is associated with this account.
 * @type {!Array<!API.Client.SSIOAccountAddress>}
 * @export
 */
API.Client.SSIOAccountItem.prototype.addresses;

