/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List accounts with access to an audience owned by an ad account
* List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
*
* audienceUnderscoreid String Unique identifier of the audience to use to filter the results.
* accountUnderscoretype AudienceAccountType Filter accounts by account type.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns ad_accounts_audiences_shared_accounts_list_200_response
* */
const ad_accounts_audiences_shared_accounts/list = ({ audienceUnderscoreid, accountUnderscoretype, adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        audienceUnderscoreid,
        accountUnderscoretype,
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
* List accounts with access to an audience owned by a business
* List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* audienceUnderscoreid String Unique identifier of the audience to use to filter the results.
* accountUnderscoretype AudienceAccountType Filter accounts by account type.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns ad_accounts_audiences_shared_accounts_list_200_response
* */
const business_account_audiences_shared_accounts/list = ({ businessUnderscoreid, audienceUnderscoreid, accountUnderscoretype, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        audienceUnderscoreid,
        accountUnderscoretype,
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
* List received audiences for a business
* Get a list of received audiences for the given business.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* order Order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns shared_audiences_for_business_list_200_response
* */
const shared_audiences_for_business/list = ({ businessUnderscoreid, order, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        order,
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
* Update audience sharing between ad accounts
* From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adAccountToAdAccountSharedAudienceUpdateWithRequiredBody AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody 
* returns AdAccountToAdAccountSharedAudience
* */
const update_ad_account_to_ad_account_shared_audience = ({ adUnderscoreaccountUnderscoreid, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adAccountToAdAccountSharedAudienceUpdateWithRequiredBody,
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
* From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adAccountToBusinessSharedAudienceUpdateWithRequiredBody AdAccountToBusinessSharedAudienceUpdateWithRequiredBody 
* returns AdAccountToBusinessSharedAudience
* */
const update_ad_account_to_business_shared_audience = ({ adUnderscoreaccountUnderscoreid, adAccountToBusinessSharedAudienceUpdateWithRequiredBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adAccountToBusinessSharedAudienceUpdateWithRequiredBody,
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
* From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
*
* businessUnderscoreid String Unique identifier of the requesting business.
* businessToAdAccountSharedAudienceUpdateWithRequiredBody BusinessToAdAccountSharedAudienceUpdateWithRequiredBody 
* returns BusinessToAdAccountSharedAudience
* */
const update_business_to_ad_account_shared_audience = ({ businessUnderscoreid, businessToAdAccountSharedAudienceUpdateWithRequiredBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        businessToAdAccountSharedAudienceUpdateWithRequiredBody,
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
* From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
*
* businessUnderscoreid String Unique identifier of the requesting business.
* businessToBusinessSharedAudienceUpdateWithRequiredBody BusinessToBusinessSharedAudienceUpdateWithRequiredBody 
* returns BusinessToBusinessSharedAudience
* */
const update_business_to_business_shared_audience = ({ businessUnderscoreid, businessToBusinessSharedAudienceUpdateWithRequiredBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        businessToBusinessSharedAudienceUpdateWithRequiredBody,
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
