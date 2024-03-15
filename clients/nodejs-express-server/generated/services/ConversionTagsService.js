/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create conversion tag
* Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* conversionTagCreate ConversionTagCreate Conversion Tag to create
* returns ConversionTagResponse
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
* returns ConversionTagResponse
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
* Get conversion tags
* List conversion tags associated with an ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* filterUnderscoredeleted Boolean Filter out deleted tags. (optional)
* returns ConversionTagListResponse
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
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)
* order String The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns page_visit_conversion_tags_get_200_response
* */
const page_visit_conversion_tags/get = ({ adUnderscoreaccountUnderscoreid, pageUnderscoresize, order, bookmark }) => new Promise(
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
  conversion_tags/create,
  conversion_tags/get,
  conversion_tags/list,
  ocpm_eligible_conversion_tags/get,
  page_visit_conversion_tags/get,
};
