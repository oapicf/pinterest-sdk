/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Generate OAuth access token
* Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.
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

module.exports = {
  oauth/token,
};
