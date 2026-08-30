/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create ad preview with pin or image
* Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adPreviewRequest AdPreviewRequest 
* returns AdPreviewURLResponse
* */
const ad_previews/create = ({ adUnderscoreaccountUnderscoreid, adPreviewRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adPreviewRequest,
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
* Get targeting analytics for ads
* Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adUnderscoreids List List of Ad Ids to use to filter the results.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* targetingUnderscoretypes List Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
* columns List Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
* granularity Granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
* clickUnderscorewindowUnderscoredays ConversionAttributionWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* engagementUnderscorewindowUnderscoredays ConversionAttributionWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
* viewUnderscorewindowUnderscoredays ConversionAttributionWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
* conversionUnderscorereportUnderscoretime ConversionReportTimeType The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
* attributionUnderscoretypes List List of types of attribution for the conversion report (optional)
* reportingUnderscoretimezone ReportingTimeZone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
* sortUnderscorecolumns List Sort Columns. (optional)
* sortUnderscoreascending Boolean Sort ascending. (optional)
* returns MetricsResponse
* */
const ad_targeting_analytics/get = ({ adUnderscoreaccountUnderscoreid, adUnderscoreids, startUnderscoredate, endUnderscoredate, targetingUnderscoretypes, columns, granularity, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime, attributionUnderscoretypes, reportingUnderscoretimezone, sortUnderscorecolumns, sortUnderscoreascending }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adUnderscoreids,
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
* Get ad analytics
*     Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
*
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* columns List Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
* granularity Granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* pinUnderscoreids List List of Pin IDs. (optional)
* adUnderscoreids List List of Ad Ids to use to filter the results. (optional)
* clickUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* engagementUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
* viewUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
* conversionUnderscorereportUnderscoretime String The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
* campaignUnderscoreids List List of Campaign Ids to use to filter the results. (optional)
* reportingUnderscoretimezone ReportingTimeZone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
* returns List
* */
const ads/analytics = ({ startUnderscoredate, endUnderscoredate, columns, granularity, adUnderscoreaccountUnderscoreid, pinUnderscoreids, adUnderscoreids, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime, campaignUnderscoreids, reportingUnderscoretimezone }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoredate,
        endUnderscoredate,
        columns,
        granularity,
        adUnderscoreaccountUnderscoreid,
        pinUnderscoreids,
        adUnderscoreids,
        clickUnderscorewindowUnderscoredays,
        engagementUnderscorewindowUnderscoredays,
        viewUnderscorewindowUnderscoredays,
        conversionUnderscorereportUnderscoretime,
        campaignUnderscoreids,
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
* Create ads
* Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adCreate List 
* returns AdBatchWriteResponseModel
* */
const ads/create = ({ adUnderscoreaccountUnderscoreid, adCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adCreate,
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
* Get ad
* Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
*
* adUnderscoreid String The ID of this ad.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns Ad
* */
const ads/get = ({ adUnderscoreid, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreid,
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
* List ads
* List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* campaignUnderscoreids List List of Campaign Ids to use to filter the results. (optional)
* adUnderscoregroupUnderscoreids List List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
* adUnderscoreids List List of Ad Ids to use to filter the results. (optional)
* entityUnderscorestatuses List Entity status (optional)
* returns ads_list_200_response
* */
const ads/list = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order, campaignUnderscoreids, adUnderscoregroupUnderscoreids, adUnderscoreids, entityUnderscorestatuses }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bookmark,
        pageUnderscoresize,
        order,
        campaignUnderscoreids,
        adUnderscoregroupUnderscoreids,
        adUnderscoreids,
        entityUnderscorestatuses,
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
* Update ads
* Update multiple existing ads
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adBatchUpdate List 
* returns AdBatchWriteResponseModel
* */
const ads/update = ({ adUnderscoreaccountUnderscoreid, adBatchUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adBatchUpdate,
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
* Create ad preview records for one or more ad groups
* Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* campaignAdPreviewCreate List 
* returns List
* */
const campaign_ad_preview/create = ({ adUnderscoreaccountUnderscoreid, campaignAdPreviewCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        campaignAdPreviewCreate,
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
* Delete ad preview records for one or more ad groups
* Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
*
* adUnderscoregroupUnderscoreids List List of Ad group Ids to use to filter the results.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns List
* */
const campaign_ad_preview/delete = ({ adUnderscoregroupUnderscoreids, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoregroupUnderscoreids,
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
* Fetch ad preview records for one or more ad groups
* Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
*
* adUnderscoregroupUnderscoreids List List of Ad group Ids to use to filter the results.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns List
* */
const campaign_ad_preview/read = ({ adUnderscoregroupUnderscoreids, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoregroupUnderscoreids,
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
  ad_previews/create,
  ad_targeting_analytics/get,
  ads/analytics,
  ads/create,
  ads/get,
  ads/list,
  ads/update,
  campaign_ad_preview/create,
  campaign_ad_preview/delete,
  campaign_ad_preview/read,
};
