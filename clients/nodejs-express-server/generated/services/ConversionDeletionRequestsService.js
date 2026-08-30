/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create a conversion deletion request
* **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* conversionDeletionRequestCreate ConversionDeletionRequestCreate 
* returns ConversionDeletionRequest
* */
const conversion_deletion_request/create = ({ adUnderscoreaccountUnderscoreid, conversionDeletionRequestCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        conversionDeletionRequestCreate,
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
* Delete a conversion deletion request
* **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.
*
* requestUnderscoreid String Unique identifier of the conversion deletion request
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns ConversionDeletionRequest
* */
const conversion_deletion_request/delete = ({ requestUnderscoreid, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        requestUnderscoreid,
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
* Get a single conversion deletion request
* **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.
*
* requestUnderscoreid String Unique identifier of the conversion deletion request
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns ConversionDeletionRequest
* */
const conversion_deletion_request/get = ({ requestUnderscoreid, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        requestUnderscoreid,
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
* List conversion deletion requests
* **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* returns conversion_deletion_request_list_200_response
* */
const conversion_deletion_request/list = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order }) => new Promise(
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

module.exports = {
  conversion_deletion_request/create,
  conversion_deletion_request/delete,
  conversion_deletion_request/get,
  conversion_deletion_request/list,
};
