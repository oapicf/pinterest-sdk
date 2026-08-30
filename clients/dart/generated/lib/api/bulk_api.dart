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
  /// Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [BulkDownloadCreate] bulkDownloadCreate (required):
  Future<Response> bulkDownloadCreateWithHttpInfo(String adAccountId, BulkDownloadCreate bulkDownloadCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/bulk/download'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = bulkDownloadCreate;

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

  /// Get advertiser entities in bulk
  ///
  /// Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [BulkDownloadCreate] bulkDownloadCreate (required):
  Future<BulkDownload?> bulkDownloadCreate(String adAccountId, BulkDownloadCreate bulkDownloadCreate, { Future<void>? abortTrigger, }) async {
    final response = await bulkDownloadCreateWithHttpInfo(adAccountId, bulkDownloadCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BulkDownload',) as BulkDownload;
    
    }
    return null;
  }

  /// Download advertiser entities in bulk
  ///
  /// Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bulkRequestId (required):
  ///   Bulk request ID that is from one of the entities bulk endpoints
  ///
  /// * [bool] includeDetails:
  ///   If set to True then attach the errors/details to all the requests
  Future<Response> bulkRequestGetWithHttpInfo(String adAccountId, String bulkRequestId, { bool? includeDetails, Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Download advertiser entities in bulk
  ///
  /// Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bulkRequestId (required):
  ///   Bulk request ID that is from one of the entities bulk endpoints
  ///
  /// * [bool] includeDetails:
  ///   If set to True then attach the errors/details to all the requests
  Future<BulkJobData?> bulkRequestGet(String adAccountId, String bulkRequestId, { bool? includeDetails, Future<void>? abortTrigger, }) async {
    final response = await bulkRequestGetWithHttpInfo(adAccountId, bulkRequestId, includeDetails: includeDetails, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BulkJobData',) as BulkJobData;
    
    }
    return null;
  }

  /// Create/update ad entities in bulk
  ///
  /// Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
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
  Future<Response> bulkUpsertCreateWithHttpInfo(String adAccountId, BulkUpsertRequest bulkUpsertRequest, { Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Create/update ad entities in bulk
  ///
  /// Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [BulkUpsertRequest] bulkUpsertRequest (required):
  ///   Parameters to get create/update ad entities in bulk
  Future<BulkUpsertResponse?> bulkUpsertCreate(String adAccountId, BulkUpsertRequest bulkUpsertRequest, { Future<void>? abortTrigger, }) async {
    final response = await bulkUpsertCreateWithHttpInfo(adAccountId, bulkUpsertRequest, abortTrigger: abortTrigger,);
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
