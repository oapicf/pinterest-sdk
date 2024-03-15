/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get lead form by id
* Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* leadUnderscoreformUnderscoreid String Unique identifier of a lead form.
* returns LeadFormResponse
* */
const lead_form/get = ({ adUnderscoreaccountUnderscoreid, leadUnderscoreformUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        leadUnderscoreformUnderscoreid,
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
* Create lead form test data
* Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* leadUnderscoreformUnderscoreid String Unique identifier of a lead form.
* leadFormTestRequest LeadFormTestRequest Subscription to create.
* returns LeadFormTestResponse
* */
const lead_form_test/create = ({ adUnderscoreaccountUnderscoreid, leadUnderscoreformUnderscoreid, leadFormTestRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        leadUnderscoreformUnderscoreid,
        leadFormTestRequest,
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
* Get lead forms
* Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)
* order String The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns lead_forms_list_200_response
* */
const lead_forms/list = ({ adUnderscoreaccountUnderscoreid, pageUnderscoresize, order, bookmark }) => new Promise(
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
  lead_form/get,
  lead_form_test/create,
  lead_forms/list,
};
