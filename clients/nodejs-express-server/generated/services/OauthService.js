/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Generate OAuth access token for conversion API
* Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
*
* returns ConversionAccessToken
* */
const oauth/conversion_token = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Generate OAuth access token
* Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
*
* grantUnderscoretype TokenGrantType 
* code String  (optional)
* continuousUnderscorerefresh String   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. (optional)
* redirectUnderscoreuri String  (optional)
* refreshUnderscoretoken String  (optional)
* scope String  (optional)
* returns OauthAccessToken
* */
const oauth/token = ({ grantUnderscoretype, code, continuousUnderscorerefresh, redirectUnderscoreuri, refreshUnderscoretoken, scope }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        grantUnderscoretype,
        code,
        continuousUnderscorerefresh,
        redirectUnderscoreuri,
        refreshUnderscoretoken,
        scope,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Revoke a token
* Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
*
* token String The token to revoke.
* tokenUnderscoretypeUnderscorehint TokenTypeHint The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (optional)
* no response value expected for this operation
* */
const token/revoke = ({ token, tokenUnderscoretypeUnderscorehint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        token,
        tokenUnderscoretypeUnderscorehint,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  oauth/conversion_token,
  oauth/token,
  token/revoke,
};
