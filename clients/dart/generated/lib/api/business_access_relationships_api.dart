//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class BusinessAccessRelationshipsApi {
  BusinessAccessRelationshipsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create a Brand Account
  ///
  /// Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessHierarchyId (required):
  ///   business hierarchy node id
  ///
  /// * [BrandAccountsCreateRequest] brandAccountsCreateRequest (required):
  Future<Response> brandAccountsCreateWithHttpInfo(String businessHierarchyId, BrandAccountsCreateRequest brandAccountsCreateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts'
      .replaceAll('{business_hierarchy_id}', businessHierarchyId);

    // ignore: prefer_final_locals
    Object? postBody = brandAccountsCreateRequest;

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

  /// Create a Brand Account
  ///
  /// Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
  ///
  /// Parameters:
  ///
  /// * [String] businessHierarchyId (required):
  ///   business hierarchy node id
  ///
  /// * [BrandAccountsCreateRequest] brandAccountsCreateRequest (required):
  Future<BrandAccountsCreate200Response?> brandAccountsCreate(String businessHierarchyId, BrandAccountsCreateRequest brandAccountsCreateRequest,) async {
    final response = await brandAccountsCreateWithHttpInfo(businessHierarchyId, brandAccountsCreateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BrandAccountsCreate200Response',) as BrandAccountsCreate200Response;
    
    }
    return null;
  }

  /// Update a Brand Account
  ///
  /// Update an existing Brand Account
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessHierarchyId (required):
  ///   business hierarchy node id
  ///
  /// * [String] brandAccountId (required):
  ///   Unique identifier of a brand account.
  ///
  /// * [BrandAccountsUpdateRequest] brandAccountsUpdateRequest (required):
  Future<Response> brandAccountsUpdateWithHttpInfo(String businessHierarchyId, String brandAccountId, BrandAccountsUpdateRequest brandAccountsUpdateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}'
      .replaceAll('{business_hierarchy_id}', businessHierarchyId)
      .replaceAll('{brand_account_id}', brandAccountId);

    // ignore: prefer_final_locals
    Object? postBody = brandAccountsUpdateRequest;

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
    );
  }

  /// Update a Brand Account
  ///
  /// Update an existing Brand Account
  ///
  /// Parameters:
  ///
  /// * [String] businessHierarchyId (required):
  ///   business hierarchy node id
  ///
  /// * [String] brandAccountId (required):
  ///   Unique identifier of a brand account.
  ///
  /// * [BrandAccountsUpdateRequest] brandAccountsUpdateRequest (required):
  Future<BrandAccountsCreate200Response?> brandAccountsUpdate(String businessHierarchyId, String brandAccountId, BrandAccountsUpdateRequest brandAccountsUpdateRequest,) async {
    final response = await brandAccountsUpdateWithHttpInfo(businessHierarchyId, brandAccountId, brandAccountsUpdateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BrandAccountsCreate200Response',) as BrandAccountsCreate200Response;
    
    }
    return null;
  }

  /// Terminate business memberships
  ///
  /// Terminate memberships between the specified members and your business.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Business id
  ///
  /// * [MembersToDeleteBody] membersToDeleteBody (required):
  ///   List of members with role to delete.
  Future<Response> deleteBusinessMembershipWithHttpInfo(String businessId, MembersToDeleteBody membersToDeleteBody,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/members'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = membersToDeleteBody;

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
    );
  }

  /// Terminate business memberships
  ///
  /// Terminate memberships between the specified members and your business.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Business id
  ///
  /// * [MembersToDeleteBody] membersToDeleteBody (required):
  ///   List of members with role to delete.
  Future<DeletedMembersResponse?> deleteBusinessMembership(String businessId, MembersToDeleteBody membersToDeleteBody,) async {
    final response = await deleteBusinessMembershipWithHttpInfo(businessId, membersToDeleteBody,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'DeletedMembersResponse',) as DeletedMembersResponse;
    
    }
    return null;
  }

  /// Terminate business partnerships
  ///
  /// Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [DeletePartnersRequest] deletePartnersRequest (required):
  ///   An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 
  Future<Response> deleteBusinessPartnersWithHttpInfo(String businessId, DeletePartnersRequest deletePartnersRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/partners'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = deletePartnersRequest;

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
    );
  }

  /// Terminate business partnerships
  ///
  /// Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [DeletePartnersRequest] deletePartnersRequest (required):
  ///   An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 
  Future<DeletePartnersResponse?> deleteBusinessPartners(String businessId, DeletePartnersRequest deletePartnersRequest,) async {
    final response = await deleteBusinessPartnersWithHttpInfo(businessId, deletePartnersRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'DeletePartnersResponse',) as DeletePartnersResponse;
    
    }
    return null;
  }

  /// List business employers for user
  ///
  /// Get all of the viewing user's business employers.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<Response> getBusinessEmployersWithHttpInfo({ int? pageSize, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/employers';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
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

  /// List business employers for user
  ///
  /// Get all of the viewing user's business employers.
  ///
  /// Parameters:
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<GetBusinessEmployers200Response?> getBusinessEmployers({ int? pageSize, String? bookmark, }) async {
    final response = await getBusinessEmployersWithHttpInfo( pageSize: pageSize, bookmark: bookmark, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetBusinessEmployers200Response',) as GetBusinessEmployers200Response;
    
    }
    return null;
  }

  /// Get business members
  ///
  /// Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [bool] fetchSystemUsers:
  ///   Fetches system users if True. Fetches regular user employees if False.
  ///
  /// * [bool] assetsSummary:
  ///   Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
  ///
  /// * [List<MemberBusinessRole>] businessRoles:
  ///   A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
  ///
  /// * [String] memberIds:
  ///   A list of business members ids separated by comma.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<Response> getBusinessMembersWithHttpInfo(String businessId, { bool? fetchSystemUsers, bool? assetsSummary, List<MemberBusinessRole>? businessRoles, String? memberIds, int? startIndex, String? bookmark, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/members'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (fetchSystemUsers != null) {
      queryParams.addAll(_queryParams('', 'fetch_system_users', fetchSystemUsers));
    }
    if (assetsSummary != null) {
      queryParams.addAll(_queryParams('', 'assets_summary', assetsSummary));
    }
    if (businessRoles != null) {
      queryParams.addAll(_queryParams('multi', 'business_roles', businessRoles));
    }
    if (memberIds != null) {
      queryParams.addAll(_queryParams('', 'member_ids', memberIds));
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
    );
  }

  /// Get business members
  ///
  /// Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [bool] fetchSystemUsers:
  ///   Fetches system users if True. Fetches regular user employees if False.
  ///
  /// * [bool] assetsSummary:
  ///   Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
  ///
  /// * [List<MemberBusinessRole>] businessRoles:
  ///   A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
  ///
  /// * [String] memberIds:
  ///   A list of business members ids separated by comma.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<GetBusinessMembers200Response?> getBusinessMembers(String businessId, { bool? fetchSystemUsers, bool? assetsSummary, List<MemberBusinessRole>? businessRoles, String? memberIds, int? startIndex, String? bookmark, int? pageSize, }) async {
    final response = await getBusinessMembersWithHttpInfo(businessId,  fetchSystemUsers: fetchSystemUsers, assetsSummary: assetsSummary, businessRoles: businessRoles, memberIds: memberIds, startIndex: startIndex, bookmark: bookmark, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetBusinessMembers200Response',) as GetBusinessMembers200Response;
    
    }
    return null;
  }

  /// Get business partners
  ///
  /// Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [bool] assetsSummary:
  ///   Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
  ///
  /// * [PartnerType] partnerType:
  ///   Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
  ///
  /// * [String] partnerIds:
  ///   A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<Response> getBusinessPartnersWithHttpInfo(String businessId, { bool? assetsSummary, PartnerType? partnerType, String? partnerIds, int? startIndex, int? pageSize, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/partners'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (assetsSummary != null) {
      queryParams.addAll(_queryParams('', 'assets_summary', assetsSummary));
    }
    if (partnerType != null) {
      queryParams.addAll(_queryParams('', 'partner_type', partnerType));
    }
    if (partnerIds != null) {
      queryParams.addAll(_queryParams('', 'partner_ids', partnerIds));
    }
    if (startIndex != null) {
      queryParams.addAll(_queryParams('', 'start_index', startIndex));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
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

  /// Get business partners
  ///
  /// Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [bool] assetsSummary:
  ///   Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
  ///
  /// * [PartnerType] partnerType:
  ///   Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
  ///
  /// * [String] partnerIds:
  ///   A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
  ///
  /// * [int] startIndex:
  ///   An index to start fetching the results from. Only the results starting from this index will be returned.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<GetBusinessPartners200Response?> getBusinessPartners(String businessId, { bool? assetsSummary, PartnerType? partnerType, String? partnerIds, int? startIndex, int? pageSize, String? bookmark, }) async {
    final response = await getBusinessPartnersWithHttpInfo(businessId,  assetsSummary: assetsSummary, partnerType: partnerType, partnerIds: partnerIds, startIndex: startIndex, pageSize: pageSize, bookmark: bookmark, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetBusinessPartners200Response',) as GetBusinessPartners200Response;
    
    }
    return null;
  }

  /// Update a system user information.
  ///
  /// Update a system user information such as name.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] systemUserId (required):
  ///   Unique identifier of a system user.
  ///
  /// * [SystemUserUpdateRequest] systemUserUpdateRequest (required):
  Future<Response> systemUserUpdateWithHttpInfo(String businessId, String systemUserId, SystemUserUpdateRequest systemUserUpdateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/system_users/{system_user_id}'
      .replaceAll('{business_id}', businessId)
      .replaceAll('{system_user_id}', systemUserId);

    // ignore: prefer_final_locals
    Object? postBody = systemUserUpdateRequest;

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
    );
  }

  /// Update a system user information.
  ///
  /// Update a system user information such as name.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] systemUserId (required):
  ///   Unique identifier of a system user.
  ///
  /// * [SystemUserUpdateRequest] systemUserUpdateRequest (required):
  Future<void> systemUserUpdate(String businessId, String systemUserId, SystemUserUpdateRequest systemUserUpdateRequest,) async {
    final response = await systemUserUpdateWithHttpInfo(businessId, systemUserId, systemUserUpdateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Update member's business role
  ///
  /// Update a member's business role within the business.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Business id
  ///
  /// * [List<UpdateMemberBusinessRoleBody>] updateMemberBusinessRoleBody (required):
  ///   List of objects with the member id and the business_role.
  Future<Response> updateBusinessMembershipsWithHttpInfo(String businessId, List<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/members'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = updateMemberBusinessRoleBody;

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
    );
  }

  /// Update member's business role
  ///
  /// Update a member's business role within the business.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Business id
  ///
  /// * [List<UpdateMemberBusinessRoleBody>] updateMemberBusinessRoleBody (required):
  ///   List of objects with the member id and the business_role.
  Future<UpdateMemberResultsResponseArray?> updateBusinessMemberships(String businessId, List<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody,) async {
    final response = await updateBusinessMembershipsWithHttpInfo(businessId, updateMemberBusinessRoleBody,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UpdateMemberResultsResponseArray',) as UpdateMemberResultsResponseArray;
    
    }
    return null;
  }
}
