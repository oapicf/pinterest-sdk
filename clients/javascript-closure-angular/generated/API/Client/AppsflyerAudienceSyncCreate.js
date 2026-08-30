goog.provide('API.Client.AppsflyerAudienceSyncCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.AppsflyerAudienceSyncCreate = function() {}

/**
 * The container ID of the audience
 * @type {!string}
 * @export
 */
API.Client.AppsflyerAudienceSyncCreate.prototype.containerId;

/**
 * The pre-signed URL for SHA256 hashed GAID/IDFA file
 * @type {!string}
 * @export
 */
API.Client.AppsflyerAudienceSyncCreate.prototype.urlAdidSha256;

/**
 * The pre-signed URL for SHA256 hashed email file
 * @type {!string}
 * @export
 */
API.Client.AppsflyerAudienceSyncCreate.prototype.urlEmailSha256;

