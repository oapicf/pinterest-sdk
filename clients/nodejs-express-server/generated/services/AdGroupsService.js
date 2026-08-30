/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get ad group analytics
* Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
*
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* adUnderscoregroupUnderscoreids List List of Ad group Ids to use to filter the results.
* columns List Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
* granularity Granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* clickUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* engagementUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
* viewUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
* conversionUnderscorereportUnderscoretime String The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
* aggregateUnderscorereportUnderscorerows Boolean Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional)
* reportingUnderscoretimezone ReportingTimeZone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
* returns List
* */
const ad_groups/analytics = ({ startUnderscoredate, endUnderscoredate, adUnderscoregroupUnderscoreids, columns, granularity, adUnderscoreaccountUnderscoreid, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime, aggregateUnderscorereportUnderscorerows, reportingUnderscoretimezone }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoredate,
        endUnderscoredate,
        adUnderscoregroupUnderscoreids,
        columns,
        granularity,
        adUnderscoreaccountUnderscoreid,
        clickUnderscorewindowUnderscoredays,
        engagementUnderscorewindowUnderscoredays,
        viewUnderscorewindowUnderscoredays,
        conversionUnderscorereportUnderscoretime,
        aggregateUnderscorereportUnderscorerows,
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
* Get audience sizing
* Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adGroupAudienceSizingCreate AdGroupAudienceSizingCreate 
* returns AdGroupAudienceSizing
* */
const ad_groups/audience_sizing = ({ adUnderscoreaccountUnderscoreid, adGroupAudienceSizingCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adGroupAudienceSizingCreate,
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
* Create ad groups
* Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adGroupCreateCreate List 
* returns ad_groups_create_200_response
* */
const ad_groups/create = ({ adUnderscoreaccountUnderscoreid, adGroupCreateCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adGroupCreateCreate,
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
* Get ad group
* Get a specific ad group given the ad group ID.
*
* adUnderscoregroupUnderscoreid String Ad group ID.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns AdGroup
* */
const ad_groups/get = ({ adUnderscoregroupUnderscoreid, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoregroupUnderscoreid,
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
* List ad groups
* List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* campaignUnderscoreids List List of Campaign Ids to use to filter the results. (optional)
* adUnderscoregroupUnderscoreids List List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
* entityUnderscorestatuses List Entity status (optional)
* translateUnderscoreinterestsUnderscoretoUnderscorenames Boolean Return interests as text names (if value is true) rather than topic IDs. (optional)
* returns ad_groups_list_200_response
* */
const ad_groups/list = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order, campaignUnderscoreids, adUnderscoregroupUnderscoreids, entityUnderscorestatuses, translateUnderscoreinterestsUnderscoretoUnderscorenames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bookmark,
        pageUnderscoresize,
        order,
        campaignUnderscoreids,
        adUnderscoregroupUnderscoreids,
        entityUnderscorestatuses,
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
* Update ad groups
* Update multiple existing ad groups.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adGroupUpdateBatchUpdate List 
* returns ad_groups_create_200_response
* */
const ad_groups/update = ({ adUnderscoreaccountUnderscoreid, adGroupUpdateBatchUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adGroupUpdateBatchUpdate,
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
* Get bid floors
* List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bidFloorCreate BidFloorCreate 
* returns BidFloor
* */
const ad_groups_bid_floor/get = ({ adUnderscoreaccountUnderscoreid, bidFloorCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bidFloorCreate,
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
* Get dynamic titles CSV download URL
* Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adUnderscoregroupUnderscoreid String Ad group ID.
* returns DynamicTitlesDownloadCSV
* */
const ad_groups_dynamic_titles/download_csv = ({ adUnderscoreaccountUnderscoreid, adUnderscoregroupUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adUnderscoregroupUnderscoreid,
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
* Get dynamic titles status
* Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adUnderscoregroupUnderscoreid String Ad group ID.
* returns DynamicTitlesGetStatus
* */
const ad_groups_dynamic_titles/get_status = ({ adUnderscoreaccountUnderscoreid, adUnderscoregroupUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adUnderscoregroupUnderscoreid,
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
* Get dynamic titles upload URL
* Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adUnderscoregroupUnderscoreid String Ad group ID.
* returns DynamicTitlesUploadURL
* */
const ad_groups_dynamic_titles/get_upload_url = ({ adUnderscoreaccountUnderscoreid, adUnderscoregroupUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adUnderscoregroupUnderscoreid,
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
* Process dynamic titles CSV
* Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adUnderscoregroupUnderscoreid String Ad group ID.
* dynamicTitlesProcessCSVCreate DynamicTitlesProcessCSVCreate 
* returns DynamicTitlesProcessCSV
* */
const ad_groups_dynamic_titles/process_csv = ({ adUnderscoreaccountUnderscoreid, adUnderscoregroupUnderscoreid, dynamicTitlesProcessCSVCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adUnderscoregroupUnderscoreid,
        dynamicTitlesProcessCSVCreate,
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
* Get targeting analytics for ad groups
* Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adUnderscoregroupUnderscoreids List List of Ad group Ids to use to filter the results.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* targetingUnderscoretypes List Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.
* columns List Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
* granularity Granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
* clickUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* engagementUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
* viewUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
* conversionUnderscorereportUnderscoretime String The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
* attributionUnderscoretypes List List of types of attribution for the conversion report (optional)
* reportingUnderscoretimezone ReportingTimeZone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
* sortUnderscorecolumns List Sort Columns. (optional)
* sortUnderscoreascending Boolean Sort ascending. (optional)
* returns MetricsResponse
* */
const ad_groups_targeting_analytics/get = ({ adUnderscoreaccountUnderscoreid, adUnderscoregroupUnderscoreids, startUnderscoredate, endUnderscoredate, targetingUnderscoretypes, columns, granularity, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime, attributionUnderscoretypes, reportingUnderscoretimezone, sortUnderscorecolumns, sortUnderscoreascending }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adUnderscoregroupUnderscoreids,
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
        sortUnderscorecolumns,
        sortUnderscoreascending,
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
* List of ad groups using promotions IDs.
*   Get a list of ad groups that are associated with those promotion ids
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* promotionUnderscoreids List List of Promotion IDs to use to filter the results.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* returns ad_groups_list_200_response
* */
const get_ad_groups_by_promotion_ids/list = ({ adUnderscoreaccountUnderscoreid, promotionUnderscoreids, bookmark, pageUnderscoresize, order }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        promotionUnderscoreids,
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
  ad_groups/analytics,
  ad_groups/audience_sizing,
  ad_groups/create,
  ad_groups/get,
  ad_groups/list,
  ad_groups/update,
  ad_groups_bid_floor/get,
  ad_groups_dynamic_titles/download_csv,
  ad_groups_dynamic_titles/get_status,
  ad_groups_dynamic_titles/get_upload_url,
  ad_groups_dynamic_titles/process_csv,
  ad_groups_targeting_analytics/get,
  get_ad_groups_by_promotion_ids/list,
};
