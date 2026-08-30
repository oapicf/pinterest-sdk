/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get order line
* Get a specific existing order line associated with an ad account.
*
* orderUnderscorelineUnderscoreid String Order line ID.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns OrderLine
* */
const order_lines/get = ({ orderUnderscorelineUnderscoreid, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        orderUnderscorelineUnderscoreid,
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
* Get order lines.
* List existing order lines associated with an ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* returns order_lines_list_200_response
* */
const order_lines/list = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order }) => new Promise(
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
  order_lines/get,
  order_lines/list,
};
