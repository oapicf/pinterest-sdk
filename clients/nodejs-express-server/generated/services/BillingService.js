/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Redeem ad credits
* Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adsCreditRedeemRequest AdsCreditRedeemRequest Redeem ad credits request.
* returns AdsCreditRedeemResponse
* */
const ads_credit/redeem = ({ adUnderscoreaccountUnderscoreid, adsCreditRedeemRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adsCreditRedeemRequest,
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
* Get ads credit discounts
* Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* returns ads_credits_discounts_get_200_response
* */
const ads_credits_discounts/get = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
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
* Get billing profiles
* Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* isUnderscoreactive Boolean Return active billing profiles, if false return all billing profiles.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* returns billing_profiles_get_200_response
* */
const billing_profiles/get = ({ adUnderscoreaccountUnderscoreid, isUnderscoreactive, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        isUnderscoreactive,
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
* Get Salesforce account details including bill-to information.
* Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns SSIOAccountResponse
* */
const ssio_accounts/get = ({ adUnderscoreaccountUnderscoreid }) => new Promise(
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
/**
* Create insertion order through SSIO.
* Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* sSIOCreateInsertionOrderRequest SSIOCreateInsertionOrderRequest Order line to create.
* returns SSIOCreateInsertionOrderResponse
* */
const ssio_insertion_order/create = ({ adUnderscoreaccountUnderscoreid, sSIOCreateInsertionOrderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        sSIOCreateInsertionOrderRequest,
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
* Edit insertion order through SSIO.
* Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* sSIOEditInsertionOrderRequest SSIOEditInsertionOrderRequest Order line to create.
* returns SSIOEditInsertionOrderResponse
* */
const ssio_insertion_order/edit = ({ adUnderscoreaccountUnderscoreid, sSIOEditInsertionOrderRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        sSIOEditInsertionOrderRequest,
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
* Get insertion order status by ad account id.
* Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* returns ssio_insertion_orders_status_get_by_ad_account_200_response
* */
const ssio_insertion_orders_status/get_by_ad_account = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
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
* Get insertion order status by pin order id.
* Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* pinUnderscoreorderUnderscoreid String The pin order id associated with the ssio insertion order
* returns SSIOInsertionOrderStatusResponse
* */
const ssio_insertion_orders_status/get_by_pin_order_id = ({ adUnderscoreaccountUnderscoreid, pinUnderscoreorderUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        pinUnderscoreorderUnderscoreid,
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
* Get Salesforce order lines by ad account id.
* Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* pinUnderscoreorderUnderscoreid String The pin order id associated with the ssio insertino order (optional)
* returns ssio_order_lines_get_by_ad_account_200_response
* */
const ssio_order_lines/get_by_ad_account = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, pinUnderscoreorderUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bookmark,
        pageUnderscoresize,
        pinUnderscoreorderUnderscoreid,
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
  ads_credit/redeem,
  ads_credits_discounts/get,
  billing_profiles/get,
  ssio_accounts/get,
  ssio_insertion_order/create,
  ssio_insertion_order/edit,
  ssio_insertion_orders_status/get_by_ad_account,
  ssio_insertion_orders_status/get_by_pin_order_id,
  ssio_order_lines/get_by_ad_account,
};
