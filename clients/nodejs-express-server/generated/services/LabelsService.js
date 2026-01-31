/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create labels
* <p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>
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
* <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* campaignUnderscoreids List List of Campaign Ids to use to filter the results. (optional)
* labelUnderscoreids List List of Label Ids to use to filter the results. (optional)
* entityUnderscorestatuses List Label entity status (optional)
* labelUnderscoretypes List Label type. (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns labels_list_200_response
* */
const labels/list = ({ adUnderscoreaccountUnderscoreid, campaignUnderscoreids, labelUnderscoreids, entityUnderscorestatuses, labelUnderscoretypes, pageUnderscoresize, bookmark }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        campaignUnderscoreids,
        labelUnderscoreids,
        entityUnderscorestatuses,
        labelUnderscoretypes,
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
* Update labels
* <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>
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
  labels/create,
  labels/list,
  labels/update,
};
