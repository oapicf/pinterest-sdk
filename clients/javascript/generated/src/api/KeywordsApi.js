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
import Error from '../model/Error';
import KeywordUpdateBody from '../model/KeywordUpdateBody';
import KeywordsGet200Response from '../model/KeywordsGet200Response';
import KeywordsMetricsArrayResponse from '../model/KeywordsMetricsArrayResponse';
import KeywordsRequest from '../model/KeywordsRequest';
import KeywordsResponse from '../model/KeywordsResponse';
import MatchType from '../model/MatchType';
import TrendType from '../model/TrendType';
import TrendingKeywordsResponse from '../model/TrendingKeywordsResponse';
import TrendsSupportedRegion from '../model/TrendsSupportedRegion';

/**
* Keywords service.
* @module api/KeywordsApi
* @version 1.1.1-pre.0
*/
export default class KeywordsApi {

    /**
    * Constructs a new KeywordsApi. 
    * @alias module:api/KeywordsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the countryKeywordsMetricsGet operation.
     * @callback module:api/KeywordsApi~countryKeywordsMetricsGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/KeywordsMetricsArrayResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get country's keyword metrics
     * See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {String} countryCode Two letter country code (ISO 3166-1 alpha-2)
     * @param {Array.<String>} keywords Comma-separated keywords
     * @param {module:api/KeywordsApi~countryKeywordsMetricsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/KeywordsMetricsArrayResponse}
     */
    countryKeywordsMetricsGet(adAccountId, countryCode, keywords, callback) {
      let postBody = null;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling countryKeywordsMetricsGet");
      }
      // verify the required parameter 'countryCode' is set
      if (countryCode === undefined || countryCode === null) {
        throw new Error("Missing the required parameter 'countryCode' when calling countryKeywordsMetricsGet");
      }
      // verify the required parameter 'keywords' is set
      if (keywords === undefined || keywords === null) {
        throw new Error("Missing the required parameter 'keywords' when calling countryKeywordsMetricsGet");
      }

