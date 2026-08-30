/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create audience
* Create a new audience for the ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adAccountsAudienceCreate AdAccountsAudienceCreate 
* returns AdAccountsAudience
* */
const audiences/create = ({ adUnderscoreaccountUnderscoreid, adAccountsAudienceCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adAccountsAudienceCreate,
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
* Get audience
* Get a specific audience given the audience ID.
*
* audienceUnderscoreid String Audience ID.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns AdAccountsAudience
* */
const audiences/get = ({ audienceUnderscoreid, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        audienceUnderscoreid,
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
* List audiences
* Get list of audiences for the ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* ownershipUnderscoretype AudienceOwnershipType  (optional)
* excludeUnderscorenca Boolean When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). (optional)
* returns audiences_list_200_response
* */
const audiences/list = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order, ownershipUnderscoretype, excludeUnderscorenca }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bookmark,
        pageUnderscoresize,
        order,
        ownershipUnderscoretype,
        excludeUnderscorenca,
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
* Update audience
* Update an existing audience for the ad account.
*
* audienceUnderscoreid String Audience ID.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adAccountsAudienceUpdate AdAccountsAudienceUpdate 
* returns AdAccountsAudience
* */
const audiences/update = ({ audienceUnderscoreid, adUnderscoreaccountUnderscoreid, adAccountsAudienceUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        audienceUnderscoreid,
        adUnderscoreaccountUnderscoreid,
        adAccountsAudienceUpdate,
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
  audiences/create,
  audiences/get,
  audiences/list,
  audiences/update,
};
