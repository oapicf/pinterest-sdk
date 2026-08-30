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
  /// Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [String] customerListId (required):
  ///   Customer list ID.
  ///
  /// * [CustomerListUploadCreateRequest] customerListUploadCreateRequest (required):
  Future<Response> customerListUploadsCreateWithHttpInfo(String adAccountId, String customerListId, CustomerListUploadCreateRequest customerListUploadCreateRequest, { Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Create customer list upload
  ///
  /// Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [String] customerListId (required):
  ///   Customer list ID.
  ///
  /// * [CustomerListUploadCreateRequest] customerListUploadCreateRequest (required):
  Future<CustomerListUploadCreateResponse?> customerListUploadsCreate(String adAccountId, String customerListId, CustomerListUploadCreateRequest customerListUploadCreateRequest, { Future<void>? abortTrigger, }) async {
    final response = await customerListUploadsCreateWithHttpInfo(adAccountId, customerListId, customerListUploadCreateRequest, abortTrigger: abortTrigger,);
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
  /// Get the metadata for a given upload by its ID.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [String] customerListId (required):
  ///   Customer list ID.
  ///
  /// * [String] customerListUploadId (required):
  ///   Customer List Upload ID.
  Future<Response> customerListUploadsGetWithHttpInfo(String adAccountId, String customerListId, String customerListUploadId, { Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Get customer list upload
  ///
  /// Get the metadata for a given upload by its ID.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [String] customerListId (required):
  ///   Customer list ID.
  ///
  /// * [String] customerListUploadId (required):
  ///   Customer List Upload ID.
  Future<CustomerListUpload?> customerListUploadsGet(String adAccountId, String customerListId, String customerListUploadId, { Future<void>? abortTrigger, }) async {
    final response = await customerListUploadsGetWithHttpInfo(adAccountId, customerListId, customerListUploadId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CustomerListUpload',) as CustomerListUpload;
    
    }
    return null;
  }

  /// Run customer list upload
  ///
  /// Begin processing a customer list upload.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [String] customerListId (required):
  ///   Customer list ID.
  ///
  /// * [String] customerListUploadId (required):
  ///   Customer List Upload ID.
  Future<Response> customerListUploadsRunWithHttpInfo(String adAccountId, String customerListId, String customerListUploadId, { Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Run customer list upload
  ///
  /// Begin processing a customer list upload.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [String] customerListId (required):
  ///   Customer list ID.
  ///
  /// * [String] customerListUploadId (required):
  ///   Customer List Upload ID.
  Future<CustomerListUpload?> customerListUploadsRun(String adAccountId, String customerListId, String customerListUploadId, { Future<void>? abortTrigger, }) async {
    final response = await customerListUploadsRunWithHttpInfo(adAccountId, customerListId, customerListUploadId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CustomerListUpload',) as CustomerListUpload;
    
    }
    return null;
  }
}
