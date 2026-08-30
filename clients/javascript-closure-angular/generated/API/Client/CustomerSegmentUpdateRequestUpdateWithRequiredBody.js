goog.provide('API.Client.CustomerSegmentUpdateRequestUpdateWithRequiredBody');

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 * @record
 */
API.Client.CustomerSegmentUpdateRequestUpdateWithRequiredBody = function() {}

/**
 * Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CustomerSegmentUpdateRequestUpdateWithRequiredBody.prototype.audienceIds;

/**
 * Customer segment ID.
 * @type {!string}
 * @export
 */
API.Client.CustomerSegmentUpdateRequestUpdateWithRequiredBody.prototype.id;

/**
 * @type {!API.Client.AudienceUpdateOperationType}
 * @export
 */
API.Client.CustomerSegmentUpdateRequestUpdateWithRequiredBody.prototype.operationType;

