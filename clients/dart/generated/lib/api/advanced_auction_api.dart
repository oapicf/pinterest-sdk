//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AdvancedAuctionApi {
  AdvancedAuctionApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get item bid options (POST)
  ///
  /// Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [AdvancedAuctionItemsGetRequest] advancedAuctionItemsGetRequest (required):
  ///   Request object used to get bid options values for a batch of retail catalog items
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> advancedAuctionItemsGetPostWithHttpInfo(AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/advanced_auction/items/get';

    // ignore: prefer_final_locals
    Object? postBody = advancedAuctionItemsGetRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }

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

  /// Get item bid options (POST)
  ///
  /// Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
  ///
  /// Parameters:
  ///
  /// * [AdvancedAuctionItemsGetRequest] advancedAuctionItemsGetRequest (required):
  ///   Request object used to get bid options values for a batch of retail catalog items
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<AdvancedAuctionItems?> advancedAuctionItemsGetPost(AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest, { String? adAccountId, }) async {
    final response = await advancedAuctionItemsGetPostWithHttpInfo(advancedAuctionItemsGetRequest,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdvancedAuctionItems',) as AdvancedAuctionItems;
    
    }
    return null;
  }

  /// Operate on item level bid options
  ///
  /// This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [AdvancedAuctionItemsSubmitRequest] advancedAuctionItemsSubmitRequest (required):
  ///   Request object used to upsert or delete bid options for a batch of retail catalog items
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> advancedAuctionItemsSubmitPostWithHttpInfo(AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/advanced_auction/items/submit';

    // ignore: prefer_final_locals
    Object? postBody = advancedAuctionItemsSubmitRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }

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

  /// Operate on item level bid options
  ///
  /// This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
  ///
  /// Parameters:
  ///
  /// * [AdvancedAuctionItemsSubmitRequest] advancedAuctionItemsSubmitRequest (required):
  ///   Request object used to upsert or delete bid options for a batch of retail catalog items
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<AdvancedAuctionProcessedItems?> advancedAuctionItemsSubmitPost(AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest, { String? adAccountId, }) async {
    final response = await advancedAuctionItemsSubmitPostWithHttpInfo(advancedAuctionItemsSubmitRequest,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdvancedAuctionProcessedItems',) as AdvancedAuctionProcessedItems;
    
    }
    return null;
  }
}
