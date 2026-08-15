//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AudiencesApi {
  AudiencesApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create audience
  ///
  /// Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific `audience_ids` when you create an ad group. <p/> Learn about <a href=\"/docs/work-with-targets-and-audiences/create-audiences/\" target=\"_blank\">creating different kinds of audiences</a>.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AudienceCreateRequest] audienceCreateRequest (required):
  ///   List of ads to create, size limit [1, 30]
  Future<Response> audiencesCreateWithHttpInfo(String adAccountId, AudienceCreateRequest audienceCreateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/audiences'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = audienceCreateRequest;

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

  /// Create audience
  ///
  /// Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific `audience_ids` when you create an ad group. <p/> Learn about <a href=\"/docs/work-with-targets-and-audiences/create-audiences/\" target=\"_blank\">creating different kinds of audiences</a>.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AudienceCreateRequest] audienceCreateRequest (required):
  ///   List of ads to create, size limit [1, 30]
  Future<Audience?> audiencesCreate(String adAccountId, AudienceCreateRequest audienceCreateRequest,) async {
    final response = await audiencesCreateWithHttpInfo(adAccountId, audienceCreateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Audience',) as Audience;
    
    }
    return null;
  }

  /// Get audience
  ///
  /// Get a specific audience given the audience ID.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] audienceId (required):
  ///   Unique identifier of an audience
  Future<Response> audiencesGetWithHttpInfo(String adAccountId, String audienceId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/audiences/{audience_id}'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{audience_id}', audienceId);

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

  /// Get audience
  ///
  /// Get a specific audience given the audience ID.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] audienceId (required):
  ///   Unique identifier of an audience
  Future<Audience?> audiencesGet(String adAccountId, String audienceId,) async {
    final response = await audiencesGetWithHttpInfo(adAccountId, audienceId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Audience',) as Audience;
    
    }
    return null;
  }

  /// List audiences
  ///
  /// Get list of audiences for the ad account.
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
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] ownershipType:
  ///   Filter audiences by ownership type.
  Future<Response> audiencesListWithHttpInfo(String adAccountId, { String? bookmark, String? order, int? pageSize, String? ownershipType, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/audiences'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
    if (ownershipType != null) {
      queryParams.addAll(_queryParams('', 'ownership_type', ownershipType));
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

  /// List audiences
  ///
  /// Get list of audiences for the ad account.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] ownershipType:
  ///   Filter audiences by ownership type.
  Future<AudiencesList200Response?> audiencesList(String adAccountId, { String? bookmark, String? order, int? pageSize, String? ownershipType, }) async {
    final response = await audiencesListWithHttpInfo(adAccountId,  bookmark: bookmark, order: order, pageSize: pageSize, ownershipType: ownershipType, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AudiencesList200Response',) as AudiencesList200Response;
    
    }
    return null;
  }

  /// Update audience
  ///
  /// Update (edit or remove) an existing targeting audience.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] audienceId (required):
  ///   Unique identifier of an audience
  ///
  /// * [AudienceUpdateRequest] audienceUpdateRequest (required):
  ///   The audience to be updated.
  Future<Response> audiencesUpdateWithHttpInfo(String adAccountId, String audienceId, AudienceUpdateRequest audienceUpdateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/audiences/{audience_id}'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{audience_id}', audienceId);

    // ignore: prefer_final_locals
    Object? postBody = audienceUpdateRequest;

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

  /// Update audience
  ///
  /// Update (edit or remove) an existing targeting audience.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] audienceId (required):
  ///   Unique identifier of an audience
  ///
  /// * [AudienceUpdateRequest] audienceUpdateRequest (required):
  ///   The audience to be updated.
  Future<Audience?> audiencesUpdate(String adAccountId, String audienceId, AudienceUpdateRequest audienceUpdateRequest,) async {
    final response = await audiencesUpdateWithHttpInfo(adAccountId, audienceId, audienceUpdateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Audience',) as Audience;
    
    }
    return null;
  }
}
