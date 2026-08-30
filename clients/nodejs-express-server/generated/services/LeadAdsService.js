/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete lead ads subscription
* Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* subscriptionUnderscoreid String Unique identifier of a subscription.
* returns LeadSubscription
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
* Get lead ads subscription by ID
* Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* subscriptionUnderscoreid String Unique identifier of a subscription.
* returns LeadSubscription
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
* Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns ad_accounts_subscriptions_get_list_200_response
* */
const ad_accounts_subscriptions/get_list = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bookmark,
        pageUnderscoresize,
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
* Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* leadSubscriptionPostParamsCreate LeadSubscriptionPostParamsCreate 
* returns LeadSubscription
* */
const ad_accounts_subscriptions/post = ({ adUnderscoreaccountUnderscoreid, leadSubscriptionPostParamsCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        leadSubscriptionPostParamsCreate,
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
