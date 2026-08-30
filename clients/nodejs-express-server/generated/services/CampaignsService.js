/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get pins analytics
* Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
*
* campaignUnderscoreid String Campaign Id to use to filter the results.
* pinUnderscoreids List List of Pin IDs.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* columns List Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
* granularity Granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* clickUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
* engagementUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
* viewUnderscorewindowUnderscoredays BigDecimal Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
* conversionUnderscorereportUnderscoretime String The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
* returns List
* */
const ad_pins/analytics = ({ campaignUnderscoreid, pinUnderscoreids, startUnderscoredate, endUnderscoredate, columns, granularity, adUnderscoreaccountUnderscoreid, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignUnderscoreid,
        pinUnderscoreids,
        startUnderscoredate,
        endUnderscoredate,
        columns,
        granularity,
        adUnderscoreaccountUnderscoreid,
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
* Get targeting analytics for campaigns
* Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* campaignUnderscoreids List List of Campaign Ids to use to filter the results.
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
const campaign_targeting_analytics/get = ({ adUnderscoreaccountUnderscoreid, campaignUnderscoreids, startUnderscoredate, endUnderscoredate, targetingUnderscoretypes, columns, granularity, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime, attributionUnderscoretypes, reportingUnderscoretimezone }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        campaignUnderscoreids,
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
* Get campaign analytics
* Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
*
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* campaignUnderscoreids List List of Campaign Ids to use to filter the results.
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
const campaigns/analytics = ({ startUnderscoredate, endUnderscoredate, campaignUnderscoreids, columns, granularity, adUnderscoreaccountUnderscoreid, clickUnderscorewindowUnderscoredays, engagementUnderscorewindowUnderscoredays, viewUnderscorewindowUnderscoredays, conversionUnderscorereportUnderscoretime, aggregateUnderscorereportUnderscorerows, reportingUnderscoretimezone }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoredate,
        endUnderscoredate,
        campaignUnderscoreids,
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
* Create campaigns
* Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* campaignCreateItem List 
* returns CampaignBatchWriteResponseModel
* */
const campaigns/create = ({ adUnderscoreaccountUnderscoreid, campaignCreateItem }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        campaignCreateItem,
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
* Get campaign
* Get a specific campaign given the campaign ID.
*
* campaignUnderscoreid String Campaign ID, must be associated with the ad account ID provided in the path.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns Campaign
* */
const campaigns/get = ({ campaignUnderscoreid, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignUnderscoreid,
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
* List campaigns
* Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* campaignUnderscoreids List List of Campaign Ids to use to filter the results. (optional)
* entityUnderscorestatuses List Entity status (optional)
* returns campaigns_list_200_response
* */
const campaigns/list = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order, campaignUnderscoreids, entityUnderscorestatuses }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bookmark,
        pageUnderscoresize,
        order,
        campaignUnderscoreids,
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
* Update campaigns
* Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* campaignBatchUpdateItem List 
* returns CampaignBatchWriteResponseModel
* */
const campaigns/update = ({ adUnderscoreaccountUnderscoreid, campaignBatchUpdateItem }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        campaignBatchUpdateItem,
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
* Get campaign delivery estimates
* Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* campaignDeliveryEstimatesCampaign List 
* returns CampaignDeliveryEstimatesResponse
* */
const get_campaign_delivery_estimates = ({ adUnderscoreaccountUnderscoreid, campaignDeliveryEstimatesCampaign }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        campaignDeliveryEstimatesCampaign,
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
  ad_pins/analytics,
  campaign_targeting_analytics/get,
  campaigns/analytics,
  campaigns/create,
  campaigns/get,
  campaigns/list,
  campaigns/update,
  get_campaign_delivery_estimates,
};
