/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create conversion tag
* Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* conversionTagCreate ConversionTagCreate 
* returns ConversionTag
* */
const conversion_tags/create = ({ adUnderscoreaccountUnderscoreid, conversionTagCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        conversionTagCreate,
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
* Get conversion tag
* Get information about an existing conversion tag.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* conversionUnderscoretagUnderscoreid String Id of the conversion tag.
* returns ConversionTag
* */
const conversion_tags/get = ({ adUnderscoreaccountUnderscoreid, conversionUnderscoretagUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        conversionUnderscoretagUnderscoreid,
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
* List conversion tags
* List conversion tags associated with an ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* filterUnderscoredeleted Boolean Filter by deleted status (optional)
* returns conversion_tags_list_200_response
* */
const conversion_tags/list = ({ adUnderscoreaccountUnderscoreid, filterUnderscoredeleted }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        filterUnderscoredeleted,
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
* Get Ocpm eligible conversion tags
* Get Ocpm eligible conversion tag events for an ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns Map
* */
const ocpm_eligible_conversion_tags/get = ({ adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Get page visit conversion tags
* Get all page visit conversion tag events for an ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* returns page_visit_conversion_tags_get_200_response
* */
const page_visit_conversion_tags/get = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order }) => new Promise(
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
  conversion_tags/create,
  conversion_tags/get,
  conversion_tags/list,
  ocpm_eligible_conversion_tags/get,
  page_visit_conversion_tags/get,
};
