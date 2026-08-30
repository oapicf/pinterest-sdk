//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class BusinessAccessInviteApi {
  BusinessAccessInviteApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create a request to access an existing partner's assets.
  ///
  /// Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [CreateAssetAccessRequestBody] createAssetAccessRequestBody (required):
  Future<Response> assetAccessRequestsCreateWithHttpInfo(String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/requests/assets/access'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = createAssetAccessRequestBody;

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

  /// Create a request to access an existing partner's assets.
  ///
  /// Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [CreateAssetAccessRequestBody] createAssetAccessRequestBody (required):
  Future<CreateAssetAccessRequestResponse?> assetAccessRequestsCreate(String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody, { Future<void>? abortTrigger, }) async {
    final response = await assetAccessRequestsCreateWithHttpInfo(businessId, createAssetAccessRequestBody, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CreateAssetAccessRequestResponse',) as CreateAssetAccessRequestResponse;
    
    }
    return null;
  }

  /// Cancel invites/requests
  ///
  /// Cancel membership/partnership invites and/or requests.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [CancelInvitesRequest] cancelInvitesRequest (required):
  Future<Response> cancelInvitesOrRequestsWithHttpInfo(String businessId, CancelInvitesRequest cancelInvitesRequest, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/invites'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = cancelInvitesRequest;

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

  /// Cancel invites/requests
  ///
  /// Cancel membership/partnership invites and/or requests.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [CancelInvitesRequest] cancelInvitesRequest (required):
  Future<CancelInvitesResponse?> cancelInvitesOrRequests(String businessId, CancelInvitesRequest cancelInvitesRequest, { Future<void>? abortTrigger, }) async {
    final response = await cancelInvitesOrRequestsWithHttpInfo(businessId, cancelInvitesRequest, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CancelInvitesResponse',) as CancelInvitesResponse;
    
    }
    return null;
  }

  /// Update invite/request with an asset permission
  ///
  /// Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [CreateAssetInvitesRequest] createAssetInvitesRequest (required):
  Future<Response> createAssetInvitesWithHttpInfo(String businessId, CreateAssetInvitesRequest createAssetInvitesRequest, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/invites/assets/access'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = createAssetInvitesRequest;

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

  /// Update invite/request with an asset permission
  ///
  /// Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [CreateAssetInvitesRequest] createAssetInvitesRequest (required):
  Future<UpdateInvitesResultsResponseArray?> createAssetInvites(String businessId, CreateAssetInvitesRequest createAssetInvitesRequest, { Future<void>? abortTrigger, }) async {
    final response = await createAssetInvitesWithHttpInfo(businessId, createAssetInvitesRequest, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UpdateInvitesResultsResponseArray',) as UpdateInvitesResultsResponseArray;
    
    }
    return null;
  }

  /// Create invites or requests
  ///
  /// Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [CreateMembershipOrPartnershipInvitesBody] createMembershipOrPartnershipInvitesBody (required):
  Future<Response> createMembershipOrPartnershipInvitesWithHttpInfo(String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/invites'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = createMembershipOrPartnershipInvitesBody;

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

  /// Create invites or requests
  ///
  /// Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [CreateMembershipOrPartnershipInvitesBody] createMembershipOrPartnershipInvitesBody (required):
  Future<CreateInvitesResultsResponseArray?> createMembershipOrPartnershipInvites(String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody, { Future<void>? abortTrigger, }) async {
    final response = await createMembershipOrPartnershipInvitesWithHttpInfo(businessId, createMembershipOrPartnershipInvitesBody, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CreateInvitesResultsResponseArray',) as CreateInvitesResultsResponseArray;
    
    }
    return null;
  }

  /// Get invites/requests
  ///
  /// Get the membership/partnership invites and/or requests for the authorized user.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [bool] isMember:
  ///   A boolean field to indicate whether the invite is to create a partnership or a membership.
  ///
  /// * [List<InviteFilterStatus>] inviteStatus:
  ///   A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
  ///
  /// * [InviteType] inviteType:
  ///   Invite type to filter invites by. Only invites of the specified type will be returned.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> getInvitesWithHttpInfo(String businessId, { bool? isMember, List<InviteFilterStatus>? inviteStatus, InviteType? inviteType, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/invites'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (isMember != null) {
      queryParams.addAll(_queryParams('', 'is_member', isMember));
    }
    if (inviteStatus != null) {
      queryParams.addAll(_queryParams('multi', 'invite_status', inviteStatus));
    }
    if (inviteType != null) {
      queryParams.addAll(_queryParams('', 'invite_type', inviteType));
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

  /// Get invites/requests
  ///
  /// Get the membership/partnership invites and/or requests for the authorized user.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [bool] isMember:
  ///   A boolean field to indicate whether the invite is to create a partnership or a membership.
  ///
  /// * [List<InviteFilterStatus>] inviteStatus:
  ///   A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
  ///
  /// * [InviteType] inviteType:
  ///   Invite type to filter invites by. Only invites of the specified type will be returned.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<GetInvites200Response?> getInvites(String businessId, { bool? isMember, List<InviteFilterStatus>? inviteStatus, InviteType? inviteType, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await getInvitesWithHttpInfo(businessId, isMember: isMember, inviteStatus: inviteStatus, inviteType: inviteType, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetInvites200Response',) as GetInvites200Response;
    
    }
    return null;
  }

  /// Accept or decline an invite/request
  ///
  /// Accept or decline invites or requests.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [AuthRespondInvitesBody] authRespondInvitesBody (required):
  Future<Response> respondBusinessAccessInvitesWithHttpInfo(AuthRespondInvitesBody authRespondInvitesBody, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/invites';

    // ignore: prefer_final_locals
    Object? postBody = authRespondInvitesBody;

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

  /// Accept or decline an invite/request
  ///
  /// Accept or decline invites or requests.
  ///
  /// Parameters:
  ///
  /// * [AuthRespondInvitesBody] authRespondInvitesBody (required):
  Future<RespondToInvitesResponseArray?> respondBusinessAccessInvites(AuthRespondInvitesBody authRespondInvitesBody, { Future<void>? abortTrigger, }) async {
    final response = await respondBusinessAccessInvitesWithHttpInfo(authRespondInvitesBody, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'RespondToInvitesResponseArray',) as RespondToInvitesResponseArray;
    
    }
    return null;
  }
}
