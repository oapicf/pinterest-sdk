//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class BulkApi {
  BulkApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get advertiser entities in bulk
  ///
  /// Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [BulkDownloadRequest] bulkDownloadRequest (required):
  ///   Parameters to get ad entities in bulk
  Future<Response> bulkDownloadCreateWithHttpInfo(String adAccountId, BulkDownloadRequest bulkDownloadRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/bulk/download'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = bulkDownloadRequest;

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

  /// Get advertiser entities in bulk
  ///
  /// Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [BulkDownloadRequest] bulkDownloadRequest (required):
  ///   Parameters to get ad entities in bulk
  Future<BulkDownloadResponse?> bulkDownloadCreate(String adAccountId, BulkDownloadRequest bulkDownloadRequest,) async {
    final response = await bulkDownloadCreateWithHttpInfo(adAccountId, bulkDownloadRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BulkDownloadResponse',) as BulkDownloadResponse;
    
    }
    return null;
  }

  /// Download advertiser entities in bulk
  ///
  /// Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bulkRequestId (required):
  ///   Unique identifier of a bulk upsert request.
  ///
  /// * [bool] includeDetails:
  ///   if set to True then attach the errors/details to all the requests
  Future<Response> bulkRequestGetWithHttpInfo(String adAccountId, String bulkRequestId, { bool? includeDetails, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{bulk_request_id}', bulkRequestId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (includeDetails != null) {
      queryParams.addAll(_queryParams('', 'include_details', includeDetails));
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

  /// Download advertiser entities in bulk
  ///
  /// Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bulkRequestId (required):
  ///   Unique identifier of a bulk upsert request.
  ///
  /// * [bool] includeDetails:
  ///   if set to True then attach the errors/details to all the requests
  Future<BulkUpsertStatusResponse?> bulkRequestGet(String adAccountId, String bulkRequestId, { bool? includeDetails, }) async {
    final response = await bulkRequestGetWithHttpInfo(adAccountId, bulkRequestId,  includeDetails: includeDetails, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BulkUpsertStatusResponse',) as BulkUpsertStatusResponse;
    
    }
    return null;
  }

  /// Create/update ad entities in bulk
  ///
  /// Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [BulkUpsertRequest] bulkUpsertRequest (required):
  ///   Parameters to get create/update ad entities in bulk
  Future<Response> bulkUpsertCreateWithHttpInfo(String adAccountId, BulkUpsertRequest bulkUpsertRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/bulk/upsert'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = bulkUpsertRequest;

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

  /// Create/update ad entities in bulk
  ///
  /// Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [BulkUpsertRequest] bulkUpsertRequest (required):
  ///   Parameters to get create/update ad entities in bulk
  Future<BulkUpsertResponse?> bulkUpsertCreate(String adAccountId, BulkUpsertRequest bulkUpsertRequest,) async {
    final response = await bulkUpsertCreateWithHttpInfo(adAccountId, bulkUpsertRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BulkUpsertResponse',) as BulkUpsertResponse;
    
    }
    return null;
  }
}
