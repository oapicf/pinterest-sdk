/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get ad account analytics
* Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD
* columns List Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
* granularity Granularity Granularity
* clickUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* engagementUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* viewUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
* conversionUnderscorereportUnderscoretime String The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
* returns List
* */
const ad_account/analytics = ({ adUnderscoreaccountUnderscoreid, startUnderscoredate, endUnderscoredate, columns, granularity, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        startUnderscoredate,
        endUnderscoredate,
        columns,
        granularity,
        clickUnderscorewindowUnderscoredays,
        engagementUnderscorewindowUnderscoredays,
        viewUnderscorewindowUnderscoredays,
        conversionUnderscorereportUnderscoretime,
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
* List ad accounts
* Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.
*
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)
* includeUnderscoresharedUnderscoreaccounts Boolean Include shared ad accounts (optional)
* returns Paginated
* */
const ad_accounts/list = ({ bookmark, pageUnderscoresize, includeUnderscoresharedUnderscoreaccounts }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bookmark,
        pageUnderscoresize,
        includeUnderscoresharedUnderscoreaccounts,
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
* Get ad group analytics
* Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD
* adUnderscoregroupUnderscoreids List List of Ad group Ids to use to filter the results.
* columns List Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
* granularity Granularity Granularity
* clickUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* engagementUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* viewUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
* conversionUnderscorereportUnderscoretime String The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
* returns List
* */
const ad_groups/analytics = ({ adUnderscoreaccountUnderscoreid, startUnderscoredate, endUnderscoredate, adUnderscoregroupUnderscoreids, columns, granularity, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        startUnderscoredate,
        endUnderscoredate,
        adUnderscoregroupUnderscoreids,
        columns,
        granularity,
        clickUnderscorewindowUnderscoredays,
        engagementUnderscorewindowUnderscoredays,
        viewUnderscorewindowUnderscoredays,
        conversionUnderscorereportUnderscoretime,
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
* List ad groups
* Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* campaignUnderscoreids List List of Campaign Ids to use to filter the results. (optional)
* adUnderscoregroupUnderscoreids List List of Ad group Ids to use to filter the results. (optional)
* entityUnderscorestatuses List Entity status (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)
* order String The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* translateUnderscoreinterestsUnderscoretoUnderscorenames Boolean Return interests as text names (if value is true) rather than topic IDs. (optional)
* returns Paginated
* */
const ad_groups/list = ({ adUnderscoreaccountUnderscoreid, campaignUnderscoreids, adUnderscoregroupUnderscoreids, entityUnderscorestatuses, pageUnderscoresize, order, bookmark, translateUnderscoreinterestsUnderscoretoUnderscorenames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        campaignUnderscoreids,
        adUnderscoregroupUnderscoreids,
        entityUnderscorestatuses,
        pageUnderscoresize,
        order,
        bookmark,
        translateUnderscoreinterestsUnderscoretoUnderscorenames,
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
* Get ad analytics
* Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD
* adUnderscoreids List List of Ad Ids to use to filter the results.
* columns List Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
* granularity Granularity Granularity
* clickUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* engagementUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* viewUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
* conversionUnderscorereportUnderscoretime String The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
* returns List
* */
const ads/analytics = ({ adUnderscoreaccountUnderscoreid, startUnderscoredate, endUnderscoredate, adUnderscoreids, columns, granularity, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        startUnderscoredate,
        endUnderscoredate,
        adUnderscoreids,
        columns,
        granularity,
        clickUnderscorewindowUnderscoredays,
        engagementUnderscorewindowUnderscoredays,
        viewUnderscorewindowUnderscoredays,
        conversionUnderscorereportUnderscoretime,
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
* List ads
* Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* campaignUnderscoreids List List of Campaign Ids to use to filter the results. (optional)
* adUnderscoregroupUnderscoreids List List of Ad group Ids to use to filter the results. (optional)
* adUnderscoreids List List of Ad Ids to use to filter the results. (optional)
* entityUnderscorestatuses List Entity status (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)
* order String The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns Paginated
* */
const ads/list = ({ adUnderscoreaccountUnderscoreid, campaignUnderscoreids, adUnderscoregroupUnderscoreids, adUnderscoreids, entityUnderscorestatuses, pageUnderscoresize, order, bookmark }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        campaignUnderscoreids,
        adUnderscoregroupUnderscoreids,
        adUnderscoreids,
        entityUnderscorestatuses,
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
* Create async request for an account analytics report
* This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adsAnalyticsCreateAsyncRequest AdsAnalyticsCreateAsyncRequest 
* returns AdsAnalyticsCreateAsyncResponse
* */
const analytics/create_report = ({ adUnderscoreaccountUnderscoreid, adsAnalyticsCreateAsyncRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adsAnalyticsCreateAsyncRequest,
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
* Get the account analytics report created by the async call
* This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* token String Token returned from the post request creation call
* returns AdsAnalyticsGetAsyncResponse
* */
const analytics/get_report = ({ adUnderscoreaccountUnderscoreid, token }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        token,
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
* Get campaign analytics
* Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD
* campaignUnderscoreids List List of Campaign Ids to use to filter the results.
* columns List Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
* granularity Granularity Granularity
* clickUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* engagementUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* viewUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
* conversionUnderscorereportUnderscoretime String The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
* returns List
* */
const campaigns/analytics = ({ adUnderscoreaccountUnderscoreid, startUnderscoredate, endUnderscoredate, campaignUnderscoreids, columns, granularity, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        startUnderscoredate,
        endUnderscoredate,
        campaignUnderscoreids,
        columns,
        granularity,
        clickUnderscorewindowUnderscoredays,
        engagementUnderscorewindowUnderscoredays,
        viewUnderscorewindowUnderscoredays,
        conversionUnderscorereportUnderscoretime,
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
* List campaigns
* Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* campaignUnderscoreids List List of Campaign Ids to use to filter the results. (optional)
* entityUnderscorestatuses List Entity status (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)
* order String The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns Paginated
* */
const campaigns/list = ({ adUnderscoreaccountUnderscoreid, campaignUnderscoreids, entityUnderscorestatuses, pageUnderscoresize, order, bookmark }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        campaignUnderscoreids,
        entityUnderscorestatuses,
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
* Get product group analytics
* Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD
* productUnderscoregroupUnderscoreids List List of Product group Ids to use to filter the results.
* columns List Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
* granularity Granularity Granularity
* clickUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* engagementUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* viewUnderscorewindowUnderscoredays Integer Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
* conversionUnderscorereportUnderscoretime String The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
* returns List
* */
const product_groups/analytics = ({ adUnderscoreaccountUnderscoreid, startUnderscoredate, endUnderscoredate, productUnderscoregroupUnderscoreids, columns, granularity, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        startUnderscoredate,
        endUnderscoredate,
        productUnderscoregroupUnderscoreids,
        columns,
        granularity,
        clickUnderscorewindowUnderscoredays,
        engagementUnderscorewindowUnderscoredays,
        viewUnderscorewindowUnderscoredays,
        conversionUnderscorereportUnderscoretime,
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
  ad_account/analytics,
  ad_accounts/list,
  ad_groups/analytics,
  ad_groups/list,
  ads/analytics,
  ads/list,
  analytics/create_report,
  analytics/get_report,
  campaigns/analytics,
  campaigns/list,
  product_groups/analytics,
};
