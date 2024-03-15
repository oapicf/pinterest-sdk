goog.provide('API.Client.OauthAccessTokenResponseCode');

/**
 * A successful OAuth access token response for the authorization code flow.
 * @record
 */
API.Client.OauthAccessTokenResponseCode = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.responseType;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.accessToken;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.tokenType;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.expiresIn;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.scope;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.refreshToken;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessTokenResponseCode.prototype.refreshTokenExpiresIn;

/** @enum {string} */
API.Client.OauthAccessTokenResponseCode.ResponseTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
}
