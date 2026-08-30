//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class IntegrationsApi {
  IntegrationsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Delete commerce integration
  ///
  /// Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] externalBusinessId (required):
  ///   External business ID for the integration.
  Future<Response> integrationsCommerceDelWithHttpInfo(String externalBusinessId, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/integrations/commerce/{external_business_id}'
      .replaceAll('{external_business_id}', externalBusinessId);

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

  /// Delete commerce integration
  ///
  /// Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Parameters:
  ///
  /// * [String] externalBusinessId (required):
  ///   External business ID for the integration.
  Future<IntegrationMetadata?> integrationsCommerceDel(String externalBusinessId, { Future<void>? abortTrigger, }) async {
    final response = await integrationsCommerceDelWithHttpInfo(externalBusinessId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'IntegrationMetadata',) as IntegrationMetadata;
    
    }
    return null;
  }

  /// Get commerce integration
  ///
  /// Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] externalBusinessId (required):
  ///   External business ID for the integration.
  Future<Response> integrationsCommerceGetWithHttpInfo(String externalBusinessId, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/integrations/commerce/{external_business_id}'
      .replaceAll('{external_business_id}', externalBusinessId);

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

  /// Get commerce integration
  ///
  /// Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Parameters:
  ///
  /// * [String] externalBusinessId (required):
  ///   External business ID for the integration.
  Future<IntegrationMetadata?> integrationsCommerceGet(String externalBusinessId, { Future<void>? abortTrigger, }) async {
    final response = await integrationsCommerceGetWithHttpInfo(externalBusinessId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'IntegrationMetadata',) as IntegrationMetadata;
    
    }
    return null;
  }

  /// Update commerce integration
  ///
  /// Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] externalBusinessId (required):
  ///   External business ID for the integration.
  ///
  /// * [IntegrationMetadataUpdate] integrationMetadataUpdate (required):
  Future<Response> integrationsCommercePatchWithHttpInfo(String externalBusinessId, IntegrationMetadataUpdate integrationMetadataUpdate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/integrations/commerce/{external_business_id}'
      .replaceAll('{external_business_id}', externalBusinessId);

    // ignore: prefer_final_locals
    Object? postBody = integrationMetadataUpdate;

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

  /// Update commerce integration
  ///
  /// Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Parameters:
  ///
  /// * [String] externalBusinessId (required):
  ///   External business ID for the integration.
  ///
  /// * [IntegrationMetadataUpdate] integrationMetadataUpdate (required):
  Future<IntegrationMetadata?> integrationsCommercePatch(String externalBusinessId, IntegrationMetadataUpdate integrationMetadataUpdate, { Future<void>? abortTrigger, }) async {
    final response = await integrationsCommercePatchWithHttpInfo(externalBusinessId, integrationMetadataUpdate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'IntegrationMetadata',) as IntegrationMetadata;
    
    }
    return null;
  }

  /// Create commerce integration
  ///
  /// Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [IntegrationMetadataCreate] integrationMetadataCreate (required):
  Future<Response> integrationsCommercePostWithHttpInfo(IntegrationMetadataCreate integrationMetadataCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/integrations/commerce';

    // ignore: prefer_final_locals
    Object? postBody = integrationMetadataCreate;

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

  /// Create commerce integration
  ///
  /// Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Parameters:
  ///
  /// * [IntegrationMetadataCreate] integrationMetadataCreate (required):
  Future<IntegrationMetadata?> integrationsCommercePost(IntegrationMetadataCreate integrationMetadataCreate, { Future<void>? abortTrigger, }) async {
    final response = await integrationsCommercePostWithHttpInfo(integrationMetadataCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'IntegrationMetadata',) as IntegrationMetadata;
    
    }
    return null;
  }

  /// Get integration metadata
  ///
  /// Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] id (required):
  ///   Integration record ID.
  Future<Response> integrationsGetByIdWithHttpInfo(String id, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/integrations/{id}'
      .replaceAll('{id}', id);

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

  /// Get integration metadata
  ///
  /// Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Parameters:
  ///
  /// * [String] id (required):
  ///   Integration record ID.
  Future<IntegrationRecord?> integrationsGetById(String id, { Future<void>? abortTrigger, }) async {
    final response = await integrationsGetByIdWithHttpInfo(id, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'IntegrationRecord',) as IntegrationRecord;
    
    }
    return null;
  }

  /// Get integration metadata list
  ///
  /// Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> integrationsGetListWithHttpInfo({ String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/integrations';

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

  /// Get integration metadata list
  ///
  /// Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Parameters:
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<IntegrationsGetList200Response?> integrationsGetList({ String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await integrationsGetListWithHttpInfo(bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'IntegrationsGetList200Response',) as IntegrationsGetList200Response;
    
    }
    return null;
  }

  /// Receives batched logs from integration applications.
  ///
  /// This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [IntegrationLogsRequestCreate] integrationLogsRequestCreate (required):
  Future<Response> integrationsLogsPostWithHttpInfo(IntegrationLogsRequestCreate integrationLogsRequestCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/integrations/logs';

    // ignore: prefer_final_locals
    Object? postBody = integrationLogsRequestCreate;

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

  /// Receives batched logs from integration applications.
  ///
  /// This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Parameters:
  ///
  /// * [IntegrationLogsRequestCreate] integrationLogsRequestCreate (required):
  Future<IntegrationLogsSuccessResponse?> integrationsLogsPost(IntegrationLogsRequestCreate integrationLogsRequestCreate, { Future<void>? abortTrigger, }) async {
    final response = await integrationsLogsPostWithHttpInfo(integrationLogsRequestCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'IntegrationLogsSuccessResponse',) as IntegrationLogsSuccessResponse;
    
    }
    return null;
  }
}
