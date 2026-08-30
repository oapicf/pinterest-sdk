/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get lead form by id
* **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
*
* leadUnderscoreformUnderscoreid String The ID of this lead form
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns LeadForm
* */
const lead_form/get = ({ leadUnderscoreformUnderscoreid, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leadUnderscoreformUnderscoreid,
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
* Create lead form test data
* Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
*
* adUnderscoreaccountUnderscoreid String 
* leadUnderscoreformUnderscoreid String Unique identifier of a lead form.
* leadFormTestCreate LeadFormTestCreate 
* returns LeadFormTest
* */
const lead_form_test/create = ({ adUnderscoreaccountUnderscoreid, leadUnderscoreformUnderscoreid, leadFormTestCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        leadUnderscoreformUnderscoreid,
        leadFormTestCreate,
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
* **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* leadFormCreate List 
* returns lead_forms_create_200_response
* */
const lead_forms/create = ({ adUnderscoreaccountUnderscoreid, leadFormCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        leadFormCreate,
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
* **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* returns lead_forms_list_200_response
* */
const lead_forms/list = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order }) => new Promise(
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
/**
* Update lead forms
* **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* leadFormBatchUpdate List 
* returns lead_forms_create_200_response
* */
const lead_forms/update = ({ adUnderscoreaccountUnderscoreid, leadFormBatchUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        leadFormBatchUpdate,
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
