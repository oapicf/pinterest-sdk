goog.provide('API.Client.OauthAccessTokenRequestClientCredentials');

/**
 * A request to receive a client token.
 * @record
 */
API.Client.OauthAccessTokenRequestClientCredentials = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenRequestClientCredentials.prototype.grantType;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenRequestClientCredentials.prototype.scope;

/** @enum {string} */
API.Client.OauthAccessTokenRequestClientCredentials.GrantTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
  client_credentials: 'client_credentials',
}
