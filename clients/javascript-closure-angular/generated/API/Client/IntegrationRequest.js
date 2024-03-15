goog.provide('API.Client.IntegrationRequest');

/**
 * Schema used for creating the integration metadata.
 * @record
 */
API.Client.IntegrationRequest = function() {}

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
API.Client.IntegrationRequest.prototype.connectedMerchantId;

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
API.Client.IntegrationRequest.prototype.connectedTagId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.partnerAccessToken;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.partnerRefreshToken;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.partnerPrimaryEmail;

/**
 * @type {!number}
 * @export
 */
API.Client.IntegrationRequest.prototype.partnerAccessTokenExpiry;

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

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.additionalId1;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequest.prototype.partnerMetadata;

