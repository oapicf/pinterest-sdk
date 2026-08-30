goog.provide('API.Client.OauthAccessToken');

/**
 * Describes the valid schema for possible OAuth access token requests.
 * @record
 */
API.Client.OauthAccessToken = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessToken.prototype.accessToken;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessToken.prototype.expiresIn;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessToken.prototype.refreshToken;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessToken.prototype.refreshTokenExpiresAt;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessToken.prototype.refreshTokenExpiresIn;

/**
 * @type {!API.Client.TokenGrantType}
 * @export
 */
API.Client.OauthAccessToken.prototype.responseType;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessToken.prototype.scope;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessToken.prototype.tokenType;

