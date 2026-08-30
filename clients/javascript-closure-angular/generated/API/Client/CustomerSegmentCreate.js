goog.provide('API.Client.CustomerSegmentCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.CustomerSegmentCreate = function() {}

/**
 * Audience IDs included in the customer segment.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CustomerSegmentCreate.prototype.audienceIds;

/**
 * Customer segment name.
 * @type {!string}
 * @export
 */
API.Client.CustomerSegmentCreate.prototype.name;

