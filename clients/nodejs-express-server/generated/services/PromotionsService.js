/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create promotions
* Create multiple new promotions.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* promotionCreateRequest List List of promotions to create, size limit [1, 30].
* returns PromotionsResponse
* */
const promotions/create = ({ adUnderscoreaccountUnderscoreid, promotionCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        promotionCreateRequest,
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
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* promotionUnderscoreid String Unique identifier of a promotion
* no response value expected for this operation
* */
const promotions/delete = ({ adUnderscoreaccountUnderscoreid, promotionUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        promotionUnderscoreid,
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
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* promotionUnderscoreid String Unique identifier of a promotion
* returns PromotionResponse
* */
const promotions/get = ({ adUnderscoreaccountUnderscoreid, promotionUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        promotionUnderscoreid,
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
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* order String The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns promotions_list_200_response
* */
const promotions/list = ({ adUnderscoreaccountUnderscoreid, pageUnderscoresize, order, bookmark }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        pageUnderscoresize,
        order,
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
* Update promotions
* Update multiple promotions.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* promotionUpdateRequest List List of promotions to create, size limit [1, 30].
* returns PromotionsResponse
* */
const promotions/update = ({ adUnderscoreaccountUnderscoreid, promotionUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        promotionUpdateRequest,
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
