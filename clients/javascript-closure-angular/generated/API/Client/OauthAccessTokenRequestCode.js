goog.provide('API.Client.OauthAccessTokenRequestCode');

/**
 * A request to exchange an authorization code for an access token.
 * @record
 */
API.Client.OauthAccessTokenRequestCode = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenRequestCode.prototype.grantType;

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

/** @enum {string} */
API.Client.OauthAccessTokenRequestCode.GrantTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
}
