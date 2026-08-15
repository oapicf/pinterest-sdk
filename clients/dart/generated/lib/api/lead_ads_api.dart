//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class LeadAdsApi {
  LeadAdsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Delete lead ads subscription
  ///
  /// Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] subscriptionId (required):
  ///   Unique identifier of a subscription.
  Future<Response> adAccountsSubscriptionsDelByIdWithHttpInfo(String adAccountId, String subscriptionId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{subscription_id}', subscriptionId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Delete lead ads subscription
  ///
  /// Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] subscriptionId (required):
  ///   Unique identifier of a subscription.
  Future<void> adAccountsSubscriptionsDelById(String adAccountId, String subscriptionId,) async {
    final response = await adAccountsSubscriptionsDelByIdWithHttpInfo(adAccountId, subscriptionId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Get lead ads subscription by ID
  ///
  /// Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] subscriptionId (required):
  ///   Unique identifier of a subscription.
  Future<Response> adAccountsSubscriptionsGetByIdWithHttpInfo(String adAccountId, String subscriptionId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{subscription_id}', subscriptionId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get lead ads subscription by ID
  ///
  /// Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] subscriptionId (required):
  ///   Unique identifier of a subscription.
  Future<LeadSubscription?> adAccountsSubscriptionsGetById(String adAccountId, String subscriptionId,) async {
    final response = await adAccountsSubscriptionsGetByIdWithHttpInfo(adAccountId, subscriptionId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'LeadSubscription',) as LeadSubscription;
    
    }
    return null;
  }

  /// Get lead ads subscriptions
  ///
  /// Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> adAccountsSubscriptionsGetListWithHttpInfo(String adAccountId, { String? bookmark, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/leads/subscriptions'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get lead ads subscriptions
  ///
  /// Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<AdAccountsSubscriptionsGetList200Response?> adAccountsSubscriptionsGetList(String adAccountId, { String? bookmark, int? pageSize, }) async {
    final response = await adAccountsSubscriptionsGetListWithHttpInfo(adAccountId,  bookmark: bookmark, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdAccountsSubscriptionsGetList200Response',) as AdAccountsSubscriptionsGetList200Response;
    
    }
    return null;
  }

  /// Create lead ads subscription
  ///
  /// Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [LeadSubscriptionPostParamsCreate] leadSubscriptionPostParamsCreate (required):
  Future<Response> adAccountsSubscriptionsPostWithHttpInfo(String adAccountId, LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/leads/subscriptions'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = leadSubscriptionPostParamsCreate;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Create lead ads subscription
  ///
  /// Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [LeadSubscriptionPostParamsCreate] leadSubscriptionPostParamsCreate (required):
  Future<LeadSubscription?> adAccountsSubscriptionsPost(String adAccountId, LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate,) async {
    final response = await adAccountsSubscriptionsPostWithHttpInfo(adAccountId, leadSubscriptionPostParamsCreate,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'LeadSubscription',) as LeadSubscription;
    
    }
    return null;
  }
}
