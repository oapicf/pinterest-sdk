goog.provide('API.Client.IntegrationMetadata');

/**
 * Integration metadata
 * @record
 */
API.Client.IntegrationMetadata = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationMetadata.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationMetadata.prototype.externalBusinessId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationMetadata.prototype.connectedMerchantId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationMetadata.prototype.connectedUserId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationMetadata.prototype.connectedAdvertiserId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationMetadata.prototype.connectedLbaId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationMetadata.prototype.connectedTagId;

/**
 * @type {!number}
 * @export
 */
API.Client.IntegrationMetadata.prototype.partnerAccessTokenExpiry;

/**
 * @type {!number}
 * @export
 */
API.Client.IntegrationMetadata.prototype.partnerRefreshTokenExpiry;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationMetadata.prototype.scopes;

/**
 * @type {!number}
 * @export
 */
API.Client.IntegrationMetadata.prototype.createdTimestamp;

/**
 * @type {!number}
 * @export
 */
API.Client.IntegrationMetadata.prototype.updatedTimestamp;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationMetadata.prototype.additionalId1;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationMetadata.prototype.partnerMetadata;

