goog.provide('API.Client.OauthAccessTokenResponseCode');

/**
 * @record
 */
API.Client.OauthAccessTokenResponseCode = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.refreshToken;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.refreshTokenExpiresAt;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.refreshTokenExpiresIn;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.accessToken;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.expiresIn;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.responseType;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.scope;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.tokenType;

/** @enum {string} */
API.Client.OauthAccessTokenResponseCode.ResponseTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
  client_credentials: 'client_credentials',
}
