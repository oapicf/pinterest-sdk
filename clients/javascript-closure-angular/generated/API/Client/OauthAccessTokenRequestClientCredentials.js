goog.provide('API.Client.OauthAccessTokenRequestClientCredentials');

/**
 * @record
 */
API.Client.OauthAccessTokenRequestClientCredentials = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenRequestClientCredentials.prototype.scope;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenRequestClientCredentials.prototype.grantType;

/** @enum {string} */
API.Client.OauthAccessTokenRequestClientCredentials.GrantTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
  client_credentials: 'client_credentials',
}
