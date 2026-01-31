/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Generate OAuth access token for conversion API
* Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
*
* returns ConversionAccessTokenResponse
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
* Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.
*
* grantUnderscoretype String 
* returns OauthAccessTokenResponse
* */
const oauth/token = ({ grantUnderscoretype }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        grantUnderscoretype,
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
* tokenUnderscoretypeUnderscorehint String The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (optional)
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
