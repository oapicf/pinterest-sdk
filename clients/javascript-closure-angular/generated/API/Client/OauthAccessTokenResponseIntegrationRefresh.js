goog.provide('API.Client.OauthAccessTokenResponseIntegrationRefresh');

/**
 * A successful OAuth access token response for the refresh token flow, with an added refresh token.
 * @record
 */
API.Client.OauthAccessTokenResponseIntegrationRefresh = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseIntegrationRefresh.prototype.responseType;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseIntegrationRefresh.prototype.accessToken;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseIntegrationRefresh.prototype.tokenType;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessTokenResponseIntegrationRefresh.prototype.expiresIn;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseIntegrationRefresh.prototype.scope;

/**
 * @type {!string}
 * @export
 */
API.Client.OauthAccessTokenResponseIntegrationRefresh.prototype.refreshToken;

/**
 * @type {!number}
 * @export
 */
API.Client.OauthAccessTokenResponseIntegrationRefresh.prototype.refreshTokenExpiresIn;

/** @enum {string} */
API.Client.OauthAccessTokenResponseIntegrationRefresh.ResponseTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
  client_credentials: 'client_credentials',
}
