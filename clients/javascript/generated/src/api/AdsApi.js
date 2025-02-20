/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import AdArrayResponse from '../model/AdArrayResponse';
import AdCreateRequest from '../model/AdCreateRequest';
import AdPreviewRequest from '../model/AdPreviewRequest';
import AdPreviewURLResponse from '../model/AdPreviewURLResponse';
import AdResponse from '../model/AdResponse';
import AdUpdateRequest from '../model/AdUpdateRequest';
import AdsAnalyticsAdTargetingType from '../model/AdsAnalyticsAdTargetingType';
import AdsAnalyticsResponseInner from '../model/AdsAnalyticsResponseInner';
import AdsList200Response from '../model/AdsList200Response';
import ConversionReportAttributionType from '../model/ConversionReportAttributionType';
import Error from '../model/Error';
import Granularity from '../model/Granularity';
import MetricsResponse from '../model/MetricsResponse';

/**
* Ads service.
* @module api/AdsApi
* @version 1.1.1-pre.0
*/
export default class AdsApi {

    /**
    * Constructs a new AdsApi. 
    * @alias module:api/AdsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the adPreviewsCreate operation.
     * @callback module:api/AdsApi~adPreviewsCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AdPreviewURLResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create ad preview with pin or image
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {module:model/AdPreviewRequest} adPreviewRequest Create ad preview with pin or image.
     * @param {module:api/AdsApi~adPreviewsCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AdPreviewURLResponse}
     */
    adPreviewsCreate(adAccountId, adPreviewRequest, callback) {
      let postBody = adPreviewRequest;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling adPreviewsCreate");
      }
      // verify the required parameter 'adPreviewRequest' is set
      if (adPreviewRequest === undefined || adPreviewRequest === null) {
        throw new Error("Missing the required parameter 'adPreviewRequest' when calling adPreviewsCreate");
      }

