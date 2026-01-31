goog.provide('API.Client.OauthAccessTokenRequestCode');

/**
 * @record
 */
API.Client.OauthAccessTokenRequestCode = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenRequestCode.prototype.code;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenRequestCode.prototype.redirectUri;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenRequestCode.prototype.grantType;

/** @enum {string} */
API.Client.OauthAccessTokenRequestCode.GrantTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
  client_credentials: 'client_credentials',
}
