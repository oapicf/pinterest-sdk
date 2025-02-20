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
import Account from '../model/Account';
import AnalyticsMetricsResponse from '../model/AnalyticsMetricsResponse';
import BoardsUserFollowsList200Response from '../model/BoardsUserFollowsList200Response';
import Error from '../model/Error';
import FollowUserRequest from '../model/FollowUserRequest';
import FollowersList200Response from '../model/FollowersList200Response';
import LinkedBusiness from '../model/LinkedBusiness';
import TopPinsAnalyticsResponse from '../model/TopPinsAnalyticsResponse';
import TopVideoPinsAnalyticsResponse from '../model/TopVideoPinsAnalyticsResponse';
import UserAccountFollowedInterests200Response from '../model/UserAccountFollowedInterests200Response';
import UserFollowingFeedType from '../model/UserFollowingFeedType';
import UserFollowingGet200Response from '../model/UserFollowingGet200Response';
import UserSummary from '../model/UserSummary';
import UserWebsiteSummary from '../model/UserWebsiteSummary';
import UserWebsiteVerificationCode from '../model/UserWebsiteVerificationCode';
import UserWebsiteVerifyRequest from '../model/UserWebsiteVerifyRequest';
import UserWebsitesGet200Response from '../model/UserWebsitesGet200Response';

/**
* UserAccount service.
* @module api/UserAccountApi
* @version 1.1.1-pre.0
*/
export default class UserAccountApi {

