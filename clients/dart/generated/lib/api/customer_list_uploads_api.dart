//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CustomerListUploadsApi {
  CustomerListUploadsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create customer list upload
  ///
  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] customerListId (required):
  ///   Unique identifier of a customer list
  ///
  /// * [CustomerListUploadCreateRequest] customerListUploadCreateRequest (required):
  ///   Parameters to create a customer list upload request
  Future<Response> customerListUploadsCreateWithHttpInfo(String adAccountId, String customerListId, CustomerListUploadCreateRequest customerListUploadCreateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{customer_list_id}', customerListId);

    // ignore: prefer_final_locals
    Object? postBody = customerListUploadCreateRequest;

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

  /// Create customer list upload
  ///
  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] customerListId (required):
  ///   Unique identifier of a customer list
  ///
  /// * [CustomerListUploadCreateRequest] customerListUploadCreateRequest (required):
  ///   Parameters to create a customer list upload request
  Future<CustomerListUploadCreateResponse?> customerListUploadsCreate(String adAccountId, String customerListId, CustomerListUploadCreateRequest customerListUploadCreateRequest,) async {
    final response = await customerListUploadsCreateWithHttpInfo(adAccountId, customerListId, customerListUploadCreateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CustomerListUploadCreateResponse',) as CustomerListUploadCreateResponse;
    
    }
    return null;
  }

  /// Get customer list upload
  ///
  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] customerListId (required):
  ///   Unique identifier of a customer list
  ///
  /// * [String] customerListUploadId (required):
  ///   Unique identifier of a customer list upload
  Future<Response> customerListUploadsGetWithHttpInfo(String adAccountId, String customerListId, String customerListUploadId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{customer_list_id}', customerListId)
      .replaceAll('{customer_list_upload_id}', customerListUploadId);

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

  /// Get customer list upload
  ///
  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] customerListId (required):
  ///   Unique identifier of a customer list
  ///
  /// * [String] customerListUploadId (required):
  ///   Unique identifier of a customer list upload
  Future<CustomerListUploadResponse?> customerListUploadsGet(String adAccountId, String customerListId, String customerListUploadId,) async {
    final response = await customerListUploadsGetWithHttpInfo(adAccountId, customerListId, customerListUploadId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CustomerListUploadResponse',) as CustomerListUploadResponse;
    
    }
    return null;
  }

  /// Run customer list upload
  ///
  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] customerListId (required):
  ///   Unique identifier of a customer list
  ///
  /// * [String] customerListUploadId (required):
  ///   Unique identifier of a customer list upload
  Future<Response> customerListUploadsRunWithHttpInfo(String adAccountId, String customerListId, String customerListUploadId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{customer_list_id}', customerListId)
      .replaceAll('{customer_list_upload_id}', customerListUploadId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


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

  /// Run customer list upload
  ///
  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] customerListId (required):
  ///   Unique identifier of a customer list
  ///
  /// * [String] customerListUploadId (required):
  ///   Unique identifier of a customer list upload
  Future<CustomerListUploadResponse?> customerListUploadsRun(String adAccountId, String customerListId, String customerListUploadId,) async {
    final response = await customerListUploadsRunWithHttpInfo(adAccountId, customerListId, customerListUploadId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CustomerListUploadResponse',) as CustomerListUploadResponse;
    
    }
    return null;
  }
}
