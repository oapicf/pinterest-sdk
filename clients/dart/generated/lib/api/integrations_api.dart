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
  Future<Response> integrationsCommerceDelWithHttpInfo(String externalBusinessId,) async {
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
  Future<void> integrationsCommerceDel(String externalBusinessId,) async {
    final response = await integrationsCommerceDelWithHttpInfo(externalBusinessId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
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
  Future<Response> integrationsCommerceGetWithHttpInfo(String externalBusinessId,) async {
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
  Future<IntegrationMetadata?> integrationsCommerceGet(String externalBusinessId,) async {
    final response = await integrationsCommerceGetWithHttpInfo(externalBusinessId,);
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
  /// * [IntegrationRequestPatch] integrationRequestPatch (required):
  ///   Parameters to get create/update the Integration Metadata
  Future<Response> integrationsCommercePatchWithHttpInfo(String externalBusinessId, IntegrationRequestPatch integrationRequestPatch,) async {
    // ignore: prefer_const_declarations
    final path = r'/integrations/commerce/{external_business_id}'
      .replaceAll('{external_business_id}', externalBusinessId);

    // ignore: prefer_final_locals
    Object? postBody = integrationRequestPatch;

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

  /// Update commerce integration
  ///
  /// Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Parameters:
  ///
  /// * [String] externalBusinessId (required):
  ///   External business ID for the integration.
  ///
  /// * [IntegrationRequestPatch] integrationRequestPatch (required):
  ///   Parameters to get create/update the Integration Metadata
  Future<IntegrationMetadata?> integrationsCommercePatch(String externalBusinessId, IntegrationRequestPatch integrationRequestPatch,) async {
    final response = await integrationsCommercePatchWithHttpInfo(externalBusinessId, integrationRequestPatch,);
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
  /// * [IntegrationRequest] integrationRequest (required):
  ///   Parameters to get create/update the Integration Metadata
  Future<Response> integrationsCommercePostWithHttpInfo(IntegrationRequest integrationRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/integrations/commerce';

    // ignore: prefer_final_locals
    Object? postBody = integrationRequest;

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

  /// Create commerce integration
  ///
  /// Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Parameters:
  ///
  /// * [IntegrationRequest] integrationRequest (required):
  ///   Parameters to get create/update the Integration Metadata
  Future<IntegrationMetadata?> integrationsCommercePost(IntegrationRequest integrationRequest,) async {
    final response = await integrationsCommercePostWithHttpInfo(integrationRequest,);
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
  ///   Integration ID.
  Future<Response> integrationsGetByIdWithHttpInfo(String id,) async {
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
    );
  }

  /// Get integration metadata
  ///
  /// Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Parameters:
  ///
  /// * [String] id (required):
  ///   Integration ID.
  Future<IntegrationRecord?> integrationsGetById(String id,) async {
    final response = await integrationsGetByIdWithHttpInfo(id,);
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
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<Response> integrationsGetListWithHttpInfo({ String? bookmark, int? pageSize, }) async {
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
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<IntegrationsGetList200Response?> integrationsGetList({ String? bookmark, int? pageSize, }) async {
    final response = await integrationsGetListWithHttpInfo( bookmark: bookmark, pageSize: pageSize, );
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
  /// * [IntegrationLogsRequest] integrationLogsRequest (required):
  ///   Ingest log information from external integration application.
  Future<Response> integrationsLogsPostWithHttpInfo(IntegrationLogsRequest integrationLogsRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/integrations/logs';

    // ignore: prefer_final_locals
    Object? postBody = integrationLogsRequest;

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

  /// Receives batched logs from integration applications.
  ///
  /// This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
  ///
  /// Parameters:
  ///
  /// * [IntegrationLogsRequest] integrationLogsRequest (required):
  ///   Ingest log information from external integration application.
  Future<IntegrationLogsSuccessResponse?> integrationsLogsPost(IntegrationLogsRequest integrationLogsRequest,) async {
    final response = await integrationsLogsPostWithHttpInfo(integrationLogsRequest,);
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
