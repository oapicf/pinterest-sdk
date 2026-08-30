/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create targeting templates
* Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* targetingTemplateCreate TargetingTemplateCreate 
* returns TargetingTemplate
* */
const targeting_template/create = ({ adUnderscoreaccountUnderscoreid, targetingTemplateCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        targetingTemplateCreate,
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
* List targeting templates
* Get a list of the targeting templates in the specified `ad_account_id`
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* includeUnderscoresizing Boolean Include audience sizing in result or not (optional)
* searchUnderscorequery String Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)
* returns targeting_template_list_200_response
* */
const targeting_template/list = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order, includeUnderscoresizing, searchUnderscorequery }) => new Promise(
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
* Update targeting templates
* Update the targeting template given advertiser ID and targeting template ID
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* targetingTemplateUpdateRequestReadOrUpdate TargetingTemplateUpdateRequestReadOrUpdate 
* no response value expected for this operation
* */
const targeting_template/update = ({ adUnderscoreaccountUnderscoreid, targetingTemplateUpdateRequestReadOrUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        targetingTemplateUpdateRequestReadOrUpdate,
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
  targeting_template/create,
  targeting_template/list,
  targeting_template/update,
};
