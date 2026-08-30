/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create promotions
* Create multiple new promotions.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* promotionCreate List 
* returns PromotionsResponse
* */
const promotions/create = ({ adUnderscoreaccountUnderscoreid, promotionCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        promotionCreate,
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
* Delete promotion by id
* Delete a promotion within Pinterest.
*
* promotionUnderscoreid String Promotion ID
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns Promotion
* */
const promotions/delete = ({ promotionUnderscoreid, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        promotionUnderscoreid,
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
* Get promotion by id
* Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
*
* promotionUnderscoreid String Promotion ID
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns Promotion
* */
const promotions/get = ({ promotionUnderscoreid, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        promotionUnderscoreid,
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
* Get promotions
* Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* returns promotions_list_200_response
* */
const promotions/list = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bookmark,
        pageUnderscoresize,
        order,
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
* Update promotions
* Update multiple promotions.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* promotionBatchUpdate List 
* returns PromotionsResponse
* */
const promotions/update = ({ adUnderscoreaccountUnderscoreid, promotionBatchUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        promotionBatchUpdate,
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
  promotions/create,
  promotions/delete,
  promotions/get,
  promotions/list,
  promotions/update,
};
