goog.provide('API.Client.OauthAccessTokenResponseEverlastingRefresh');

/**
 * A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
 * @record
 */
API.Client.OauthAccessTokenResponseEverlastingRefresh = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseEverlastingRefresh.prototype.responseType;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseEverlastingRefresh.prototype.accessToken;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseEverlastingRefresh.prototype.tokenType;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessTokenResponseEverlastingRefresh.prototype.expiresIn;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseEverlastingRefresh.prototype.scope;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseEverlastingRefresh.prototype.refreshToken;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessTokenResponseEverlastingRefresh.prototype.refreshTokenExpiresIn;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessTokenResponseEverlastingRefresh.prototype.refreshTokenExpiresAt;

/** @enum {string} */
API.Client.OauthAccessTokenResponseEverlastingRefresh.ResponseTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
  client_credentials: 'client_credentials',
}