      let pathParams = {
        'ad_account_id': adAccountId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = AdPreviewURLResponse;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/ad_previews', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the adTargetingAnalyticsGet operation.
     * @callback module:api/AdsApi~adTargetingAnalyticsGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MetricsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get targeting analytics for ads
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {Array.<String>} adIds List of Ad Ids to use to filter the results.
     * @param {Date} startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param {Date} endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param {Array.<module:model/AdsAnalyticsAdTargetingType>} targetingTypes Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
     * @param {Array.<module:model/String>} columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
     * @param {module:model/Granularity} granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
     * @param {Object} opts Optional parameters
     * @param {module:model/Number} [clickWindowDays = 30)] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
     * @param {module:model/Number} [engagementWindowDays = 30)] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
     * @param {module:model/Number} [viewWindowDays = 1)] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
     * @param {module:model/String} [conversionReportTime = 'TIME_OF_AD_ACTION')] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @param {module:model/ConversionReportAttributionType} [attributionTypes] List of types of attribution for the conversion report
     * @param {module:api/AdsApi~adTargetingAnalyticsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/MetricsResponse}
     */
    adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling adTargetingAnalyticsGet");
      }
      // verify the required parameter 'adIds' is set
      if (adIds === undefined || adIds === null) {
        throw new Error("Missing the required parameter 'adIds' when calling adTargetingAnalyticsGet");
      }
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling adTargetingAnalyticsGet");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling adTargetingAnalyticsGet");
      }
      // verify the required parameter 'targetingTypes' is set
      if (targetingTypes === undefined || targetingTypes === null) {
        throw new Error("Missing the required parameter 'targetingTypes' when calling adTargetingAnalyticsGet");
      }
      // verify the required parameter 'columns' is set
      if (columns === undefined || columns === null) {
        throw new Error("Missing the required parameter 'columns' when calling adTargetingAnalyticsGet");
      }
      // verify the required parameter 'granularity' is set
      if (granularity === undefined || granularity === null) {
        throw new Error("Missing the required parameter 'granularity' when calling adTargetingAnalyticsGet");
      }

      let pathParams = {
        'ad_account_id': adAccountId
      };
      let queryParams = {
        'ad_ids': this.apiClient.buildCollectionParam(adIds, 'multi'),
        'start_date': startDate,
        'end_date': endDate,
        'targeting_types': this.apiClient.buildCollectionParam(targetingTypes, 'csv'),
        'columns': this.apiClient.buildCollectionParam(columns, 'csv'),
        'granularity': granularity,
        'click_window_days': opts['clickWindowDays'],
        'engagement_window_days': opts['engagementWindowDays'],
        'view_window_days': opts['viewWindowDays'],
        'conversion_report_time': opts['conversionReportTime'],
        'attribution_types': opts['attributionTypes']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = MetricsResponse;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/ads/targeting_analytics', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the adsAnalytics operation.
     * @callback module:api/AdsApi~adsAnalyticsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/AdsAnalyticsResponseInner>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get ad analytics
     * Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - The request must contain either ad_ids or both campaign_ids and pin_ids. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {Date} startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param {Date} endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param {Array.<module:model/String>} columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
     * @param {module:model/Granularity} granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} [adIds] List of Ad Ids to use to filter the results.
     * @param {module:model/Number} [clickWindowDays = 30)] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
     * @param {module:model/Number} [engagementWindowDays = 30)] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
     * @param {module:model/Number} [viewWindowDays = 1)] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
     * @param {module:model/String} [conversionReportTime = 'TIME_OF_AD_ACTION')] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @param {Array.<String>} [pinIds] List of Pin IDs.
     * @param {Array.<String>} [campaignIds] List of Campaign Ids to use to filter the results.
     * @param {module:api/AdsApi~adsAnalyticsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/AdsAnalyticsResponseInner>}
     */
    adsAnalytics(adAccountId, startDate, endDate, columns, granularity, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling adsAnalytics");
      }
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling adsAnalytics");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling adsAnalytics");
      }
      // verify the required parameter 'columns' is set
      if (columns === undefined || columns === null) {
        throw new Error("Missing the required parameter 'columns' when calling adsAnalytics");
      }
      // verify the required parameter 'granularity' is set
      if (granularity === undefined || granularity === null) {
        throw new Error("Missing the required parameter 'granularity' when calling adsAnalytics");
      }

      let pathParams = {
        'ad_account_id': adAccountId
      };
      let queryParams = {
        'start_date': startDate,
        'end_date': endDate,
        'ad_ids': this.apiClient.buildCollectionParam(opts['adIds'], 'multi'),
        'columns': this.apiClient.buildCollectionParam(columns, 'csv'),
        'granularity': granularity,
        'click_window_days': opts['clickWindowDays'],
        'engagement_window_days': opts['engagementWindowDays'],
        'view_window_days': opts['viewWindowDays'],
        'conversion_report_time': opts['conversionReportTime'],
        'pin_ids': this.apiClient.buildCollectionParam(opts['pinIds'], 'multi'),
        'campaign_ids': this.apiClient.buildCollectionParam(opts['campaignIds'], 'multi')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [AdsAnalyticsResponseInner];
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/ads/analytics', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the adsCreate operation.
     * @callback module:api/AdsApi~adsCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AdArrayResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create ads
     * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {Array.<module:model/AdCreateRequest>} adCreateRequest List of ads to create, size limit [1, 30].
     * @param {module:api/AdsApi~adsCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AdArrayResponse}
     */
    adsCreate(adAccountId, adCreateRequest, callback) {
      let postBody = adCreateRequest;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling adsCreate");
      }
      // verify the required parameter 'adCreateRequest' is set
      if (adCreateRequest === undefined || adCreateRequest === null) {
        throw new Error("Missing the required parameter 'adCreateRequest' when calling adsCreate");
      }

      let pathParams = {
        'ad_account_id': adAccountId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = AdArrayResponse;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/ads', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the adsGet operation.
     * @callback module:api/AdsApi~adsGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AdResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get ad
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {String} adId Unique identifier of an ad.
     * @param {module:api/AdsApi~adsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AdResponse}
     */
    adsGet(adAccountId, adId, callback) {
      let postBody = null;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling adsGet");
      }
      // verify the required parameter 'adId' is set
      if (adId === undefined || adId === null) {
        throw new Error("Missing the required parameter 'adId' when calling adsGet");
      }

      let pathParams = {
        'ad_account_id': adAccountId,
        'ad_id': adId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = AdResponse;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/ads/{ad_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the adsList operation.
     * @callback module:api/AdsApi~adsListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AdsList200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List ads
     * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} [campaignIds] List of Campaign Ids to use to filter the results.
     * @param {Array.<String>} [adGroupIds] List of Ad group Ids to use to filter the results.
     * @param {Array.<String>} [adIds] List of Ad Ids to use to filter the results.
     * @param {Array.<module:model/String>} [entityStatuses] Entity status
     * @param {Number} [pageSize = 25)] Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
     * @param {module:model/String} [order] The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param {String} [bookmark] Cursor used to fetch the next page of items
     * @param {module:api/AdsApi~adsListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AdsList200Response}
     */
    adsList(adAccountId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling adsList");
      }

      let pathParams = {
        'ad_account_id': adAccountId
      };
      let queryParams = {
        'campaign_ids': this.apiClient.buildCollectionParam(opts['campaignIds'], 'multi'),
        'ad_group_ids': this.apiClient.buildCollectionParam(opts['adGroupIds'], 'multi'),
        'ad_ids': this.apiClient.buildCollectionParam(opts['adIds'], 'multi'),
        'entity_statuses': this.apiClient.buildCollectionParam(opts['entityStatuses'], 'multi'),
        'page_size': opts['pageSize'],
        'order': opts['order'],
        'bookmark': opts['bookmark']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = AdsList200Response;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/ads', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the adsUpdate operation.
     * @callback module:api/AdsApi~adsUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AdArrayResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update ads
     * Update multiple existing ads
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {Array.<module:model/AdUpdateRequest>} adUpdateRequest List of ads to update, size limit [1, 30]
     * @param {module:api/AdsApi~adsUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AdArrayResponse}
     */
    adsUpdate(adAccountId, adUpdateRequest, callback) {
      let postBody = adUpdateRequest;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling adsUpdate");
      }
      // verify the required parameter 'adUpdateRequest' is set
      if (adUpdateRequest === undefined || adUpdateRequest === null) {
        throw new Error("Missing the required parameter 'adUpdateRequest' when calling adsUpdate");
      }

      let pathParams = {
        'ad_account_id': adAccountId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = AdArrayResponse;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/ads', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
