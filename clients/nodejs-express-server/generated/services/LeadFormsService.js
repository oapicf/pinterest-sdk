/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get lead form by id
* <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
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
* Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
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
* Create lead forms
* <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* leadFormCreateRequest List List of lead forms to create, size limit [1, 30].
* returns LeadFormArrayResponse
* */
const lead_forms/create = ({ adUnderscoreaccountUnderscoreid, leadFormCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        leadFormCreateRequest,
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
* List lead forms
* <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
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
/**
* Update lead forms
* <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* leadFormUpdateRequest List List of lead forms to update, size limit [1, 30].
* returns LeadFormArrayResponse
* */
const lead_forms/update = ({ adUnderscoreaccountUnderscoreid, leadFormUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        leadFormUpdateRequest,
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
  lead_forms/create,
  lead_forms/list,
  lead_forms/update,
};
