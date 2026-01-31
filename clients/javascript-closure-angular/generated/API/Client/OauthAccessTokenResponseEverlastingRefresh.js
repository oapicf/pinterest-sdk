goog.provide('API.Client.OauthAccessTokenResponseEverlastingRefresh');

/**
 * @record
 */
API.Client.OauthAccessTokenResponseEverlastingRefresh = function() {}

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

/** @enum {string} */
API.Client.OauthAccessTokenResponseEverlastingRefresh.ResponseTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
  client_credentials: 'client_credentials',
}
