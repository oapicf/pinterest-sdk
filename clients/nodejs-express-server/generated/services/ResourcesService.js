/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get ad accounts countries
* Get Ad Accounts countries
*
* returns ad_account_countries_get_200_response
* */
const ad_account_countries/get = () => new Promise(
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
* Get available metrics' definitions
* Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
*
* reportUnderscoretype ReportType Report type. (optional)
* returns delivery_metrics_get_200_response
* */
const delivery_metrics/get = ({ reportUnderscoretype }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        reportUnderscoretype,
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
* Get interest details
* Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.
*
* interestUnderscoreid String Unique identifier of an interest.
* returns SingleInterestTargetingOption
* */
const interest_targeting_options/get = ({ interestUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        interestUnderscoreid,
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
* Get lead form questions
* Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
*
* no response value expected for this operation
* */
const lead_form_questions/get = () => new Promise(
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
* Get metrics ready state
* Learn whether conversion or non-conversion metrics are finalized and ready to query.
*
* date String Analytics reports request date (UTC). Format: YYYY-MM-DD
* returns BookClosed
* */
const metrics_ready_state/get = ({ date }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        date,
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
* Get targeting options
*     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```
*
* targetingUnderscoretype PublicTargetingType Public targeting type
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* clientUnderscoreid String Client ID (optional)
* oauthUnderscoresignature String Oauth signature (optional)
* timestamp String Timestamp. (optional)
* returns List
* */
const targeting_options/get = ({ targetingUnderscoretype, adUnderscoreaccountUnderscoreid, clientUnderscoreid, oauthUnderscoresignature, timestamp }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetingUnderscoretype,
        adUnderscoreaccountUnderscoreid,
        clientUnderscoreid,
        oauthUnderscoresignature,
        timestamp,
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
  ad_account_countries/get,
  delivery_metrics/get,
  interest_targeting_options/get,
  lead_form_questions/get,
  metrics_ready_state/get,
  targeting_options/get,
};
