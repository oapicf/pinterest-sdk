/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.AdvancedAuctionApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * Pinterest&#39;s REST API
 * Version: 5.14.0
* Generator version: 7.9.0
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license MIT
 * https://spdx.org/licenses/MIT
 */

goog.provide('API.Client.AdvancedAuctionApi');

goog.require('API.Client.AdvancedAuctionItems');
goog.require('API.Client.AdvancedAuctionItemsGetRequest');
goog.require('API.Client.AdvancedAuctionItemsSubmitRequest');
goog.require('API.Client.AdvancedAuctionProcessedItems');
goog.require('API.Client.Error');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.AdvancedAuctionApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('AdvancedAuctionApiBasePath') ?
                   /** @type {!string} */ ($injector.get('AdvancedAuctionApiBasePath')) :
                   'https://api.pinterest.com/v5';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('AdvancedAuctionApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('AdvancedAuctionApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.AdvancedAuctionApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Get item bid options (POST)
 * Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
 * @param {!AdvancedAuctionItemsGetRequest} advancedAuctionItemsGetRequest Request object used to get bid options values for a batch of retail catalog items
 * @param {!string=} opt_adAccountId Unique identifier of an ad account.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.AdvancedAuctionItems>}
 */
API.Client.AdvancedAuctionApi.prototype.advancedAuctionItemsGetPost = function(advancedAuctionItemsGetRequest, opt_adAccountId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/advanced_auction/items/get';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'advancedAuctionItemsGetRequest' is set
  if (!advancedAuctionItemsGetRequest) {
    throw new Error('Missing required parameter advancedAuctionItemsGetRequest when calling advancedAuctionItemsGetPost');
  }
  if (opt_adAccountId !== undefined) {
    queryParameters['ad_account_id'] = opt_adAccountId;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: advancedAuctionItemsGetRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Operate on item level bid options
 * This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/modify-items-in-batch/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
 * @param {!AdvancedAuctionItemsSubmitRequest} advancedAuctionItemsSubmitRequest Request object used to upsert or delete bid options for a batch of retail catalog items
 * @param {!string=} opt_adAccountId Unique identifier of an ad account.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.AdvancedAuctionProcessedItems>}
 */
API.Client.AdvancedAuctionApi.prototype.advancedAuctionItemsSubmitPost = function(advancedAuctionItemsSubmitRequest, opt_adAccountId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/advanced_auction/items/submit';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'advancedAuctionItemsSubmitRequest' is set
  if (!advancedAuctionItemsSubmitRequest) {
    throw new Error('Missing required parameter advancedAuctionItemsSubmitRequest when calling advancedAuctionItemsSubmitPost');
  }
  if (opt_adAccountId !== undefined) {
    queryParameters['ad_account_id'] = opt_adAccountId;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: advancedAuctionItemsSubmitRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
