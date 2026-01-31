goog.provide('API.Client.IntegrationRequestPatch');

/**
 * Schema used for updating the integration metadata.
 * @record
 */
API.Client.IntegrationRequestPatch = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequestPatch.prototype.additionalId1;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequestPatch.prototype.connectedAdvertiserId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequestPatch.prototype.connectedLbaId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequestPatch.prototype.connectedMerchantId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequestPatch.prototype.connectedTagId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequestPatch.prototype.partnerAccessToken;

/**
 * @type {!number}
 * @export
 */
API.Client.IntegrationRequestPatch.prototype.partnerAccessTokenExpiry;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequestPatch.prototype.partnerMetadata;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequestPatch.prototype.partnerPrimaryEmail;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequestPatch.prototype.partnerRefreshToken;

/**
 * @type {!number}
 * @export
 */
API.Client.IntegrationRequestPatch.prototype.partnerRefreshTokenExpiry;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationRequestPatch.prototype.scopes;

