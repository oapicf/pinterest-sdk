//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class PromotionsApi {
  PromotionsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create promotions
  ///
  /// Create multiple new promotions.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<PromotionCreate>] promotionCreate (required):
  Future<Response> promotionsCreateWithHttpInfo(String adAccountId, List<PromotionCreate> promotionCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/promotions'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = promotionCreate;

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

  /// Create promotions
  ///
  /// Create multiple new promotions.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<PromotionCreate>] promotionCreate (required):
  Future<PromotionsResponse?> promotionsCreate(String adAccountId, List<PromotionCreate> promotionCreate, { Future<void>? abortTrigger, }) async {
    final response = await promotionsCreateWithHttpInfo(adAccountId, promotionCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'PromotionsResponse',) as PromotionsResponse;
    
    }
    return null;
  }

  /// Delete promotion by id
  ///
  /// Delete a promotion within Pinterest.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] promotionId (required):
  ///   Promotion ID
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Response> promotionsDeleteWithHttpInfo(String promotionId, String adAccountId, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/promotions/{promotion_id}'
      .replaceAll('{promotion_id}', promotionId)
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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

  /// Delete promotion by id
  ///
  /// Delete a promotion within Pinterest.
  ///
  /// Parameters:
  ///
  /// * [String] promotionId (required):
  ///   Promotion ID
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Promotion?> promotionsDelete(String promotionId, String adAccountId, { Future<void>? abortTrigger, }) async {
    final response = await promotionsDeleteWithHttpInfo(promotionId, adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Promotion',) as Promotion;
    
    }
    return null;
  }

  /// Get promotion by id
  ///
  /// Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] promotionId (required):
  ///   Promotion ID
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Response> promotionsGetWithHttpInfo(String promotionId, String adAccountId, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/promotions/{promotion_id}'
      .replaceAll('{promotion_id}', promotionId)
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

  /// Get promotion by id
  ///
  /// Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
  ///
  /// Parameters:
  ///
  /// * [String] promotionId (required):
  ///   Promotion ID
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Promotion?> promotionsGet(String promotionId, String adAccountId, { Future<void>? abortTrigger, }) async {
    final response = await promotionsGetWithHttpInfo(promotionId, adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Promotion',) as Promotion;
    
    }
    return null;
  }

  /// Get promotions
  ///
  /// Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
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
  Future<Response> promotionsListWithHttpInfo(String adAccountId, { String? bookmark, int? pageSize, PinterestLibPaginationOrder? order, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/promotions'
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

  /// Get promotions
  ///
  /// Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
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
  Future<PromotionsList200Response?> promotionsList(String adAccountId, { String? bookmark, int? pageSize, PinterestLibPaginationOrder? order, Future<void>? abortTrigger, }) async {
    final response = await promotionsListWithHttpInfo(adAccountId, bookmark: bookmark, pageSize: pageSize, order: order, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'PromotionsList200Response',) as PromotionsList200Response;
    
    }
    return null;
  }

  /// Update promotions
  ///
  /// Update multiple promotions.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<PromotionBatchUpdate>] promotionBatchUpdate (required):
  Future<Response> promotionsUpdateWithHttpInfo(String adAccountId, List<PromotionBatchUpdate> promotionBatchUpdate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/promotions'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = promotionBatchUpdate;

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

  /// Update promotions
  ///
  /// Update multiple promotions.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<PromotionBatchUpdate>] promotionBatchUpdate (required):
  Future<PromotionsResponse?> promotionsUpdate(String adAccountId, List<PromotionBatchUpdate> promotionBatchUpdate, { Future<void>? abortTrigger, }) async {
    final response = await promotionsUpdateWithHttpInfo(adAccountId, promotionBatchUpdate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'PromotionsResponse',) as PromotionsResponse;
    
    }
    return null;
  }
}
