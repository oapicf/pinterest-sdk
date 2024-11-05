/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create product group promotions
* Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* productGroupPromotionCreateRequest ProductGroupPromotionCreateRequest List of Product Group Promotions to create, size limit [1, 30].
* returns ProductGroupPromotionResponse
* */
const product_group_promotions/create = ({ adUnderscoreaccountUnderscoreid, productGroupPromotionCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        productGroupPromotionCreateRequest,
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
* Get a product group promotion by id
* Get a product group promotion by id
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* productUnderscoregroupUnderscorepromotionUnderscoreid String Unique identifier of a product group promotion
* returns ProductGroupPromotionResponse
* */
const product_group_promotions/get = ({ adUnderscoreaccountUnderscoreid, productUnderscoregroupUnderscorepromotionUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        productUnderscoregroupUnderscorepromotionUnderscoreid,
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
* Get product group promotions
* List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* productUnderscoregroupUnderscorepromotionUnderscoreids List List of Product group promotion Ids. (optional)
* entityUnderscorestatuses List Entity status (optional)
* adUnderscoregroupUnderscoreid String Ad group Id. (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* order String The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns product_group_promotions_list_200_response
* */
const product_group_promotions/list = ({ adUnderscoreaccountUnderscoreid, productUnderscoregroupUnderscorepromotionUnderscoreids, entityUnderscorestatuses, adUnderscoregroupUnderscoreid, pageUnderscoresize, order, bookmark }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        productUnderscoregroupUnderscorepromotionUnderscoreids,
        entityUnderscorestatuses,
        adUnderscoregroupUnderscoreid,
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
* Update product group promotions
* Update multiple existing Product Group Promotions (by product_group_id)
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* productGroupPromotionUpdateRequest ProductGroupPromotionUpdateRequest Parameters to update Product group promotions
* returns ProductGroupPromotionResponse
* */
const product_group_promotions/update = ({ adUnderscoreaccountUnderscoreid, productGroupPromotionUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        productGroupPromotionUpdateRequest,
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
* Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* productUnderscoregroupUnderscoreids List List of Product group Ids to use to filter the results.
* columns List Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
* granularity Granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
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
  product_group_promotions/create,
  product_group_promotions/get,
  product_group_promotions/list,
  product_group_promotions/update,
  product_groups/analytics,
};
