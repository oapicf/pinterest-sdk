goog.provide('API.Client.BusinessToBusinessSharedAudienceUpdateWithRequiredBody');

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 * @record
 */
API.Client.BusinessToBusinessSharedAudienceUpdateWithRequiredBody = function() {}

/**
 * Unique identifier of an audience
 * @type {!string}
 * @export
 */
API.Client.BusinessToBusinessSharedAudienceUpdateWithRequiredBody.prototype.audienceId;

/**
 * @type {!API.Client.OperationType}
 * @export
 */
API.Client.BusinessToBusinessSharedAudienceUpdateWithRequiredBody.prototype.operationType;

/**
 * Business IDs to share with or revoke from (request) / that received the audience (response).
 * @type {!Array<!string>}
 * @export
 */
API.Client.BusinessToBusinessSharedAudienceUpdateWithRequiredBody.prototype.recipientBusinessIds;

