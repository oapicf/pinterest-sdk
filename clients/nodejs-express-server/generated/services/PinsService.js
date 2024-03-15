/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get Pin analytics
* Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
*
* pinUnderscoreid String Unique identifier of a Pin.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* metricUnderscoretypes List Pin metric types to get data for, default is all.
* appUnderscoretypes String Apps or devices to get data for, default is all. (optional)
* splitUnderscorefield String How to split the data into groups. Not including this param means data won't be split. (optional)
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns Map
* */
const pins/analytics = ({ pinUnderscoreid, startUnderscoredate, endUnderscoredate, metricUnderscoretypes, appUnderscoretypes, splitUnderscorefield, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pinUnderscoreid,
        startUnderscoredate,
        endUnderscoredate,
        metricUnderscoretypes,
        appUnderscoretypes,
        splitUnderscorefield,
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
* Create Pin
* Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/content/content-creation/'>Content App Solutions Guide</a>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
*
* pinCreate PinCreate Create a new Pin.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns Pin
* */
const pins/create = ({ pinCreate, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pinCreate,
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
* Delete Pin
* Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
*
* pinUnderscoreid String Unique identifier of a Pin.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* no response value expected for this operation
* */
const pins/delete = ({ pinUnderscoreid, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pinUnderscoreid,
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
* Get Pin
* Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
*
* pinUnderscoreid String Unique identifier of a Pin.
* pinUnderscoremetrics Boolean Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns Pin
* */
const pins/get = ({ pinUnderscoreid, pinUnderscoremetrics, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pinUnderscoreid,
        pinUnderscoremetrics,
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
* List Pins
* Get a list of the Pins owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
*
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)
* pinUnderscorefilter String Pin filter. (optional)
* includeUnderscoreprotectedUnderscorepins Boolean Specify if return pins from protected boards (optional)
* pinUnderscoretype String The type of pins to return, currently only enabled for private pins (optional)
* creativeUnderscoretypes List Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* pinUnderscoremetrics Boolean Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)
* returns pins_list_200_response
* */
const pins/list = ({ bookmark, pageUnderscoresize, pinUnderscorefilter, includeUnderscoreprotectedUnderscorepins, pinUnderscoretype, creativeUnderscoretypes, adUnderscoreaccountUnderscoreid, pinUnderscoremetrics }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bookmark,
        pageUnderscoresize,
        pinUnderscorefilter,
        includeUnderscoreprotectedUnderscorepins,
        pinUnderscoretype,
        creativeUnderscoretypes,
        adUnderscoreaccountUnderscoreid,
        pinUnderscoremetrics,
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
* Save Pin
* Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
*
* pinUnderscoreid String Unique identifier of a Pin.
* pinsSaveRequest PinsSaveRequest Request object used to save an existing pin
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns Pin
* */
const pins/save = ({ pinUnderscoreid, pinsSaveRequest, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pinUnderscoreid,
        pinsSaveRequest,
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
* Update Pin
* Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
*
* pinUnderscoreid String Unique identifier of a Pin.
* pinUpdate PinUpdate 
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns Pin
* */
const pins/update = ({ pinUnderscoreid, pinUpdate, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pinUnderscoreid,
        pinUpdate,
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

module.exports = {
  pins/analytics,
  pins/create,
  pins/delete,
  pins/get,
  pins/list,
  pins/save,
  pins/update,
};
