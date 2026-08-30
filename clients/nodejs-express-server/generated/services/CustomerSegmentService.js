/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create customer segments
* Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* customerSegmentCreate CustomerSegmentCreate 
* returns CustomerSegment
* */
const customer_segment/create = ({ adUnderscoreaccountUnderscoreid, customerSegmentCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        customerSegmentCreate,
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
* List customer segments
* Get a list of the customer segments in the specified `ad_account_id`.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* includeUnderscoresizing Boolean Include audience sizing in result or not (optional)
* searchUnderscorequery String Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)
* returns customer_segment_list_200_response
* */
const customer_segment/list = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order, includeUnderscoresizing, searchUnderscorequery }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bookmark,
        pageUnderscoresize,
        order,
        includeUnderscoresizing,
        searchUnderscorequery,
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
* Update customer segments
* Update the customer segment given advertiser ID and customer segment ID
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* customerSegmentUpdateRequestUpdateWithRequiredBody CustomerSegmentUpdateRequestUpdateWithRequiredBody 
* no response value expected for this operation
* */
const customer_segment/update = ({ adUnderscoreaccountUnderscoreid, customerSegmentUpdateRequestUpdateWithRequiredBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        customerSegmentUpdateRequestUpdateWithRequiredBody,
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
  customer_segment/create,
  customer_segment/list,
  customer_segment/update,
};
