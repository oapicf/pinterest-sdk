/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get item bid options (POST)
* Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
*
* advancedAuctionItemsGetRequest AdvancedAuctionItemsGetRequest Request object used to get bid options values for a batch of retail catalog items
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns AdvancedAuctionItems
* */
const advanced_auction_items_get/post = ({ advancedAuctionItemsGetRequest, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        advancedAuctionItemsGetRequest,
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
* Operate on item level bid options
* This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
*
* advancedAuctionItemsSubmitRequest AdvancedAuctionItemsSubmitRequest Request object used to upsert or delete bid options for a batch of retail catalog items
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns AdvancedAuctionProcessedItems
* */
const advanced_auction_items_submit/post = ({ advancedAuctionItemsSubmitRequest, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        advancedAuctionItemsSubmitRequest,
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
  advanced_auction_items_get/post,
  advanced_auction_items_submit/post,
};
