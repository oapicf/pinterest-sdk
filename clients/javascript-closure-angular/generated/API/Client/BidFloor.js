goog.provide('API.Client.BidFloor');

/**
 * @record
 */
API.Client.BidFloor = function() {}

/**
 * A list of bid floors in micro currency. For example, [100000, 200000]
 * @type {!Array<!number>}
 * @export
 */
API.Client.BidFloor.prototype.bidFloors;

/**
 * Always the string 'bidfloor'
 * @type {!string}
 * @export
 */
API.Client.BidFloor.prototype.type;

