/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List accounts with access to an audience owned by an ad account
* List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* audienceUnderscoreid String Unique identifier of the audience to use to filter the results.
* accountUnderscoretype AudienceAccountType Filter accounts by account type.
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns ad_accounts_audiences_shared_accounts_list_200_response
* */
const ad_accounts_audiences_shared_accounts/list = ({ adUnderscoreaccountUnderscoreid, audienceUnderscoreid, accountUnderscoretype, pageUnderscoresize, bookmark }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        audienceUnderscoreid,
        accountUnderscoretype,
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
* List accounts with access to an audience owned by a business
* List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* audienceUnderscoreid String Unique identifier of the audience to use to filter the results.
* accountUnderscoretype AudienceAccountType Filter accounts by account type.
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns ad_accounts_audiences_shared_accounts_list_200_response
* */
const business_account_audiences_shared_accounts/list = ({ businessUnderscoreid, audienceUnderscoreid, accountUnderscoretype, pageUnderscoresize, bookmark }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        audienceUnderscoreid,
        accountUnderscoretype,
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
* List received audiences for a business
* Get a list of received audiences for the given business.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* bookmark String Cursor used to fetch the next page of items (optional)
* order String The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* returns audiences_list_200_response
* */
const shared_audiences_for_business/list = ({ businessUnderscoreid, bookmark, order, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        bookmark,
        order,
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
* Update audience sharing between ad accounts
* From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* sharedAudience SharedAudience 
* returns SharedAudienceResponse
* */
const update_ad_account_to_ad_account_shared_audience = ({ adUnderscoreaccountUnderscoreid, sharedAudience }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        sharedAudience,
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
* Update audience sharing from an ad account to businesses
* From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* businessSharedAudience BusinessSharedAudience 
* returns BusinessSharedAudienceResponse
* */
const update_ad_account_to_business_shared_audience = ({ adUnderscoreaccountUnderscoreid, businessSharedAudience }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        businessSharedAudience,
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
* Update audience sharing from a business to ad accounts
* From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* sharedAudience SharedAudience 
* returns SharedAudienceResponse
* */
const update_business_to_ad_account_shared_audience = ({ businessUnderscoreid, sharedAudience }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        sharedAudience,
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
* Update audience sharing between businesses
* From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* businessSharedAudience BusinessSharedAudience 
* returns BusinessSharedAudienceResponse
* */
const update_business_to_business_shared_audience = ({ businessUnderscoreid, businessSharedAudience }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        businessSharedAudience,
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
  ad_accounts_audiences_shared_accounts/list,
  business_account_audiences_shared_accounts/list,
  shared_audiences_for_business/list,
  update_ad_account_to_ad_account_shared_audience,
  update_ad_account_to_business_shared_audience,
  update_business_to_ad_account_shared_audience,
  update_business_to_business_shared_audience,
};
