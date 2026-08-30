goog.provide('API.Client.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody');

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 * @record
 */
API.Client.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody = function() {}

/**
 * Unique identifier of an audience
 * @type {!string}
 * @export
 */
API.Client.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.prototype.audienceId;

/**
 * @type {!API.Client.OperationType}
 * @export
 */
API.Client.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.prototype.operationType;

/**
 * Ad account IDs to share with or revoke from (request) / that received the audience (response).
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.prototype.recipientAccountIds;

