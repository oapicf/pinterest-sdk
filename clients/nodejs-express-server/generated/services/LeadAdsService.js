/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete lead ads subscription
* Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* subscriptionUnderscoreid String Unique identifier of a subscription.
* no response value expected for this operation
* */
const ad_accounts_subscriptions/del_by_id = ({ adUnderscoreaccountUnderscoreid, subscriptionUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        subscriptionUnderscoreid,
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
* Get lead ads subscription
* Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* subscriptionUnderscoreid String Unique identifier of a subscription.
* returns AdAccountGetSubscriptionResponse
* */
const ad_accounts_subscriptions/get_by_id = ({ adUnderscoreaccountUnderscoreid, subscriptionUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        subscriptionUnderscoreid,
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
* Get lead ads subscriptions
* Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns ad_accounts_subscriptions_get_list_200_response
* */
const ad_accounts_subscriptions/get_list = ({ adUnderscoreaccountUnderscoreid, pageUnderscoresize, bookmark }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        pageUnderscoresize,
        bookmark,
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
* Create lead ads subscription
* Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records. - For data security, egress lead data is encrypted with AES-256-GCM.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adAccountCreateSubscriptionRequest AdAccountCreateSubscriptionRequest Subscription to create.
* returns AdAccountCreateSubscriptionResponse
* */
const ad_accounts_subscriptions/post = ({ adUnderscoreaccountUnderscoreid, adAccountCreateSubscriptionRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adAccountCreateSubscriptionRequest,
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
  ad_accounts_subscriptions/del_by_id,
  ad_accounts_subscriptions/get_by_id,
  ad_accounts_subscriptions/get_list,
  ad_accounts_subscriptions/post,
};
