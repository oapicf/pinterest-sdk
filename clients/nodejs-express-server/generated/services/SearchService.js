/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Search pins by a given search term
* <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
*
* term String Search term to look up pins.
* countryUnderscorecode String Two letter country code (ISO 3166-1 alpha-2)
* bookmark String Cursor used to fetch the next page of items (optional)
* locale String Search locale. (optional)
* limit Integer Max search result size (optional)
* returns search_partner_pins_200_response
* */
const search_partner_pins = ({ term, countryUnderscorecode, bookmark, locale, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        term,
        countryUnderscorecode,
        bookmark,
        locale,
        limit,
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
* Search user's boards
* Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)
* query String Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)
* returns search_user_boards_get_200_response
* */
const search_user_boards/get = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, query }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bookmark,
        pageUnderscoresize,
        query,
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
* Search user's Pins
* Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
*
* query String Search query. Can contain pin description keywords or comma-separated pin IDs.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns pins_list_200_response
* */
const search_user_pins/list = ({ query, adUnderscoreaccountUnderscoreid, bookmark }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        query,
        adUnderscoreaccountUnderscoreid,
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
  search_partner_pins,
  search_user_boards/get,
  search_user_pins/list,
};
