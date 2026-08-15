//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CatalogProductGroupsApi {
  CatalogProductGroupsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// List products by product group
  ///
  /// Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] productGroupId (required):
  ///   Unique identifier of a product group
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] pinMetrics:
  ///   Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  Future<Response> catalogsProductGroupPinsListWithHttpInfo(String productGroupId, { String? bookmark, int? pageSize, String? adAccountId, bool? pinMetrics, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/product_groups/{product_group_id}/products'
      .replaceAll('{product_group_id}', productGroupId);

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
    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }
    if (pinMetrics != null) {
      queryParams.addAll(_queryParams('', 'pin_metrics', pinMetrics));
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

  /// List products by product group
  ///
  /// Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Parameters:
  ///
  /// * [String] productGroupId (required):
  ///   Unique identifier of a product group
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] pinMetrics:
  ///   Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  Future<CatalogsProductGroupPinsList200Response?> catalogsProductGroupPinsList(String productGroupId, { String? bookmark, int? pageSize, String? adAccountId, bool? pinMetrics, }) async {
    final response = await catalogsProductGroupPinsListWithHttpInfo(productGroupId,  bookmark: bookmark, pageSize: pageSize, adAccountId: adAccountId, pinMetrics: pinMetrics, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CatalogsProductGroupPinsList200Response',) as CatalogsProductGroupPinsList200Response;
    
    }
    return null;
  }

  /// Create product group
  ///
  /// Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [MultipleProductGroupsInner] multipleProductGroupsInner (required):
  ///   Request object used to create a single catalogs product groups.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsProductGroupsCreateWithHttpInfo(MultipleProductGroupsInner multipleProductGroupsInner, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/product_groups';

    // ignore: prefer_final_locals
    Object? postBody = multipleProductGroupsInner;

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

  /// Create product group
  ///
  /// Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
  ///
  /// Parameters:
  ///
  /// * [MultipleProductGroupsInner] multipleProductGroupsInner (required):
  ///   Request object used to create a single catalogs product groups.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<CatalogsVerticalProductGroup?> catalogsProductGroupsCreate(MultipleProductGroupsInner multipleProductGroupsInner, { String? adAccountId, }) async {
    final response = await catalogsProductGroupsCreateWithHttpInfo(multipleProductGroupsInner,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CatalogsVerticalProductGroup',) as CatalogsVerticalProductGroup;
    
    }
    return null;
  }

  /// Create product groups
  ///
  /// Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<MultipleProductGroupsInner>] multipleProductGroupsInner (required):
  ///   Request object used to create one or more catalogs product groups.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsProductGroupsCreateManyWithHttpInfo(List<MultipleProductGroupsInner> multipleProductGroupsInner, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/product_groups/multiple';

    // ignore: prefer_final_locals
    Object? postBody = multipleProductGroupsInner;

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

  /// Create product groups
  ///
  /// Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
  ///
  /// Parameters:
  ///
  /// * [List<MultipleProductGroupsInner>] multipleProductGroupsInner (required):
  ///   Request object used to create one or more catalogs product groups.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<List<String>?> catalogsProductGroupsCreateMany(List<MultipleProductGroupsInner> multipleProductGroupsInner, { String? adAccountId, }) async {
    final response = await catalogsProductGroupsCreateManyWithHttpInfo(multipleProductGroupsInner,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<String>') as List)
        .cast<String>()
        .toList(growable: false);

    }
    return null;
  }

  /// Delete product group
  ///
  /// Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] productGroupId (required):
  ///   Unique identifier of a product group
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsProductGroupsDeleteWithHttpInfo(String productGroupId, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/product_groups/{product_group_id}'
      .replaceAll('{product_group_id}', productGroupId);

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
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Delete product group
  ///
  /// Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Parameters:
  ///
  /// * [String] productGroupId (required):
  ///   Unique identifier of a product group
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<void> catalogsProductGroupsDelete(String productGroupId, { String? adAccountId, }) async {
    final response = await catalogsProductGroupsDeleteWithHttpInfo(productGroupId,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Delete product groups
  ///
  /// Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<int>] id (required):
  ///   Comma-separated list of product group ids
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsProductGroupsDeleteManyWithHttpInfo(List<int> id, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/product_groups/multiple';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('csv', 'id', id));
    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }

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

  /// Delete product groups
  ///
  /// Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Parameters:
  ///
  /// * [List<int>] id (required):
  ///   Comma-separated list of product group ids
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<void> catalogsProductGroupsDeleteMany(List<int> id, { String? adAccountId, }) async {
    final response = await catalogsProductGroupsDeleteManyWithHttpInfo(id,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Get product group
  ///
  /// Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] productGroupId (required):
  ///   Unique identifier of a product group
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsProductGroupsGetWithHttpInfo(String productGroupId, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/product_groups/{product_group_id}'
      .replaceAll('{product_group_id}', productGroupId);

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

  /// Get product group
  ///
  /// Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Parameters:
  ///
  /// * [String] productGroupId (required):
  ///   Unique identifier of a product group
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<CatalogsVerticalProductGroup?> catalogsProductGroupsGet(String productGroupId, { String? adAccountId, }) async {
    final response = await catalogsProductGroupsGetWithHttpInfo(productGroupId,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CatalogsVerticalProductGroup',) as CatalogsVerticalProductGroup;
    
    }
    return null;
  }

  /// List product groups
  ///
  /// Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<int>] id:
  ///   Comma-separated list of product group ids
  ///
  /// * [String] feedId:
  ///   Filter entities for a given feed_id. If not given, all feeds are considered.
  ///
  /// * [String] catalogId:
  ///   Filter entities for a given catalog_id. If not given, all catalogs are considered.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsProductGroupsListWithHttpInfo({ List<int>? id, String? feedId, String? catalogId, String? bookmark, int? pageSize, String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/product_groups';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (id != null) {
      queryParams.addAll(_queryParams('csv', 'id', id));
    }
    if (feedId != null) {
      queryParams.addAll(_queryParams('', 'feed_id', feedId));
    }
    if (catalogId != null) {
      queryParams.addAll(_queryParams('', 'catalog_id', catalogId));
    }
    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
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

  /// List product groups
  ///
  /// Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Parameters:
  ///
  /// * [List<int>] id:
  ///   Comma-separated list of product group ids
  ///
  /// * [String] feedId:
  ///   Filter entities for a given feed_id. If not given, all feeds are considered.
  ///
  /// * [String] catalogId:
  ///   Filter entities for a given catalog_id. If not given, all catalogs are considered.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<CatalogsProductGroupsList200Response?> catalogsProductGroupsList({ List<int>? id, String? feedId, String? catalogId, String? bookmark, int? pageSize, String? adAccountId, }) async {
    final response = await catalogsProductGroupsListWithHttpInfo( id: id, feedId: feedId, catalogId: catalogId, bookmark: bookmark, pageSize: pageSize, adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CatalogsProductGroupsList200Response',) as CatalogsProductGroupsList200Response;
    
    }
    return null;
  }

  /// Get product counts
  ///
  /// Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] productGroupId (required):
  ///   Unique identifier of a product group
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsProductGroupsProductCountsGetWithHttpInfo(String productGroupId, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/product_groups/{product_group_id}/product_counts'
      .replaceAll('{product_group_id}', productGroupId);

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

  /// Get product counts
  ///
  /// Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Parameters:
  ///
  /// * [String] productGroupId (required):
  ///   Unique identifier of a product group
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<CatalogsProductGroupProductCountsVertical?> catalogsProductGroupsProductCountsGet(String productGroupId, { String? adAccountId, }) async {
    final response = await catalogsProductGroupsProductCountsGetWithHttpInfo(productGroupId,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CatalogsProductGroupProductCountsVertical',) as CatalogsProductGroupProductCountsVertical;
    
    }
    return null;
  }

  /// Update single product group
  ///
  /// Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] productGroupId (required):
  ///   Unique identifier of a product group
  ///
  /// * [CatalogsProductGroupsUpdateRequest] catalogsProductGroupsUpdateRequest (required):
  ///   Request object used to Update a catalogs product group.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsProductGroupsUpdateWithHttpInfo(String productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/product_groups/{product_group_id}'
      .replaceAll('{product_group_id}', productGroupId);

    // ignore: prefer_final_locals
    Object? postBody = catalogsProductGroupsUpdateRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'PATCH',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Update single product group
  ///
  /// Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
  ///
  /// Parameters:
  ///
  /// * [String] productGroupId (required):
  ///   Unique identifier of a product group
  ///
  /// * [CatalogsProductGroupsUpdateRequest] catalogsProductGroupsUpdateRequest (required):
  ///   Request object used to Update a catalogs product group.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<CatalogsVerticalProductGroup?> catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest, { String? adAccountId, }) async {
    final response = await catalogsProductGroupsUpdateWithHttpInfo(productGroupId, catalogsProductGroupsUpdateRequest,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CatalogsVerticalProductGroup',) as CatalogsVerticalProductGroup;
    
    }
    return null;
  }

  /// List products by filter
  ///
  /// List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [CatalogsListProductsByFilterRequest] catalogsListProductsByFilterRequest (required):
  ///   Object holding a group of filters for a catalog product group
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] pinMetrics:
  ///   Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  Future<Response> productsByProductGroupFilterListWithHttpInfo(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, { String? bookmark, int? pageSize, String? adAccountId, bool? pinMetrics, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/products/get_by_product_group_filters';

    // ignore: prefer_final_locals
    Object? postBody = catalogsListProductsByFilterRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }
    if (pinMetrics != null) {
      queryParams.addAll(_queryParams('', 'pin_metrics', pinMetrics));
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

  /// List products by filter
  ///
  /// List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
  ///
  /// Parameters:
  ///
  /// * [CatalogsListProductsByFilterRequest] catalogsListProductsByFilterRequest (required):
  ///   Object holding a group of filters for a catalog product group
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] pinMetrics:
  ///   Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  Future<CatalogsProductGroupPinsList200Response?> productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, { String? bookmark, int? pageSize, String? adAccountId, bool? pinMetrics, }) async {
    final response = await productsByProductGroupFilterListWithHttpInfo(catalogsListProductsByFilterRequest,  bookmark: bookmark, pageSize: pageSize, adAccountId: adAccountId, pinMetrics: pinMetrics, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CatalogsProductGroupPinsList200Response',) as CatalogsProductGroupPinsList200Response;
    
    }
    return null;
  }
}
