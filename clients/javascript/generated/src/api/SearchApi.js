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
import PinsList200Response from '../model/PinsList200Response';
import SearchPartnerPins200Response from '../model/SearchPartnerPins200Response';
import SearchUserBoardsGet200Response from '../model/SearchUserBoardsGet200Response';

/**
* Search service.
* @module api/SearchApi
* @version 1.1.1-pre.0
*/
export default class SearchApi {

    /**
    * Constructs a new SearchApi. 
    * @alias module:api/SearchApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the searchPartnerPins operation.
     * @callback module:api/SearchApi~searchPartnerPinsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SearchPartnerPins200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Search pins by a given search term
     * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
     * @param {String} term Search term to look up pins.
     * @param {String} countryCode Two letter country code (ISO 3166-1 alpha-2)
     * @param {Object} opts Optional parameters
     * @param {String} [bookmark] Cursor used to fetch the next page of items
     * @param {String} [locale] Search locale.
     * @param {Number} [limit = 10)] Max search result size
     * @param {module:api/SearchApi~searchPartnerPinsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SearchPartnerPins200Response}
     */
    searchPartnerPins(term, countryCode, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'term' is set
      if (term === undefined || term === null) {
        throw new Error("Missing the required parameter 'term' when calling searchPartnerPins");
      }
      // verify the required parameter 'countryCode' is set
      if (countryCode === undefined || countryCode === null) {
        throw new Error("Missing the required parameter 'countryCode' when calling searchPartnerPins");
      }

      let pathParams = {
      };
      let queryParams = {
        'term': term,
        'country_code': countryCode,
        'bookmark': opts['bookmark'],
        'locale': opts['locale'],
        'limit': opts['limit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = SearchPartnerPins200Response;
      return this.apiClient.callApi(
        '/search/partner/pins', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the searchUserBoardsGet operation.
     * @callback module:api/SearchApi~searchUserBoardsGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SearchUserBoardsGet200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Search user's boards
     * Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
     * @param {Object} opts Optional parameters
     * @param {String} [adAccountId] Unique identifier of an ad account.
     * @param {String} [bookmark] Cursor used to fetch the next page of items
     * @param {Number} [pageSize = 25)] Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
     * @param {String} [query] Search query. Can contain pin description keywords or comma-separated pin IDs.
     * @param {module:api/SearchApi~searchUserBoardsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SearchUserBoardsGet200Response}
     */
    searchUserBoardsGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ad_account_id': opts['adAccountId'],
        'bookmark': opts['bookmark'],
        'page_size': opts['pageSize'],
        'query': opts['query']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2', 'client_credentials'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = SearchUserBoardsGet200Response;
      return this.apiClient.callApi(
        '/search/boards', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the searchUserPinsList operation.
     * @callback module:api/SearchApi~searchUserPinsListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PinsList200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Search user's Pins
     * Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
     * @param {String} query Search query. Can contain pin description keywords or comma-separated pin IDs.
     * @param {Object} opts Optional parameters
     * @param {String} [adAccountId] Unique identifier of an ad account.
     * @param {String} [bookmark] Cursor used to fetch the next page of items
     * @param {module:api/SearchApi~searchUserPinsListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PinsList200Response}
     */
    searchUserPinsList(query, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'query' is set
      if (query === undefined || query === null) {
        throw new Error("Missing the required parameter 'query' when calling searchUserPinsList");
      }

      let pathParams = {
      };
      let queryParams = {
        'ad_account_id': opts['adAccountId'],
        'query': query,
        'bookmark': opts['bookmark']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = PinsList200Response;
      return this.apiClient.callApi(
        '/search/pins', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
