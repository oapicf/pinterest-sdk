goog.provide('API.Client.OauthAccessTokenRequestRefresh');

/**
 * @record
 */
API.Client.OauthAccessTokenRequestRefresh = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenRequestRefresh.prototype.refreshToken;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenRequestRefresh.prototype.scope;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenRequestRefresh.prototype.grantType;

/** @enum {string} */
API.Client.OauthAccessTokenRequestRefresh.GrantTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
  client_credentials: 'client_credentials',
}