      let pathParams = {
        'ad_account_id': adAccountId
      };
      let queryParams = {
        'country_code': countryCode,
        'keywords': this.apiClient.buildCollectionParam(keywords, 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = KeywordsMetricsArrayResponse;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/keywords/metrics', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the keywordsCreate operation.
     * @callback module:api/KeywordsApi~keywordsCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/KeywordsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create keywords
     * <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/reference/rate-limits/\">WRITE</a>.</p>
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {module:model/KeywordsRequest} keywordsRequest 
     * @param {module:api/KeywordsApi~keywordsCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/KeywordsResponse}
     */
    keywordsCreate(adAccountId, keywordsRequest, callback) {
      let postBody = keywordsRequest;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling keywordsCreate");
      }
      // verify the required parameter 'keywordsRequest' is set
      if (keywordsRequest === undefined || keywordsRequest === null) {
        throw new Error("Missing the required parameter 'keywordsRequest' when calling keywordsCreate");
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
      let returnType = KeywordsResponse;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/keywords', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the keywordsGet operation.
     * @callback module:api/KeywordsApi~keywordsGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/KeywordsGet200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get keywords
     * <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {Object} opts Optional parameters
     * @param {String} [campaignId] Campaign Id to use to filter the results.
     * @param {String} [adGroupId] Ad group Id.
     * @param {Array.<module:model/MatchType>} [matchTypes] Keyword <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type</a>
     * @param {Number} [pageSize = 25)] Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
     * @param {String} [bookmark] Cursor used to fetch the next page of items
     * @param {module:api/KeywordsApi~keywordsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/KeywordsGet200Response}
     */
    keywordsGet(adAccountId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling keywordsGet");
      }

      let pathParams = {
        'ad_account_id': adAccountId
      };
      let queryParams = {
        'campaign_id': opts['campaignId'],
        'ad_group_id': opts['adGroupId'],
        'match_types': this.apiClient.buildCollectionParam(opts['matchTypes'], 'multi'),
        'page_size': opts['pageSize'],
        'bookmark': opts['bookmark']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = KeywordsGet200Response;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/keywords', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the keywordsUpdate operation.
     * @callback module:api/KeywordsApi~keywordsUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/KeywordsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update keywords
     * <p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {module:model/KeywordUpdateBody} keywordUpdateBody 
     * @param {module:api/KeywordsApi~keywordsUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/KeywordsResponse}
     */
    keywordsUpdate(adAccountId, keywordUpdateBody, callback) {
      let postBody = keywordUpdateBody;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling keywordsUpdate");
      }
      // verify the required parameter 'keywordUpdateBody' is set
      if (keywordUpdateBody === undefined || keywordUpdateBody === null) {
        throw new Error("Missing the required parameter 'keywordUpdateBody' when calling keywordsUpdate");
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
      let returnType = KeywordsResponse;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/keywords', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the trendingKeywordsList operation.
     * @callback module:api/KeywordsApi~trendingKeywordsListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TrendingKeywordsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List trending keywords
     * <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>. 
     * @param {module:model/TrendsSupportedRegion} region The geographic region of interest. Only top trends within the specified region will be returned.<br /> The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas: - `US` - United States - `CA` - Canada - `DE` - Germany - `FR` - France - `ES` - Spain - `IT` - Italy - `DE+AT+CH` - Germanic countries - `GB+IE` - Great Britain & Ireland - `IT+ES+PT+GR+MT` - Southern Europe - `PL+RO+HU+SK+CZ` - Eastern Europe - `SE+DK+FI+NO` - Nordic countries - `NL+BE+LU` - Benelux - `AR` - Argentina - `BR` - Brazil - `CO` - Colombia - `MX` - Mexico - `MX+AR+CO+CL` - Hispanic LatAm - `AU+NZ` - Australasia
     * @param {module:model/TrendType} trendType The methodology used to rank how trendy a keyword is. - `growing` trends have high upward growth in search volume over the last quarter - `monthly` trends have high search volume in the last month - `yearly` trends have high search volume in the last year - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} [interests] If set, filters the results to trends associated with the specified interests.<br /> If unset, trends for all interests will be returned.<br /> The list of supported interests is: - `animals` - Animals - `architecture` - Architecture - `art` - Art - `beauty` - Beauty - `childrens_fashion` - Children's Fashion - `design` - Design - `diy_and_crafts` - DIY & Crafts - `education` - Education - `electronics` - Electronics - `entertainment` - Entertainment - `event_planning` - Event Planning - `finance` - Finance - `food_and_drinks` - Food & Drink - `gardening` - Gardening - `health` - Health - `home_decor` - Home Decor - `mens_fashion` - Men's Fashion - `parenting` - Parenting - `quotes` - Quotes - `sport` - Sports - `travel` - Travel - `vehicles` - Vehicles - `wedding` - Wedding - `womens_fashion` - Women's Fashion
     * @param {Array.<module:model/String>} [genders] If set, filters the results to trends among users who identify with the specified gender(s).<br /> If unset, trends among all genders will be returned.<br /> The `unknown` group includes users with unspecified or customized gender profile settings.
     * @param {Array.<module:model/String>} [ages] If set, filters the results to trends among users in the specified age range(s).<br /> If unset, trends among all age groups will be returned.
     * @param {Array.<String>} [includeKeywords] If set, filters the results to top trends which include at least one of the specified keywords.<br /> If unset, no keyword filtering logic is applied.
     * @param {Boolean} [normalizeAgainstGroup = false)] Governs how the resulting time series data will be normalized to a [0-100] scale.<br /> By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br /> If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
     * @param {Number} [limit = 50)] The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.
     * @param {module:api/KeywordsApi~trendingKeywordsListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TrendingKeywordsResponse}
     */
    trendingKeywordsList(region, trendType, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'region' is set
      if (region === undefined || region === null) {
        throw new Error("Missing the required parameter 'region' when calling trendingKeywordsList");
      }
      // verify the required parameter 'trendType' is set
      if (trendType === undefined || trendType === null) {
        throw new Error("Missing the required parameter 'trendType' when calling trendingKeywordsList");
      }

      let pathParams = {
        'region': region,
        'trend_type': trendType
      };
      let queryParams = {
        'interests': this.apiClient.buildCollectionParam(opts['interests'], 'multi'),
        'genders': this.apiClient.buildCollectionParam(opts['genders'], 'multi'),
        'ages': this.apiClient.buildCollectionParam(opts['ages'], 'multi'),
        'include_keywords': this.apiClient.buildCollectionParam(opts['includeKeywords'], 'multi'),
        'normalize_against_group': opts['normalizeAgainstGroup'],
        'limit': opts['limit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = TrendingKeywordsResponse;
      return this.apiClient.callApi(
        '/trends/keywords/{region}/top/{trend_type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
