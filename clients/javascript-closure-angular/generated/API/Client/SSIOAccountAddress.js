goog.provide('API.Client.SSIOAccountAddress');

/**
 * @record
 */
API.Client.SSIOAccountAddress = function() {}

/**
 * Salesforce id for address
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountAddress.prototype.addressId;

/**
 * Address display
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountAddress.prototype.display;

/**
 * Legal entity for this insertion order
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountAddress.prototype.orderLegalEntity;

/**
 * Purpose for which the address is used, usually Billing or Businness
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountAddress.prototype.purpose;

