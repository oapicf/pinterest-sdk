/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create audience
* Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* audienceCreateRequest AudienceCreateRequest List of ads to create, size limit [1, 30]
* returns Audience
* */
const audiences/create = ({ adUnderscoreaccountUnderscoreid, audienceCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        audienceCreateRequest,
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
* Create custom audience
* Create a custom audience and find the audiences you want your ads to reach.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* audienceCreateCustomRequest AudienceCreateCustomRequest Custom audience to create.
* returns Audience
* */
const audiences/create_custom = ({ adUnderscoreaccountUnderscoreid, audienceCreateCustomRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        audienceCreateCustomRequest,
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
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* audienceUnderscoreid String Unique identifier of an audience
* returns Audience
* */
const audiences/get = ({ adUnderscoreaccountUnderscoreid, audienceUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        audienceUnderscoreid,
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
* order String The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* ownershipUnderscoretype String Filter audiences by ownership type. (optional)
* returns audiences_list_200_response
* */
const audiences/list = ({ adUnderscoreaccountUnderscoreid, bookmark, order, pageUnderscoresize, ownershipUnderscoretype }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bookmark,
        order,
        pageUnderscoresize,
        ownershipUnderscoretype,
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
* Update (edit or remove) an existing targeting audience.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* audienceUnderscoreid String Unique identifier of an audience
* audienceUpdateRequest AudienceUpdateRequest The audience to be updated. (optional)
* returns Audience
* */
const audiences/update = ({ adUnderscoreaccountUnderscoreid, audienceUnderscoreid, audienceUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        audienceUnderscoreid,
        audienceUpdateRequest,
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
  audiences/create_custom,
  audiences/get,
  audiences/list,
  audiences/update,
};
