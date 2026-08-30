//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CatalogSupplementalApi {
  CatalogSupplementalApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Operate on local inventory item batch
  ///
  /// Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [LocalInventoryItemsBatchCreate] localInventoryItemsBatchCreate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsLocalInventoryItemsBatchOperateWithHttpInfo(String catalogId, LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate, { String? adAccountId, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/{catalog_id}/local_inventory_items/batch'
      .replaceAll('{catalog_id}', catalogId);

    // ignore: prefer_final_locals
    Object? postBody = localInventoryItemsBatchCreate;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Operate on local inventory item batch
  ///
  /// Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [LocalInventoryItemsBatchCreate] localInventoryItemsBatchCreate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<SupplementalItemsBatchResponse?> catalogsLocalInventoryItemsBatchOperate(String catalogId, LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate, { String? adAccountId, Future<void>? abortTrigger, }) async {
    final response = await catalogsLocalInventoryItemsBatchOperateWithHttpInfo(catalogId, localInventoryItemsBatchCreate, adAccountId: adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SupplementalItemsBatchResponse',) as SupplementalItemsBatchResponse;
    
    }
    return null;
  }

  /// Get local inventory items (POST)
  ///
  /// Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [LocalInventoryItemsGetCreate] localInventoryItemsGetCreate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsLocalInventoryItemsPostWithHttpInfo(String catalogId, LocalInventoryItemsGetCreate localInventoryItemsGetCreate, { String? adAccountId, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/{catalog_id}/local_inventory_items/query'
      .replaceAll('{catalog_id}', catalogId);

    // ignore: prefer_final_locals
    Object? postBody = localInventoryItemsGetCreate;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Get local inventory items (POST)
  ///
  /// Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [LocalInventoryItemsGetCreate] localInventoryItemsGetCreate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<LocalInventoryItemsGet?> catalogsLocalInventoryItemsPost(String catalogId, LocalInventoryItemsGetCreate localInventoryItemsGetCreate, { String? adAccountId, Future<void>? abortTrigger, }) async {
    final response = await catalogsLocalInventoryItemsPostWithHttpInfo(catalogId, localInventoryItemsGetCreate, adAccountId: adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'LocalInventoryItemsGet',) as LocalInventoryItemsGet;
    
    }
    return null;
  }

  /// Create local stores
  ///
  /// Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [List<LocalStoreCreate>] localStoreCreate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsLocalStoresCreateWithHttpInfo(String catalogId, List<LocalStoreCreate> localStoreCreate, { String? adAccountId, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/{catalog_id}/local_stores'
      .replaceAll('{catalog_id}', catalogId);

    // ignore: prefer_final_locals
    Object? postBody = localStoreCreate;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Create local stores
  ///
  /// Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [List<LocalStoreCreate>] localStoreCreate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<List<CatalogsLocalStoresCreate200ResponseInner>?> catalogsLocalStoresCreate(String catalogId, List<LocalStoreCreate> localStoreCreate, { String? adAccountId, Future<void>? abortTrigger, }) async {
    final response = await catalogsLocalStoresCreateWithHttpInfo(catalogId, localStoreCreate, adAccountId: adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<CatalogsLocalStoresCreate200ResponseInner>') as List)
        .cast<CatalogsLocalStoresCreate200ResponseInner>()
        .toList(growable: false);

    }
    return null;
  }

  /// Delete local stores
  ///
  ///   Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [List<String>] ids (required):
  ///   List of local store IDs to filter by.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsLocalStoresDeleteWithHttpInfo(String catalogId, List<String> ids, { String? adAccountId, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/{catalog_id}/local_stores'
      .replaceAll('{catalog_id}', catalogId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('csv', 'ids', ids));
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
      abortTrigger: abortTrigger,
    );
  }

  /// Delete local stores
  ///
  ///   Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [List<String>] ids (required):
  ///   List of local store IDs to filter by.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<List<CatalogsLocalStoresDelete200ResponseInner>?> catalogsLocalStoresDelete(String catalogId, List<String> ids, { String? adAccountId, Future<void>? abortTrigger, }) async {
    final response = await catalogsLocalStoresDeleteWithHttpInfo(catalogId, ids, adAccountId: adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<CatalogsLocalStoresDelete200ResponseInner>') as List)
        .cast<CatalogsLocalStoresDelete200ResponseInner>()
        .toList(growable: false);

    }
    return null;
  }

  /// List local stores
  ///
  /// Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [List<String>] ids:
  ///   List of local store IDs to filter by.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> catalogsLocalStoresListWithHttpInfo(String catalogId, { List<String>? ids, String? adAccountId, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/{catalog_id}/local_stores'
      .replaceAll('{catalog_id}', catalogId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (ids != null) {
      queryParams.addAll(_queryParams('csv', 'ids', ids));
    }
    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }
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
      abortTrigger: abortTrigger,
    );
  }

  /// List local stores
  ///
  /// Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [List<String>] ids:
  ///   List of local store IDs to filter by.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<CatalogsLocalStoresList200Response?> catalogsLocalStoresList(String catalogId, { List<String>? ids, String? adAccountId, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await catalogsLocalStoresListWithHttpInfo(catalogId, ids: ids, adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CatalogsLocalStoresList200Response',) as CatalogsLocalStoresList200Response;
    
    }
    return null;
  }

  /// Update local stores
  ///
  ///   Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [List<LocalStoreBatchUpdate>] localStoreBatchUpdate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsLocalStoresUpdateWithHttpInfo(String catalogId, List<LocalStoreBatchUpdate> localStoreBatchUpdate, { String? adAccountId, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/{catalog_id}/local_stores'
      .replaceAll('{catalog_id}', catalogId);

    // ignore: prefer_final_locals
    Object? postBody = localStoreBatchUpdate;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Update local stores
  ///
  ///   Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [List<LocalStoreBatchUpdate>] localStoreBatchUpdate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<List<CatalogsLocalStoresCreate200ResponseInner>?> catalogsLocalStoresUpdate(String catalogId, List<LocalStoreBatchUpdate> localStoreBatchUpdate, { String? adAccountId, Future<void>? abortTrigger, }) async {
    final response = await catalogsLocalStoresUpdateWithHttpInfo(catalogId, localStoreBatchUpdate, adAccountId: adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<CatalogsLocalStoresCreate200ResponseInner>') as List)
        .cast<CatalogsLocalStoresCreate200ResponseInner>()
        .toList(growable: false);

    }
    return null;
  }

  /// Get supplemental items batch status
  ///
  /// Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [String] batchId (required):
  ///   Unique identifier of an items batch operation.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> catalogsSupplementalItemsBatchGetWithHttpInfo(String catalogId, String batchId, { String? adAccountId, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}'
      .replaceAll('{catalog_id}', catalogId)
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
      abortTrigger: abortTrigger,
    );
  }

  /// Get supplemental items batch status
  ///
  /// Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
  ///
  /// Parameters:
  ///
  /// * [String] catalogId (required):
  ///   Unique identifier of a catalog.
  ///
  /// * [String] batchId (required):
  ///   Unique identifier of an items batch operation.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<SupplementalItemsBatchResponse?> catalogsSupplementalItemsBatchGet(String catalogId, String batchId, { String? adAccountId, Future<void>? abortTrigger, }) async {
    final response = await catalogsSupplementalItemsBatchGetWithHttpInfo(catalogId, batchId, adAccountId: adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SupplementalItemsBatchResponse',) as SupplementalItemsBatchResponse;
    
    }
    return null;
  }
}
