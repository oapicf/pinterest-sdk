goog.provide('API.Client.CustomerSegment');

/**
 * @record
 */
API.Client.CustomerSegment = function() {}

/**
 * The ID of the ad account that this customer segment belongs to.
 * @type {!string}
 * @export
 */
API.Client.CustomerSegment.prototype.adAccountId;

/**
 * Audience IDs included in the customer segment.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CustomerSegment.prototype.audienceIds;

/**
 * Customer segment created time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.CustomerSegment.prototype.createdTime;

/**
 * Customer segment ID.
 * @type {!string}
 * @export
 */
API.Client.CustomerSegment.prototype.id;

/**
 * Customer segment name.
 * @type {!string}
 * @export
 */
API.Client.CustomerSegment.prototype.name;

/**
 * Indicates whether the customer segment is active or deleted.
 * @type {!API.Client.TargetingTemplateStatus}
 * @export
 */
API.Client.CustomerSegment.prototype.status;

/**
 * Customer segment updated time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.CustomerSegment.prototype.updatedTime;

