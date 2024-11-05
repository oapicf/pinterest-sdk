/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get order line
* Get a specific existing order line associated with an ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* orderUnderscorelineUnderscoreid String Unique identifier of an order line.
* returns OrderLine
* */
const order_lines/get = ({ adUnderscoreaccountUnderscoreid, orderUnderscorelineUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        orderUnderscorelineUnderscoreid,
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
* Get order lines
* List existing order lines associated with an ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* order String The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns order_lines_list_200_response
* */
const order_lines/list = ({ adUnderscoreaccountUnderscoreid, pageUnderscoresize, order, bookmark }) => new Promise(
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

module.exports = {
  order_lines/get,
  order_lines/list,
};
