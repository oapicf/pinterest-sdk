//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class BusinessAccessAssetsApi {
  BusinessAccessAssetsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create a new asset group.
  ///
  /// Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [AssetGroupInputCreate] assetGroupInputCreate (required):
  Future<Response> assetGroupCreateWithHttpInfo(String businessId, AssetGroupInputCreate assetGroupInputCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/asset_groups'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = assetGroupInputCreate;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Create a new asset group.
  ///
  /// Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [AssetGroupInputCreate] assetGroupInputCreate (required):
  Future<AssetGroupInput?> assetGroupCreate(String businessId, AssetGroupInputCreate assetGroupInputCreate, { Future<void>? abortTrigger, }) async {
    final response = await assetGroupCreateWithHttpInfo(businessId, assetGroupInputCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AssetGroupInput',) as AssetGroupInput;
    
    }
    return null;
  }

  /// Delete asset groups.
  ///
  /// Delete a batch of asset groups.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [AssetGroupDeletionDelete] assetGroupDeletionDelete (required):
  Future<Response> assetGroupDeleteWithHttpInfo(String businessId, AssetGroupDeletionDelete assetGroupDeletionDelete, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/asset_groups'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = assetGroupDeletionDelete;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


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

  /// Delete asset groups.
  ///
  /// Delete a batch of asset groups.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [AssetGroupDeletionDelete] assetGroupDeletionDelete (required):
  Future<AssetGroupDeletion?> assetGroupDelete(String businessId, AssetGroupDeletionDelete assetGroupDeletionDelete, { Future<void>? abortTrigger, }) async {
    final response = await assetGroupDeleteWithHttpInfo(businessId, assetGroupDeletionDelete, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AssetGroupDeletion',) as AssetGroupDeletion;
    
    }
    return null;
  }

  /// Update asset groups.
  ///
  /// Update a batch of asset groups with the specified parameters.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [AssetGroupModificationReadOrUpdate] assetGroupModificationReadOrUpdate (required):
  Future<Response> assetGroupUpdateWithHttpInfo(String businessId, AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/asset_groups'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = assetGroupModificationReadOrUpdate;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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

  /// Update asset groups.
  ///
  /// Update a batch of asset groups with the specified parameters.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [AssetGroupModificationReadOrUpdate] assetGroupModificationReadOrUpdate (required):
  Future<AssetGroupModification?> assetGroupUpdate(String businessId, AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate, { Future<void>? abortTrigger, }) async {
    final response = await assetGroupUpdateWithHttpInfo(businessId, assetGroupModificationReadOrUpdate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AssetGroupModification',) as AssetGroupModification;
    
    }
    return null;
  }

  /// Get members with access to asset
  ///
  /// Get all the members the requesting business has granted access to on the given asset.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] assetId (required):
  ///   Unique identifier of a business asset.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [bool] fetchSystemUsers:
  ///   Fetches system users if True. Fetches regular user employees if False.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> businessAssetMembersGetWithHttpInfo(String businessId, String assetId, { int? startIndex, bool? fetchSystemUsers, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/assets/{asset_id}/members'
      .replaceAll('{business_id}', businessId)
      .replaceAll('{asset_id}', assetId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (startIndex != null) {
      queryParams.addAll(_queryParams('', 'start_index', startIndex));
    }
    if (fetchSystemUsers != null) {
      queryParams.addAll(_queryParams('', 'fetch_system_users', fetchSystemUsers));
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

  /// Get members with access to asset
  ///
  /// Get all the members the requesting business has granted access to on the given asset.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] assetId (required):
  ///   Unique identifier of a business asset.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [bool] fetchSystemUsers:
  ///   Fetches system users if True. Fetches regular user employees if False.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<BusinessAssetMembersGet200Response?> businessAssetMembersGet(String businessId, String assetId, { int? startIndex, bool? fetchSystemUsers, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await businessAssetMembersGetWithHttpInfo(businessId, assetId, startIndex: startIndex, fetchSystemUsers: fetchSystemUsers, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BusinessAssetMembersGet200Response',) as BusinessAssetMembersGet200Response;
    
    }
    return null;
  }

  /// Get partners with access to asset
  ///
  /// Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] assetId (required):
  ///   Unique identifier of a business asset.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> businessAssetPartnersGetWithHttpInfo(String businessId, String assetId, { int? startIndex, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/assets/{asset_id}/partners'
      .replaceAll('{business_id}', businessId)
      .replaceAll('{asset_id}', assetId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (startIndex != null) {
      queryParams.addAll(_queryParams('', 'start_index', startIndex));
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

  /// Get partners with access to asset
  ///
  /// Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] assetId (required):
  ///   Unique identifier of a business asset.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<BusinessAssetMembersGet200Response?> businessAssetPartnersGet(String businessId, String assetId, { int? startIndex, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await businessAssetPartnersGetWithHttpInfo(businessId, assetId, startIndex: startIndex, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BusinessAssetMembersGet200Response',) as BusinessAssetMembersGet200Response;
    
    }
    return null;
  }

  /// List business assets
  ///
  /// Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [List<PermissionsWithOwner>] permissions:
  ///   A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
  ///
  /// * [String] childAssetId:
  ///   A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
  ///
  /// * [String] assetGroupId:
  ///   An asset group unique identifier. Used to fetch assets contained within the specified asset group.
  ///
  /// * [String] assetType:
  ///   A resource type to filter the assets by. Only assets of the specified type will be returned.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> businessAssetsGetWithHttpInfo(String businessId, { List<PermissionsWithOwner>? permissions, String? childAssetId, String? assetGroupId, String? assetType, int? startIndex, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/assets'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (permissions != null) {
      queryParams.addAll(_queryParams('multi', 'permissions', permissions));
    }
    if (childAssetId != null) {
      queryParams.addAll(_queryParams('', 'child_asset_id', childAssetId));
    }
    if (assetGroupId != null) {
      queryParams.addAll(_queryParams('', 'asset_group_id', assetGroupId));
    }
    if (assetType != null) {
      queryParams.addAll(_queryParams('', 'asset_type', assetType));
    }
    if (startIndex != null) {
      queryParams.addAll(_queryParams('', 'start_index', startIndex));
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

  /// List business assets
  ///
  /// Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [List<PermissionsWithOwner>] permissions:
  ///   A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
  ///
  /// * [String] childAssetId:
  ///   A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
  ///
  /// * [String] assetGroupId:
  ///   An asset group unique identifier. Used to fetch assets contained within the specified asset group.
  ///
  /// * [String] assetType:
  ///   A resource type to filter the assets by. Only assets of the specified type will be returned.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<BusinessAssetsGet200Response?> businessAssetsGet(String businessId, { List<PermissionsWithOwner>? permissions, String? childAssetId, String? assetGroupId, String? assetType, int? startIndex, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await businessAssetsGetWithHttpInfo(businessId, permissions: permissions, childAssetId: childAssetId, assetGroupId: assetGroupId, assetType: assetType, startIndex: startIndex, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BusinessAssetsGet200Response',) as BusinessAssetsGet200Response;
    
    }
    return null;
  }

  /// Get assets assigned to a member
  ///
  /// Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] memberId (required):
  ///   The member id to fetch assets for.
  ///
  /// * [String] assetType:
  ///   A resource type to filter the assets by. Only assets of the specified type will be returned.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [AssetSortBy] sortBy:
  ///   The field to sort member assets by
  ///
  /// * [bool] sortAscending:
  ///   Sort assets in ascending order
  ///
  /// * [AssetSearchBy] searchBy:
  ///   The field to search member assets by
  ///
  /// * [String] searchValue:
  ///   The value to search for
  ///
  /// * [AssetPermissionType] assetPermissionType:
  ///   The type of asset permission to filter by
  ///
  /// * [List<NonDraftEntityStatus>] adAccountStatuses:
  ///   A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> businessMemberAssetsGetWithHttpInfo(String businessId, String memberId, { String? assetType, int? startIndex, AssetSortBy? sortBy, bool? sortAscending, AssetSearchBy? searchBy, String? searchValue, AssetPermissionType? assetPermissionType, List<NonDraftEntityStatus>? adAccountStatuses, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/members/{member_id}/assets'
      .replaceAll('{business_id}', businessId)
      .replaceAll('{member_id}', memberId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (assetType != null) {
      queryParams.addAll(_queryParams('', 'asset_type', assetType));
    }
    if (startIndex != null) {
      queryParams.addAll(_queryParams('', 'start_index', startIndex));
    }
    if (sortBy != null) {
      queryParams.addAll(_queryParams('', 'sort_by', sortBy));
    }
    if (sortAscending != null) {
      queryParams.addAll(_queryParams('', 'sort_ascending', sortAscending));
    }
    if (searchBy != null) {
      queryParams.addAll(_queryParams('', 'search_by', searchBy));
    }
    if (searchValue != null) {
      queryParams.addAll(_queryParams('', 'search_value', searchValue));
    }
    if (assetPermissionType != null) {
      queryParams.addAll(_queryParams('', 'asset_permission_type', assetPermissionType));
    }
    if (adAccountStatuses != null) {
      queryParams.addAll(_queryParams('multi', 'ad_account_statuses', adAccountStatuses));
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

  /// Get assets assigned to a member
  ///
  /// Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] memberId (required):
  ///   The member id to fetch assets for.
  ///
  /// * [String] assetType:
  ///   A resource type to filter the assets by. Only assets of the specified type will be returned.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [AssetSortBy] sortBy:
  ///   The field to sort member assets by
  ///
  /// * [bool] sortAscending:
  ///   Sort assets in ascending order
  ///
  /// * [AssetSearchBy] searchBy:
  ///   The field to search member assets by
  ///
  /// * [String] searchValue:
  ///   The value to search for
  ///
  /// * [AssetPermissionType] assetPermissionType:
  ///   The type of asset permission to filter by
  ///
  /// * [List<NonDraftEntityStatus>] adAccountStatuses:
  ///   A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<BusinessMemberAssetsGetResponse?> businessMemberAssetsGet(String businessId, String memberId, { String? assetType, int? startIndex, AssetSortBy? sortBy, bool? sortAscending, AssetSearchBy? searchBy, String? searchValue, AssetPermissionType? assetPermissionType, List<NonDraftEntityStatus>? adAccountStatuses, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await businessMemberAssetsGetWithHttpInfo(businessId, memberId, assetType: assetType, startIndex: startIndex, sortBy: sortBy, sortAscending: sortAscending, searchBy: searchBy, searchValue: searchValue, assetPermissionType: assetPermissionType, adAccountStatuses: adAccountStatuses, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BusinessMemberAssetsGetResponse',) as BusinessMemberAssetsGetResponse;
    
    }
    return null;
  }

  /// Delete member access to asset
  ///
  /// Terminate multiple members' access to an asset.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [BusinessMembersAssetAccessDeleteBody] businessMembersAssetAccessDeleteBody (required):
  Future<Response> businessMembersAssetAccessDeleteWithHttpInfo(String businessId, BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/members/assets/access'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = businessMembersAssetAccessDeleteBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


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

  /// Delete member access to asset
  ///
  /// Terminate multiple members' access to an asset.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [BusinessMembersAssetAccessDeleteBody] businessMembersAssetAccessDeleteBody (required):
  Future<DeleteMemberAccessResultsResponseArray?> businessMembersAssetAccessDelete(String businessId, BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody, { Future<void>? abortTrigger, }) async {
    final response = await businessMembersAssetAccessDeleteWithHttpInfo(businessId, businessMembersAssetAccessDeleteBody, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'DeleteMemberAccessResultsResponseArray',) as DeleteMemberAccessResultsResponseArray;
    
    }
    return null;
  }

  /// Assign/Update member asset permissions
  ///
  /// Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [UpdateMemberAssetAccessBody] updateMemberAssetAccessBody (required):
  Future<Response> businessMembersAssetAccessUpdateWithHttpInfo(String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/members/assets/access'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = updateMemberAssetAccessBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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

  /// Assign/Update member asset permissions
  ///
  /// Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [UpdateMemberAssetAccessBody] updateMemberAssetAccessBody (required):
  Future<UpdateMemberAssetsResultsResponseArray?> businessMembersAssetAccessUpdate(String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody, { Future<void>? abortTrigger, }) async {
    final response = await businessMembersAssetAccessUpdateWithHttpInfo(businessId, updateMemberAssetAccessBody, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UpdateMemberAssetsResultsResponseArray',) as UpdateMemberAssetsResultsResponseArray;
    
    }
    return null;
  }

  /// Get assets assigned to a partner or assets assigned by a partner
  ///
  /// Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] partnerId (required):
  ///   The partner id to be bound to the Business
  ///
  /// * [String] partnerType:
  ///   Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
  ///
  /// * [String] assetType:
  ///   A resource type to filter the assets by. Only assets of the specified type will be returned.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [AssetSortBy] sortBy:
  ///   The field to sort member assets by
  ///
  /// * [bool] sortAscending:
  ///   Sort assets in ascending order
  ///
  /// * [AssetSearchBy] searchBy:
  ///   The field to search member assets by
  ///
  /// * [String] searchValue:
  ///   The value to search for
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> businessPartnerAssetAccessGetWithHttpInfo(String businessId, String partnerId, { String? partnerType, String? assetType, int? startIndex, AssetSortBy? sortBy, bool? sortAscending, AssetSearchBy? searchBy, String? searchValue, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/partners/{partner_id}/assets'
      .replaceAll('{business_id}', businessId)
      .replaceAll('{partner_id}', partnerId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (partnerType != null) {
      queryParams.addAll(_queryParams('', 'partner_type', partnerType));
    }
    if (assetType != null) {
      queryParams.addAll(_queryParams('', 'asset_type', assetType));
    }
    if (startIndex != null) {
      queryParams.addAll(_queryParams('', 'start_index', startIndex));
    }
    if (sortBy != null) {
      queryParams.addAll(_queryParams('', 'sort_by', sortBy));
    }
    if (sortAscending != null) {
      queryParams.addAll(_queryParams('', 'sort_ascending', sortAscending));
    }
    if (searchBy != null) {
      queryParams.addAll(_queryParams('', 'search_by', searchBy));
    }
    if (searchValue != null) {
      queryParams.addAll(_queryParams('', 'search_value', searchValue));
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

  /// Get assets assigned to a partner or assets assigned by a partner
  ///
  /// Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] partnerId (required):
  ///   The partner id to be bound to the Business
  ///
  /// * [String] partnerType:
  ///   Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
  ///
  /// * [String] assetType:
  ///   A resource type to filter the assets by. Only assets of the specified type will be returned.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [AssetSortBy] sortBy:
  ///   The field to sort member assets by
  ///
  /// * [bool] sortAscending:
  ///   Sort assets in ascending order
  ///
  /// * [AssetSearchBy] searchBy:
  ///   The field to search member assets by
  ///
  /// * [String] searchValue:
  ///   The value to search for
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<BusinessPartnerAssetAccessGet200Response?> businessPartnerAssetAccessGet(String businessId, String partnerId, { String? partnerType, String? assetType, int? startIndex, AssetSortBy? sortBy, bool? sortAscending, AssetSearchBy? searchBy, String? searchValue, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await businessPartnerAssetAccessGetWithHttpInfo(businessId, partnerId, partnerType: partnerType, assetType: assetType, startIndex: startIndex, sortBy: sortBy, sortAscending: sortAscending, searchBy: searchBy, searchValue: searchValue, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BusinessPartnerAssetAccessGet200Response',) as BusinessPartnerAssetAccessGet200Response;
    
    }
    return null;
  }

  /// Delete partner access to asset
  ///
  /// Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [DeletePartnerAssetAccessBody] deletePartnerAssetAccessBody (required):
  Future<Response> deletePartnerAssetAccessHandlerImplWithHttpInfo(String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/partners/assets'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = deletePartnerAssetAccessBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


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

  /// Delete partner access to asset
  ///
  /// Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [DeletePartnerAssetAccessBody] deletePartnerAssetAccessBody (required):
  Future<DeletePartnerAssetAccessResultsResponseArray?> deletePartnerAssetAccessHandlerImpl(String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody, { Future<void>? abortTrigger, }) async {
    final response = await deletePartnerAssetAccessHandlerImplWithHttpInfo(businessId, deletePartnerAssetAccessBody, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'DeletePartnerAssetAccessResultsResponseArray',) as DeletePartnerAssetAccessResultsResponseArray;
    
    }
    return null;
  }

  /// Assign/Update partner asset permissions
  ///
  /// Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [UpdatePartnerAssetAccessBody] updatePartnerAssetAccessBody (required):
  Future<Response> updatePartnerAssetAccessHandlerImplWithHttpInfo(String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/partners/assets'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = updatePartnerAssetAccessBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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

  /// Assign/Update partner asset permissions
  ///
  /// Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [UpdatePartnerAssetAccessBody] updatePartnerAssetAccessBody (required):
  Future<UpdatePartnerAssetsResultsResponseArray?> updatePartnerAssetAccessHandlerImpl(String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody, { Future<void>? abortTrigger, }) async {
    final response = await updatePartnerAssetAccessHandlerImplWithHttpInfo(businessId, updatePartnerAssetAccessBody, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UpdatePartnerAssetsResultsResponseArray',) as UpdatePartnerAssetsResultsResponseArray;
    
    }
    return null;
  }
}
