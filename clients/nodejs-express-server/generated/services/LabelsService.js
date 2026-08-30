/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Apply label to entity
*   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
*
* adUnderscoreaccountUnderscoreid String 
* labelUnderscoreid String Label ID.
* labeledEntitiesCreate LabeledEntitiesCreate 
* returns LabeledEntities
* */
const labels/apply = ({ adUnderscoreaccountUnderscoreid, labelUnderscoreid, labeledEntitiesCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        labelUnderscoreid,
        labeledEntitiesCreate,
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
* Create labels
* [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* labelCreateRequest LabelCreateRequest 
* returns LabelsResponse
* */
const labels/create = ({ adUnderscoreaccountUnderscoreid, labelCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        labelCreateRequest,
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
* List labels
* [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* campaignUnderscoreids List List of Campaign Ids to use to filter the results. (optional)
* labelUnderscoreids List List of Label Ids to use to filter the results. (optional)
* entityUnderscorestatuses List Label entity status (optional)
* labelUnderscoretypes List Label type. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns labels_list_200_response
* */
const labels/list = ({ adUnderscoreaccountUnderscoreid, campaignUnderscoreids, labelUnderscoreids, entityUnderscorestatuses, labelUnderscoretypes, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        campaignUnderscoreids,
        labelUnderscoreids,
        entityUnderscorestatuses,
        labelUnderscoretypes,
        bookmark,
        pageUnderscoresize,
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
* Remove label from entities
*   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
*
* adUnderscoreaccountUnderscoreid String 
* labelUnderscoreid String Label ID.
* labeledEntitiesCreate LabeledEntitiesCreate 
* returns LabeledEntities
* */
const labels/remove = ({ adUnderscoreaccountUnderscoreid, labelUnderscoreid, labeledEntitiesCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        labelUnderscoreid,
        labeledEntitiesCreate,
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
* Update labels
* [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* labelUpdateRequest LabelUpdateRequest 
* returns LabelsResponse
* */
const labels/update = ({ adUnderscoreaccountUnderscoreid, labelUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        labelUpdateRequest,
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
  labels/apply,
  labels/create,
  labels/list,
  labels/remove,
  labels/update,
};
