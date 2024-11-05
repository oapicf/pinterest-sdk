goog.provide('API.Client.OauthAccessTokenResponseClientCredentials');

/**
 * A successful OAuth client token response for the client token flow.
 * @record
 */
API.Client.OauthAccessTokenResponseClientCredentials = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseClientCredentials.prototype.responseType;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseClientCredentials.prototype.accessToken;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseClientCredentials.prototype.tokenType;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessTokenResponseClientCredentials.prototype.expiresIn;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseClientCredentials.prototype.scope;

/** @enum {string} */
API.Client.OauthAccessTokenResponseClientCredentials.ResponseTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
  client_credentials: 'client_credentials',
}
