/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create customer lists
* Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
*
* adUnderscoreaccountUnderscoreid String 
* customerListCreate CustomerListCreate 
* returns CustomerList
* */
const customer_lists/create = ({ adUnderscoreaccountUnderscoreid, customerListCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        customerListCreate,
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
* Get customer list
* Gets a specific customer list given the customer list ID.
*
* adUnderscoreaccountUnderscoreid String 
* customerUnderscorelistUnderscoreid String Customer list ID.
* returns CustomerList
* */
const customer_lists/get = ({ adUnderscoreaccountUnderscoreid, customerUnderscorelistUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        customerUnderscorelistUnderscoreid,
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
* Get customer lists
* Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
*
* adUnderscoreaccountUnderscoreid String 
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* excludeUnderscorenca Boolean When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). (optional)
* returns customer_lists_list_200_response
* */
const customer_lists/list = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order, excludeUnderscorenca }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bookmark,
        pageUnderscoresize,
        order,
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
* Update customer list
* Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
*
* adUnderscoreaccountUnderscoreid String 
* customerUnderscorelistUnderscoreid String Customer list ID.
* customerListUpdateWithRequiredBody CustomerListUpdateWithRequiredBody 
* returns CustomerList
* */
const customer_lists/update = ({ adUnderscoreaccountUnderscoreid, customerUnderscorelistUnderscoreid, customerListUpdateWithRequiredBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        customerUnderscorelistUnderscoreid,
        customerListUpdateWithRequiredBody,
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
  customer_lists/create,
  customer_lists/get,
  customer_lists/list,
  customer_lists/update,
};
