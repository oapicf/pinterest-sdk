goog.provide('API.Client.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody');

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 * @record
 */
API.Client.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody = function() {}

/**
 * Unique identifier of an audience
 * @type {!string}
 * @export
 */
API.Client.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.prototype.audienceId;

/**
 * @type {!API.Client.OperationType}
 * @export
 */
API.Client.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.prototype.operationType;

/**
 * Business IDs to share with or revoke from (request) / that received the audience (response).
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.prototype.recipientBusinessIds;

