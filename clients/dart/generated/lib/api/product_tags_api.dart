//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ProductTagsApi {
  ProductTagsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Add product tags to pin
  ///
  /// Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///   Unique identifier of the hero pin that will receive product tags.
  ///
  /// * [ProductTagsBulkAddRequest] productTagsBulkAddRequest (required):
  Future<Response> productTagsBulkAddWithHttpInfo(String pinId, ProductTagsBulkAddRequest productTagsBulkAddRequest, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/pins/{pin_id}/product_tags'
      .replaceAll('{pin_id}', pinId);

    // ignore: prefer_final_locals
    Object? postBody = productTagsBulkAddRequest;

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

  /// Add product tags to pin
  ///
  /// Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///   Unique identifier of the hero pin that will receive product tags.
  ///
  /// * [ProductTagsBulkAddRequest] productTagsBulkAddRequest (required):
  Future<ProductTagsResponse?> productTagsBulkAdd(String pinId, ProductTagsBulkAddRequest productTagsBulkAddRequest, { Future<void>? abortTrigger, }) async {
    final response = await productTagsBulkAddWithHttpInfo(pinId, productTagsBulkAddRequest, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProductTagsResponse',) as ProductTagsResponse;
    
    }
    return null;
  }

  /// Delete product tags from pin
  ///
  /// Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///   Unique identifier of the hero pin that will receive product tags.
  ///
  /// * [ProductTagsBulkDeleteRequest] productTagsBulkDeleteRequest (required):
  Future<Response> productTagsBulkDeleteWithHttpInfo(String pinId, ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/pins/{pin_id}/product_tags/bulk-delete'
      .replaceAll('{pin_id}', pinId);

    // ignore: prefer_final_locals
    Object? postBody = productTagsBulkDeleteRequest;

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

  /// Delete product tags from pin
  ///
  /// Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///   Unique identifier of the hero pin that will receive product tags.
  ///
  /// * [ProductTagsBulkDeleteRequest] productTagsBulkDeleteRequest (required):
  Future<void> productTagsBulkDelete(String pinId, ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest, { Future<void>? abortTrigger, }) async {
    final response = await productTagsBulkDeleteWithHttpInfo(pinId, productTagsBulkDeleteRequest, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Get product tags for pin
  ///
  /// Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///   Unique identifier of the hero pin that will receive product tags.
  Future<Response> productTagsListWithHttpInfo(String pinId, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/pins/{pin_id}/product_tags'
      .replaceAll('{pin_id}', pinId);

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

  /// Get product tags for pin
  ///
  /// Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///   Unique identifier of the hero pin that will receive product tags.
  Future<ProductTagsResponse?> productTagsList(String pinId, { Future<void>? abortTrigger, }) async {
    final response = await productTagsListWithHttpInfo(pinId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProductTagsResponse',) as ProductTagsResponse;
    
    }
    return null;
  }
}
