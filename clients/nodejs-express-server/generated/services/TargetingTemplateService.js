/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create targeting templates
* <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* targetingTemplateCreate TargetingTemplateCreate targeting template creation entity
* returns TargetingTemplateGetResponseData
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
* Get a list of the targeting templates in the specified <code>ad_account_id</code>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* order String The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* includeUnderscoresizing Boolean Include audience sizing in result or not (optional)
* searchUnderscorequery String Search keyword for targeting templates (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns targeting_template_list_200_response
* */
const targeting_template/list = ({ adUnderscoreaccountUnderscoreid, order, includeUnderscoresizing, searchUnderscorequery, pageUnderscoresize, bookmark }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        order,
        includeUnderscoresizing,
        searchUnderscorequery,
        pageUnderscoresize,
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
* Update targeting templates
* <p>Update the targeting template given advertiser ID and targeting template ID</p>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* targetingTemplateUpdateRequest TargetingTemplateUpdateRequest Operation type and targeting template ID
* no response value expected for this operation
* */
const targeting_template/update = ({ adUnderscoreaccountUnderscoreid, targetingTemplateUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        targetingTemplateUpdateRequest,
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
