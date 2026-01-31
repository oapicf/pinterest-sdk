goog.provide('API.Client.OauthAccessTokenResponseIntegrationRefresh');

/**
 * @record
 */
API.Client.OauthAccessTokenResponseIntegrationRefresh = function() {}

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

/** @enum {string} */
API.Client.OauthAccessTokenResponseIntegrationRefresh.ResponseTypeEnum = { 
  authorization_code: 'authorization_code',
  refresh_token: 'refresh_token',
  client_credentials: 'client_credentials',
}
