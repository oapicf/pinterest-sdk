goog.provide('API.Client.OauthAccessTokenResponseRefresh');

/**
 * A successful OAuth access token response for the refresh token flow.
 * @record
 */
API.Client.OauthAccessTokenResponseRefresh = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseRefresh.prototype.responseType;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseRefresh.prototype.accessToken;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseRefresh.prototype.tokenType;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessTokenResponseRefresh.prototype.expiresIn;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseRefresh.prototype.scope;

/** @enum {string} */
API.Client.OauthAccessTokenResponseRefresh.ResponseTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
}
