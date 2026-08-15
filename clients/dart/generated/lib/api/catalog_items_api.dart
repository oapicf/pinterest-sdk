//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CatalogItemsApi {
  CatalogItemsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get item batch status
  ///
  /// Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] batchId (required):
  ///   Id of a catalogs items batch to fetch
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> itemsBatchGetWithHttpInfo(String batchId, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/items/batch/{batch_id}'
      .replaceAll('{batch_id}', batchId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
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

  /// Get item batch status
  ///
  /// Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
  ///
  /// Parameters:
  ///
  /// * [String] batchId (required):
  ///   Id of a catalogs items batch to fetch
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<CatalogsItemsBatch?> itemsBatchGet(String batchId, { String? adAccountId, }) async {
    final response = await itemsBatchGetWithHttpInfo(batchId,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CatalogsItemsBatch',) as CatalogsItemsBatch;
    
    }
    return null;
  }

  /// Operate on item batch
  ///
  /// This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [ItemsBatchPostRequest] itemsBatchPostRequest (required):
  ///   Request object used to create catalogs items in a batch
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> itemsBatchPostWithHttpInfo(ItemsBatchPostRequest itemsBatchPostRequest, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/items/batch';

    // ignore: prefer_final_locals
    Object? postBody = itemsBatchPostRequest;

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

  /// Operate on item batch
  ///
  /// This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.
  ///
  /// Parameters:
  ///
  /// * [ItemsBatchPostRequest] itemsBatchPostRequest (required):
  ///   Request object used to create catalogs items in a batch
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<CatalogsItemsBatch?> itemsBatchPost(ItemsBatchPostRequest itemsBatchPostRequest, { String? adAccountId, }) async {
    final response = await itemsBatchPostWithHttpInfo(itemsBatchPostRequest,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CatalogsItemsBatch',) as CatalogsItemsBatch;
    
    }
    return null;
  }

  /// Get catalogs items (POST)
  ///
  /// Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [CatalogsItemsRequest] catalogsItemsRequest (required):
  ///   Request object used to get catalogs items
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> itemsPostWithHttpInfo(CatalogsItemsRequest catalogsItemsRequest, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/items';

    // ignore: prefer_final_locals
    Object? postBody = catalogsItemsRequest;

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

  /// Get catalogs items (POST)
  ///
  /// Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
  ///
  /// Parameters:
  ///
  /// * [CatalogsItemsRequest] catalogsItemsRequest (required):
  ///   Request object used to get catalogs items
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<CatalogsItems?> itemsPost(CatalogsItemsRequest catalogsItemsRequest, { String? adAccountId, }) async {
    final response = await itemsPostWithHttpInfo(catalogsItemsRequest,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CatalogsItems',) as CatalogsItems;
    
    }
    return null;
  }
}
