goog.provide('API.Client.IntegrationRequest');

/**
 * Schema used for creating the integration metadata.
 * @record
 */
API.Client.IntegrationRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.additionalId1;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.connectedAdvertiserId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.connectedLbaId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.connectedMerchantId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.connectedTagId;

/**
 * External business ID for the integration.
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.externalBusinessId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.partnerAccessToken;

/**
 * @type {!number}
 * @export
 */
API.Client.IntegrationRequest.prototype.partnerAccessTokenExpiry;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.partnerMetadata;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.partnerPrimaryEmail;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.partnerRefreshToken;

/**
 * @type {!number}
 * @export
 */
API.Client.IntegrationRequest.prototype.partnerRefreshTokenExpiry;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.scopes;

