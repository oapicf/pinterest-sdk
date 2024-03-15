goog.provide('API.Client.SSIOAccountAddress');

/**
 * @record
 */
API.Client.SSIOAccountAddress = function() {}

/**
 * Address display
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountAddress.prototype.display;

/**
 * Purpose for which the address is used, usually Billing or Businness
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountAddress.prototype.purpose;

/**
 * Salesforce id for address
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountAddress.prototype.addressId;

/**
 * Legal entity for this insertion order
 * @type {!string}
 * @export
 */
API.Client.SSIOAccountAddress.prototype.orderLegalEntity;

