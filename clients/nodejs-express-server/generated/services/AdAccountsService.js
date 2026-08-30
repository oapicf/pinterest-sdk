/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get ad account analytics
*   Get analytics for the specified `ad_account_id`, filtered by the specified options.    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
*
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* columns List Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
* granularity Granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* clickUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* engagementUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
* viewUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
* conversionUnderscorereportUnderscoretime String The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
* reportingUnderscoretimezone ReportingTimeZone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
* returns List
* */
const ad_account/analytics = ({ startUnderscoredate, endUnderscoredate, columns, granularity, adUnderscoreaccountUnderscoreid, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime, reportingUnderscoretimezone }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoredate,
        endUnderscoredate,
        columns,
        granularity,
        adUnderscoreaccountUnderscoreid,
        clickUnderscorewindowUnderscoredays,
        engagementUnderscorewindowUnderscoredays,
        viewUnderscorewindowUnderscoredays,
        conversionUnderscorereportUnderscoretime,
        reportingUnderscoretimezone,
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
* Get targeting analytics for an ad account
* Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* targetingUnderscoretypes List Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
* columns List Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
* granularity Granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
* clickUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* engagementUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
* viewUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
* conversionUnderscorereportUnderscoretime String The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
* attributionUnderscoretypes List List of types of attribution for the conversion report (optional)
* reportingUnderscoretimezone ReportingTimeZone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
* returns MetricsResponse
* */
const ad_account_targeting_analytics/get = ({ adUnderscoreaccountUnderscoreid, startUnderscoredate, endUnderscoredate, targetingUnderscoretypes, columns, granularity, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime, attributionUnderscoretypes, reportingUnderscoretimezone }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        startUnderscoredate,
        endUnderscoredate,
        targetingUnderscoretypes,
        columns,
        granularity,
        clickUnderscorewindowUnderscoredays,
        engagementUnderscorewindowUnderscoredays,
        viewUnderscorewindowUnderscoredays,
        conversionUnderscorereportUnderscoretime,
        attributionUnderscoretypes,
        reportingUnderscoretimezone,
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
* Create ad account
* Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
*
* adAccountCreate AdAccountCreate 
* returns AdAccount
* */
const ad_accounts/create = ({ adAccountCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adAccountCreate,
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
* Get ad account
* Get an ad account
*
* adUnderscoreaccountUnderscoreid String 
* returns AdAccount
* */
const ad_accounts/get = ({ adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* List ad accounts
* Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
*
* includeUnderscoresharedUnderscoreaccounts Boolean Include shared ad accounts (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns ad_accounts_list_200_response
* */
const ad_accounts/list = ({ includeUnderscoresharedUnderscoreaccounts, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        includeUnderscoresharedUnderscoreaccounts,
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
* Create a request for a brand, category, SKU report
*   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* conversionProductReportCreate ConversionProductReportCreate 
* returns ConversionProductReport
* */
const analytics/create_conversion_product_report = ({ adUnderscoreaccountUnderscoreid, conversionProductReportCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        conversionProductReportCreate,
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
* Create a request for a Marketing Mix Modeling (MMM) report
*     This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it's in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we'll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.
*
* adUnderscoreaccountUnderscoreid String 
* mMMReportCreate MMMReportCreate 
* returns MMMReport
* */
const analytics/create_mmm_report = ({ adUnderscoreaccountUnderscoreid, mMMReportCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        mMMReportCreate,
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
*   This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
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
* Create async request for an analytics report using a template
*   This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
*
* adUnderscoreaccountUnderscoreid String 
* templateUnderscoreid String Unique identifier of a template.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. (optional)
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. (optional)
* granularity Granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (optional)
* returns TemplateBasedReport
* */
const analytics/create_template_report = ({ adUnderscoreaccountUnderscoreid, templateUnderscoreid, startUnderscoredate, endUnderscoredate, granularity }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        templateUnderscoreid,
        startUnderscoredate,
        endUnderscoredate,
        granularity,
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
* Get advertiser brand, category, SKU report
*   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* token String Token returned from the post request creation call
* returns ConversionProductReport
* */
const analytics/get_conversion_product_report = ({ adUnderscoreaccountUnderscoreid, token }) => new Promise(
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
* Get advertiser Marketing Mix Modeling (MMM) report.
*     Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.
*
* adUnderscoreaccountUnderscoreid String 
* token String Token returned from the post request creation call
* returns MMMReport
* */
const analytics/get_mmm_report = ({ adUnderscoreaccountUnderscoreid, token }) => new Promise(
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
* Get the account analytics report created by the async call
*   This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
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
* Delete ads data for ad account in API Sandbox
* Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns String
* */
const sandbox/delete = ({ adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* List templates
* Gets all Templates associated with an ad account ID.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* returns templates_list_200_response
* */
const templates/list = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order }) => new Promise(
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

module.exports = {
  ad_account/analytics,
  ad_account_targeting_analytics/get,
  ad_accounts/create,
  ad_accounts/get,
  ad_accounts/list,
  analytics/create_conversion_product_report,
  analytics/create_mmm_report,
  analytics/create_report,
  analytics/create_template_report,
  analytics/get_conversion_product_report,
  analytics/get_mmm_report,
  analytics/get_report,
  sandbox/delete,
  templates/list,
};
