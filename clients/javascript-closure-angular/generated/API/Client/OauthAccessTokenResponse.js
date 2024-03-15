goog.provide('API.Client.OauthAccessTokenResponse');

/**
 * A successful OAuth access token response.
 * @record
 */
API.Client.OauthAccessTokenResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponse.prototype.responseType;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponse.prototype.accessToken;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponse.prototype.tokenType;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessTokenResponse.prototype.expiresIn;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponse.prototype.scope;

/** @enum {string} */
API.Client.OauthAccessTokenResponse.ResponseTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
}