    /**
    * Constructs a new UserAccountApi. 
    * @alias module:api/UserAccountApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the boardsUserFollowsList operation.
     * @callback module:api/UserAccountApi~boardsUserFollowsListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BoardsUserFollowsList200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List following boards
     * Get a list of the boards a user follows. The request returns a board summary object array.
     * @param {Object} opts Optional parameters
     * @param {String} [bookmark] Cursor used to fetch the next page of items
     * @param {Number} [pageSize = 25)] Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
     * @param {Boolean} [explicitFollowing = false)] Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
     * @param {String} [adAccountId] Unique identifier of an ad account.
     * @param {module:api/UserAccountApi~boardsUserFollowsListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BoardsUserFollowsList200Response}
     */
    boardsUserFollowsList(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'bookmark': opts['bookmark'],
        'page_size': opts['pageSize'],
        'explicit_following': opts['explicitFollowing'],
        'ad_account_id': opts['adAccountId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2', 'client_credentials'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = BoardsUserFollowsList200Response;
      return this.apiClient.callApi(
        '/user_account/following/boards', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the followUserUpdate operation.
     * @callback module:api/UserAccountApi~followUserUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserSummary} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Follow user
     * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
     * @param {String} username A valid username
     * @param {module:model/FollowUserRequest} followUserRequest Follow a user.
     * @param {module:api/UserAccountApi~followUserUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserSummary}
     */
    followUserUpdate(username, followUserRequest, callback) {
      let postBody = followUserRequest;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling followUserUpdate");
      }
      // verify the required parameter 'followUserRequest' is set
      if (followUserRequest === undefined || followUserRequest === null) {
        throw new Error("Missing the required parameter 'followUserRequest' when calling followUserUpdate");
      }

      let pathParams = {
        'username': username
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
      let returnType = UserSummary;
      return this.apiClient.callApi(
        '/user_account/following/{username}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the followersList operation.
     * @callback module:api/UserAccountApi~followersListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/FollowersList200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List followers
     * Get a list of your followers.
     * @param {Object} opts Optional parameters
     * @param {String} [bookmark] Cursor used to fetch the next page of items
     * @param {Number} [pageSize = 25)] Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
     * @param {module:api/UserAccountApi~followersListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FollowersList200Response}
     */
    followersList(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'bookmark': opts['bookmark'],
        'page_size': opts['pageSize']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2', 'client_credentials'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = FollowersList200Response;
      return this.apiClient.callApi(
        '/user_account/followers', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the linkedBusinessAccountsGet operation.
     * @callback module:api/UserAccountApi~linkedBusinessAccountsGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/LinkedBusiness>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List linked businesses
     * Get a list of your linked business accounts.
     * @param {module:api/UserAccountApi~linkedBusinessAccountsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/LinkedBusiness>}
     */
    linkedBusinessAccountsGet(callback) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2', 'client_credentials'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [LinkedBusiness];
      return this.apiClient.callApi(
        '/user_account/businesses', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the unverifyWebsiteDelete operation.
     * @callback module:api/UserAccountApi~unverifyWebsiteDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Unverify website
     * Unverifu a website verified by the signed-in user.
     * @param {String} website Website with path or domain only
     * @param {module:api/UserAccountApi~unverifyWebsiteDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    unverifyWebsiteDelete(website, callback) {
      let postBody = null;
      // verify the required parameter 'website' is set
      if (website === undefined || website === null) {
        throw new Error("Missing the required parameter 'website' when calling unverifyWebsiteDelete");
      }

      let pathParams = {
      };
      let queryParams = {
        'website': website
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = null;
      return this.apiClient.callApi(
        '/user_account/websites', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the userAccountAnalytics operation.
     * @callback module:api/UserAccountApi~userAccountAnalyticsCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, module:model/{String: AnalyticsMetricsResponse}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get user account analytics
     * Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * @param {Date} startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param {Date} endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param {Object} opts Optional parameters
     * @param {module:model/String} [fromClaimedContent = 'BOTH')] Filter on Pins that match your claimed domain.
     * @param {module:model/String} [pinFormat = 'ALL')] Pin formats to get data for, default is all.
     * @param {module:model/String} [appTypes = 'ALL')] Apps or devices to get data for, default is all.
     * @param {module:model/String} [contentType = 'ALL')] Filter to paid or organic data. Default is all.
     * @param {module:model/String} [source = 'ALL')] Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @param {Array.<module:model/String>} [metricTypes] Metric types to get data for, default is all. 
     * @param {module:model/String} [splitField = 'NO_SPLIT')] How to split the data into groups. Not including this param means data won't be split.
     * @param {String} [adAccountId] Unique identifier of an ad account.
     * @param {module:api/UserAccountApi~userAccountAnalyticsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, module:model/{String: AnalyticsMetricsResponse}>}
     */
    userAccountAnalytics(startDate, endDate, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling userAccountAnalytics");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling userAccountAnalytics");
      }

      let pathParams = {
      };
      let queryParams = {
        'start_date': startDate,
        'end_date': endDate,
        'from_claimed_content': opts['fromClaimedContent'],
        'pin_format': opts['pinFormat'],
        'app_types': opts['appTypes'],
        'content_type': opts['contentType'],
        'source': opts['source'],
        'metric_types': this.apiClient.buildCollectionParam(opts['metricTypes'], 'csv'),
        'split_field': opts['splitField'],
        'ad_account_id': opts['adAccountId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = {'String': AnalyticsMetricsResponse};
      return this.apiClient.callApi(
        '/user_account/analytics', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the userAccountAnalyticsTopPins operation.
     * @callback module:api/UserAccountApi~userAccountAnalyticsTopPinsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TopPinsAnalyticsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get user account top pins analytics
     * Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * @param {Date} startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param {Date} endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param {module:model/String} sortBy Specify sorting order for metrics
     * @param {Object} opts Optional parameters
     * @param {module:model/String} [fromClaimedContent = 'BOTH')] Filter on Pins that match your claimed domain.
     * @param {module:model/String} [pinFormat = 'ALL')] Pin formats to get data for, default is all.
     * @param {module:model/String} [appTypes = 'ALL')] Apps or devices to get data for, default is all.
     * @param {module:model/String} [contentType = 'ALL')] Filter to paid or organic data. Default is all.
     * @param {module:model/String} [source = 'ALL')] Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @param {Array.<module:model/String>} [metricTypes] Metric types to get data for, default is all. 
     * @param {Number} [numOfPins = 10)] Number of pins to include, default is 10. Max is 50.
     * @param {module:model/Number} [createdInLastNDays] Get metrics for pins created in the last \"n\" days.
     * @param {String} [adAccountId] Unique identifier of an ad account.
     * @param {module:api/UserAccountApi~userAccountAnalyticsTopPinsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TopPinsAnalyticsResponse}
     */
    userAccountAnalyticsTopPins(startDate, endDate, sortBy, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling userAccountAnalyticsTopPins");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling userAccountAnalyticsTopPins");
      }
      // verify the required parameter 'sortBy' is set
      if (sortBy === undefined || sortBy === null) {
        throw new Error("Missing the required parameter 'sortBy' when calling userAccountAnalyticsTopPins");
      }

      let pathParams = {
      };
      let queryParams = {
        'start_date': startDate,
        'end_date': endDate,
        'sort_by': sortBy,
        'from_claimed_content': opts['fromClaimedContent'],
        'pin_format': opts['pinFormat'],
        'app_types': opts['appTypes'],
        'content_type': opts['contentType'],
        'source': opts['source'],
        'metric_types': this.apiClient.buildCollectionParam(opts['metricTypes'], 'csv'),
        'num_of_pins': opts['numOfPins'],
        'created_in_last_n_days': opts['createdInLastNDays'],
        'ad_account_id': opts['adAccountId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2', 'client_credentials'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = TopPinsAnalyticsResponse;
      return this.apiClient.callApi(
        '/user_account/analytics/top_pins', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the userAccountAnalyticsTopVideoPins operation.
     * @callback module:api/UserAccountApi~userAccountAnalyticsTopVideoPinsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TopVideoPinsAnalyticsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get user account top video pins analytics
     * Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * @param {Date} startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param {Date} endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param {module:model/String} sortBy Specify sorting order for video metrics
     * @param {Object} opts Optional parameters
     * @param {module:model/String} [fromClaimedContent = 'BOTH')] Filter on Pins that match your claimed domain.
     * @param {module:model/String} [pinFormat = 'ALL')] Pin formats to get data for, default is all.
     * @param {module:model/String} [appTypes = 'ALL')] Apps or devices to get data for, default is all.
     * @param {module:model/String} [contentType = 'ALL')] Filter to paid or organic data. Default is all.
     * @param {module:model/String} [source = 'ALL')] Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @param {Array.<module:model/String>} [metricTypes] Metric types to get video data for, default is all. 
     * @param {Number} [numOfPins = 10)] Number of pins to include, default is 10. Max is 50.
     * @param {module:model/Number} [createdInLastNDays] Get metrics for pins created in the last \"n\" days.
     * @param {String} [adAccountId] Unique identifier of an ad account.
     * @param {module:api/UserAccountApi~userAccountAnalyticsTopVideoPinsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TopVideoPinsAnalyticsResponse}
     */
    userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling userAccountAnalyticsTopVideoPins");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling userAccountAnalyticsTopVideoPins");
      }
      // verify the required parameter 'sortBy' is set
      if (sortBy === undefined || sortBy === null) {
        throw new Error("Missing the required parameter 'sortBy' when calling userAccountAnalyticsTopVideoPins");
      }

      let pathParams = {
      };
      let queryParams = {
        'start_date': startDate,
        'end_date': endDate,
        'sort_by': sortBy,
        'from_claimed_content': opts['fromClaimedContent'],
        'pin_format': opts['pinFormat'],
        'app_types': opts['appTypes'],
        'content_type': opts['contentType'],
        'source': opts['source'],
        'metric_types': this.apiClient.buildCollectionParam(opts['metricTypes'], 'csv'),
        'num_of_pins': opts['numOfPins'],
        'created_in_last_n_days': opts['createdInLastNDays'],
        'ad_account_id': opts['adAccountId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2', 'client_credentials'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = TopVideoPinsAnalyticsResponse;
      return this.apiClient.callApi(
        '/user_account/analytics/top_video_pins', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the userAccountFollowedInterests operation.
     * @callback module:api/UserAccountApi~userAccountFollowedInterestsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserAccountFollowedInterests200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List following interests
     * Get a list of a user's following interests in one place.
     * @param {String} username A valid username
     * @param {Object} opts Optional parameters
     * @param {String} [bookmark] Cursor used to fetch the next page of items
     * @param {Number} [pageSize = 25)] Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
     * @param {module:api/UserAccountApi~userAccountFollowedInterestsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserAccountFollowedInterests200Response}
     */
    userAccountFollowedInterests(username, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling userAccountFollowedInterests");
      }

      let pathParams = {
        'username': username
      };
      let queryParams = {
        'bookmark': opts['bookmark'],
        'page_size': opts['pageSize']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2', 'client_credentials'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = UserAccountFollowedInterests200Response;
      return this.apiClient.callApi(
        '/users/{username}/interests/follow', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the userAccountGet operation.
     * @callback module:api/UserAccountApi~userAccountGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Account} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get user account
     * Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
     * @param {Object} opts Optional parameters
     * @param {String} [adAccountId] Unique identifier of an ad account.
     * @param {module:api/UserAccountApi~userAccountGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Account}
     */
    userAccountGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ad_account_id': opts['adAccountId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2', 'client_credentials'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Account;
      return this.apiClient.callApi(
        '/user_account', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the userFollowingGet operation.
     * @callback module:api/UserAccountApi~userFollowingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserFollowingGet200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List following
     * Get a list of who a certain user follows.
     * @param {Object} opts Optional parameters
     * @param {String} [bookmark] Cursor used to fetch the next page of items
     * @param {Number} [pageSize = 25)] Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
     * @param {module:model/UserFollowingFeedType} [feedType] Thrift param specifying what type of followees will be kept. Default to include all followees.
     * @param {Boolean} [explicitFollowing = false)] Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
     * @param {String} [adAccountId] Unique identifier of an ad account.
     * @param {module:api/UserAccountApi~userFollowingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserFollowingGet200Response}
     */
    userFollowingGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'bookmark': opts['bookmark'],
        'page_size': opts['pageSize'],
        'feed_type': opts['feedType'],
        'explicit_following': opts['explicitFollowing'],
        'ad_account_id': opts['adAccountId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2', 'client_credentials'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = UserFollowingGet200Response;
      return this.apiClient.callApi(
        '/user_account/following', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the userWebsitesGet operation.
     * @callback module:api/UserAccountApi~userWebsitesGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserWebsitesGet200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get user websites
     * Get user websites, claimed or not
     * @param {Object} opts Optional parameters
     * @param {String} [bookmark] Cursor used to fetch the next page of items
     * @param {Number} [pageSize = 25)] Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
     * @param {module:api/UserAccountApi~userWebsitesGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserWebsitesGet200Response}
     */
    userWebsitesGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'bookmark': opts['bookmark'],
        'page_size': opts['pageSize']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = UserWebsitesGet200Response;
      return this.apiClient.callApi(
        '/user_account/websites', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the verifyWebsiteUpdate operation.
     * @callback module:api/UserAccountApi~verifyWebsiteUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserWebsiteSummary} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verify website
     * Verify a website as a signed-in user.
     * @param {module:model/UserWebsiteVerifyRequest} userWebsiteVerifyRequest Verify a website.
     * @param {Object} opts Optional parameters
     * @param {String} [adAccountId] Unique identifier of an ad account.
     * @param {module:api/UserAccountApi~verifyWebsiteUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserWebsiteSummary}
     */
    verifyWebsiteUpdate(userWebsiteVerifyRequest, opts, callback) {
      opts = opts || {};
      let postBody = userWebsiteVerifyRequest;
      // verify the required parameter 'userWebsiteVerifyRequest' is set
      if (userWebsiteVerifyRequest === undefined || userWebsiteVerifyRequest === null) {
        throw new Error("Missing the required parameter 'userWebsiteVerifyRequest' when calling verifyWebsiteUpdate");
      }

      let pathParams = {
      };
      let queryParams = {
        'ad_account_id': opts['adAccountId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = UserWebsiteSummary;
      return this.apiClient.callApi(
        '/user_account/websites', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the websiteVerificationGet operation.
     * @callback module:api/UserAccountApi~websiteVerificationGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserWebsiteVerificationCode} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get user verification code for website claiming
     * Get verification code for user to install on the website to claim it.
     * @param {Object} opts Optional parameters
     * @param {String} [adAccountId] Unique identifier of an ad account.
     * @param {module:api/UserAccountApi~websiteVerificationGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserWebsiteVerificationCode}
     */
    websiteVerificationGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ad_account_id': opts['adAccountId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2', 'client_credentials'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = UserWebsiteVerificationCode;
      return this.apiClient.callApi(
        '/user_account/websites/verification', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
