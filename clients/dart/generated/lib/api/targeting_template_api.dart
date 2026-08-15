//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class TargetingTemplateApi {
  TargetingTemplateApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create targeting templates
  ///
  /// <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [TargetingTemplateCreate] targetingTemplateCreate (required):
  ///   targeting template creation entity
  Future<Response> targetingTemplateCreateWithHttpInfo(String adAccountId, TargetingTemplateCreate targetingTemplateCreate,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/targeting_templates'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = targetingTemplateCreate;

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

  /// Create targeting templates
  ///
  /// <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [TargetingTemplateCreate] targetingTemplateCreate (required):
  ///   targeting template creation entity
  Future<TargetingTemplateGetResponseData?> targetingTemplateCreate(String adAccountId, TargetingTemplateCreate targetingTemplateCreate,) async {
    final response = await targetingTemplateCreateWithHttpInfo(adAccountId, targetingTemplateCreate,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'TargetingTemplateGetResponseData',) as TargetingTemplateGetResponseData;
    
    }
    return null;
  }

  /// List targeting templates
  ///
  /// Get a list of the targeting templates in the specified <code>ad_account_id</code>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [bool] includeSizing:
  ///   Include audience sizing in result or not
  ///
  /// * [String] searchQuery:
  ///   Search keyword for targeting templates
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<Response> targetingTemplateListWithHttpInfo(String adAccountId, { String? order, bool? includeSizing, String? searchQuery, int? pageSize, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/targeting_templates'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (includeSizing != null) {
      queryParams.addAll(_queryParams('', 'include_sizing', includeSizing));
    }
    if (searchQuery != null) {
      queryParams.addAll(_queryParams('', 'search_query', searchQuery));
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

  /// List targeting templates
  ///
  /// Get a list of the targeting templates in the specified <code>ad_account_id</code>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [bool] includeSizing:
  ///   Include audience sizing in result or not
  ///
  /// * [String] searchQuery:
  ///   Search keyword for targeting templates
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<TargetingTemplateList200Response?> targetingTemplateList(String adAccountId, { String? order, bool? includeSizing, String? searchQuery, int? pageSize, String? bookmark, }) async {
    final response = await targetingTemplateListWithHttpInfo(adAccountId,  order: order, includeSizing: includeSizing, searchQuery: searchQuery, pageSize: pageSize, bookmark: bookmark, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'TargetingTemplateList200Response',) as TargetingTemplateList200Response;
    
    }
    return null;
  }

  /// Update targeting templates
  ///
  /// <p>Update the targeting template given advertiser ID and targeting template ID</p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [TargetingTemplateUpdateRequest] targetingTemplateUpdateRequest (required):
  ///   Operation type and targeting template ID
  Future<Response> targetingTemplateUpdateWithHttpInfo(String adAccountId, TargetingTemplateUpdateRequest targetingTemplateUpdateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/targeting_templates'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = targetingTemplateUpdateRequest;

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

  /// Update targeting templates
  ///
  /// <p>Update the targeting template given advertiser ID and targeting template ID</p>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [TargetingTemplateUpdateRequest] targetingTemplateUpdateRequest (required):
  ///   Operation type and targeting template ID
  Future<void> targetingTemplateUpdate(String adAccountId, TargetingTemplateUpdateRequest targetingTemplateUpdateRequest,) async {
    final response = await targetingTemplateUpdateWithHttpInfo(adAccountId, targetingTemplateUpdateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }
}
