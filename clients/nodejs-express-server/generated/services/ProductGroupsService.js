/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get catalog product groups
* This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* feedUnderscoreprofileUnderscoreid String The feed profile id whose catalog product groups we want to return. (optional)
* returns ad_accounts_catalogs_product_groups_list_200_response
* */
const ad_accounts_catalogs_product_groups/list = ({ adUnderscoreaccountUnderscoreid, feedUnderscoreprofileUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        feedUnderscoreprofileUnderscoreid,
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
  ad_accounts_catalogs_product_groups/list,
};
