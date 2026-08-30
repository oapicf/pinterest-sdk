/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get multiple Pin analytics
* **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
*
* pinUnderscoreids List List of Pin IDs.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* metricUnderscoretypes List Pin metric types to get data for.
* appUnderscoretypes String Apps or devices to get data for, default is all. (optional)
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns Map
* */
const multi_pins/analytics = ({ pinUnderscoreids, startUnderscoredate, endUnderscoredate, metricUnderscoretypes, appUnderscoretypes, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pinUnderscoreids,
        startUnderscoredate,
        endUnderscoredate,
        metricUnderscoretypes,
        appUnderscoretypes,
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
* Get Pin analytics
* Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
*
* pinUnderscoreid String Unique identifier of a Pin.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* metricUnderscoretypes List Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before `2023-03-20`, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than `NO_SPLIT`.
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
*  Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.
*
* pinCreate PinCreate 
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
*   Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
*
* pinUnderscoreid String 
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns Pin
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
*   Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
*
* pinUnderscoreid String 
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* pinUnderscoremetrics Boolean Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)
* returns Pin
* */
const pins/get = ({ pinUnderscoreid, adUnderscoreaccountUnderscoreid, pinUnderscoremetrics }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pinUnderscoreid,
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
* List Pins
*     Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).
*
* pinUnderscorefilter PinFilter The filter to apply to the pins (optional)
* pinUnderscoremetrics Boolean Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)
* includeUnderscoreprotectedUnderscorepins Boolean Whether to include protected pins in the results (optional)
* pinUnderscoretype PinType The type of pins to return, currently only enabled for private pins (optional)
* creativeUnderscoretypes List Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* domain String Only return pins with links that match the exact domain. Domain should not include 'www.' prefix. For example, 'pinterest.com' is a valid domain, but 'www.pinterest.com' is not (will not match any pins). (optional)
* domains List Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. `?domains=instagram.com,jcpenney.com`). (optional)
* includeUnderscoreproductUnderscoretagUnderscoreobj Boolean Include product tag objects in the response with their associated links. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns pins_list_200_response
* */
const pins/list = ({ pinUnderscorefilter, pinUnderscoremetrics, includeUnderscoreprotectedUnderscorepins, pinUnderscoretype, creativeUnderscoretypes, adUnderscoreaccountUnderscoreid, domain, domains, includeUnderscoreproductUnderscoretagUnderscoreobj, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pinUnderscorefilter,
        pinUnderscoremetrics,
        includeUnderscoreprotectedUnderscorepins,
        pinUnderscoretype,
        creativeUnderscoretypes,
        adUnderscoreaccountUnderscoreid,
        domain,
        domains,
        includeUnderscoreproductUnderscoretagUnderscoreobj,
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
* Save Pin
* Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
*
* pinUnderscoreid String Unique identifier of a Pin.
* pinsSaveRequestCreate PinsSaveRequestCreate 
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns Pin
* */
const pins/save = ({ pinUnderscoreid, pinsSaveRequestCreate, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pinUnderscoreid,
        pinsSaveRequestCreate,
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
* Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
*
* pinUnderscoreid String 
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
  multi_pins/analytics,
  pins/analytics,
  pins/create,
  pins/delete,
  pins/get,
  pins/list,
  pins/save,
  pins/update,
};
