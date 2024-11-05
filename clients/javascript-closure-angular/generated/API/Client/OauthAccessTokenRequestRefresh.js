goog.provide('API.Client.OauthAccessTokenRequestRefresh');

/**
 * A request to exchange a refresh token for a new access token.
 * @record
 */
API.Client.OauthAccessTokenRequestRefresh = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenRequestRefresh.prototype.grantType;

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
 * Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
 * @type {!boolean}
 * @export
 */
API.Client.OauthAccessTokenRequestRefresh.prototype.refreshOn;

/** @enum {string} */
API.Client.OauthAccessTokenRequestRefresh.GrantTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
  client_credentials: 'client_credentials',
}
