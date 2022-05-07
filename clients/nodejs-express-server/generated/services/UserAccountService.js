/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get user account analytics
* Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
*
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD
* fromUnderscoreclaimedUnderscorecontent String Filter on Pins that match your claimed domain. (optional)
* pinUnderscoreformat String Pin formats to get data for, default is all. (optional)
* appUnderscoretypes String Apps or devices to get data for, default is all. (optional)
* metricUnderscoretypes List Metric types to get data for, default is all.  (optional)
* splitUnderscorefield String How to split the data into groups. Not including this param means data won't be split. (optional)
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns Map
* */
const user_account/analytics = ({ startUnderscoredate, endUnderscoredate, fromUnderscoreclaimedUnderscorecontent, pinUnderscoreformat, appUnderscoretypes, metricUnderscoretypes, splitUnderscorefield, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoredate,
        endUnderscoredate,
        fromUnderscoreclaimedUnderscorecontent,
        pinUnderscoreformat,
        appUnderscoretypes,
        metricUnderscoretypes,
        splitUnderscorefield,
        adUnderscoreaccountUnderscoreid,
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
* Get user account
* Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns Account
* */
const user_account/get = ({ adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
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
  user_account/analytics,
  user_account/get,
};
