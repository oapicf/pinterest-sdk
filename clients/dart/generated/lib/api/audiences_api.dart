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
  /// Create a new audience for the ad account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdAccountsAudienceCreate] adAccountsAudienceCreate (required):
  Future<Response> audiencesCreateWithHttpInfo(String adAccountId, AdAccountsAudienceCreate adAccountsAudienceCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/audiences'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = adAccountsAudienceCreate;

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

  /// Create audience
  ///
  /// Create a new audience for the ad account.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdAccountsAudienceCreate] adAccountsAudienceCreate (required):
  Future<AdAccountsAudience?> audiencesCreate(String adAccountId, AdAccountsAudienceCreate adAccountsAudienceCreate, { Future<void>? abortTrigger, }) async {
    final response = await audiencesCreateWithHttpInfo(adAccountId, adAccountsAudienceCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdAccountsAudience',) as AdAccountsAudience;
    
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
  /// * [String] audienceId (required):
  ///   Audience ID.
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Response> audiencesGetWithHttpInfo(String audienceId, String adAccountId, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/audiences/{audience_id}'
      .replaceAll('{audience_id}', audienceId)
      .replaceAll('{ad_account_id}', adAccountId);

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
      abortTrigger: abortTrigger,
    );
  }

  /// Get audience
  ///
  /// Get a specific audience given the audience ID.
  ///
  /// Parameters:
  ///
  /// * [String] audienceId (required):
  ///   Audience ID.
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<AdAccountsAudience?> audiencesGet(String audienceId, String adAccountId, { Future<void>? abortTrigger, }) async {
    final response = await audiencesGetWithHttpInfo(audienceId, adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdAccountsAudience',) as AdAccountsAudience;
    
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
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  ///
  /// * [PinterestLibPaginationOrder] order:
  ///   The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [AudienceOwnershipType] ownershipType:
  ///
  /// * [bool] excludeNca:
  ///   When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).
  Future<Response> audiencesListWithHttpInfo(String adAccountId, { String? bookmark, int? pageSize, PinterestLibPaginationOrder? order, AudienceOwnershipType? ownershipType, bool? excludeNca, Future<void>? abortTrigger, }) async {
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
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (ownershipType != null) {
      queryParams.addAll(_queryParams('', 'ownership_type', ownershipType));
    }
    if (excludeNca != null) {
      queryParams.addAll(_queryParams('', 'exclude_nca', excludeNca));
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
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  ///
  /// * [PinterestLibPaginationOrder] order:
  ///   The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [AudienceOwnershipType] ownershipType:
  ///
  /// * [bool] excludeNca:
  ///   When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).
  Future<AudiencesList200Response?> audiencesList(String adAccountId, { String? bookmark, int? pageSize, PinterestLibPaginationOrder? order, AudienceOwnershipType? ownershipType, bool? excludeNca, Future<void>? abortTrigger, }) async {
    final response = await audiencesListWithHttpInfo(adAccountId, bookmark: bookmark, pageSize: pageSize, order: order, ownershipType: ownershipType, excludeNca: excludeNca, abortTrigger: abortTrigger,);
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
  /// Update an existing audience for the ad account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] audienceId (required):
  ///   Audience ID.
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdAccountsAudienceUpdate] adAccountsAudienceUpdate (required):
  Future<Response> audiencesUpdateWithHttpInfo(String audienceId, String adAccountId, AdAccountsAudienceUpdate adAccountsAudienceUpdate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/audiences/{audience_id}'
      .replaceAll('{audience_id}', audienceId)
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = adAccountsAudienceUpdate;

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

  /// Update audience
  ///
  /// Update an existing audience for the ad account.
  ///
  /// Parameters:
  ///
  /// * [String] audienceId (required):
  ///   Audience ID.
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdAccountsAudienceUpdate] adAccountsAudienceUpdate (required):
  Future<AdAccountsAudience?> audiencesUpdate(String audienceId, String adAccountId, AdAccountsAudienceUpdate adAccountsAudienceUpdate, { Future<void>? abortTrigger, }) async {
    final response = await audiencesUpdateWithHttpInfo(audienceId, adAccountId, adAccountsAudienceUpdate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdAccountsAudience',) as AdAccountsAudience;
    
    }
    return null;
  }
}
